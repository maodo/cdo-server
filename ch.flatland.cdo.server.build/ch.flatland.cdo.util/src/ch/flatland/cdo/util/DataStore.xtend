/*
 * Copyright (c) 2014 Robert Blust (Z�rich, Switzerland) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Robert Blust - initial API and implementation
 */
package ch.flatland.cdo.util

import java.util.List
import javax.servlet.http.HttpServletRequest
import org.eclipse.emf.cdo.CDOObject
import org.eclipse.emf.cdo.server.IRepository
import org.eclipse.emf.cdo.server.db.IDBStore
import org.eclipse.emf.cdo.server.db.mapping.IMappingStrategy
import org.eclipse.emf.cdo.view.CDOView
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EObject
import org.eclipse.net4j.util.container.IPluginContainer
import org.slf4j.LoggerFactory

class DataStore {
	val logger = LoggerFactory.getLogger(this.class)

	val extension Request = new Request
	val extension EMF = new EMF

	def findByType(CDOView view, String type, HttpServletRequest req) {
		
		// TODO sql depends on mapping strategy
		val List<EObject> result = newArrayList

		val eClass = view.safeEClass(type)
		val mappingStrategy = view.mappingStrategy

		val query = view.createQuery("sql", "SELECT CDO_ID FROM " + mappingStrategy.getTableName(eClass) + " WHERE (CDO_REVISED = 0 AND CDO_VERSION > 0)" + eClass.filterQuery(req, mappingStrategy) + eClass.orderBy(req, mappingStrategy))
		logger.debug("Execute '{}' query '{}'", query.queryLanguage, query.queryString)
		val iterator = query.getResultAsync(typeof(CDOObject))
		while(iterator.hasNext) {
			val obj = iterator.next
			logger.debug("Found '{}'", obj)
			result.add(obj)
		}
		iterator.close

		// TODO should an empty list be returned or Status 404?
		return result
	}

	def private filterQuery(EClass eClass, HttpServletRequest req, IMappingStrategy mappingStrategy) {
		val builder = new StringBuilder
		var kind = "AND"
		if(req.xor) {
			kind = "OR"
		}
		val params = req.parameterNameAsListValueNotNull
		for (paramName : params) {
			val attribute = eClass.getAttribute(paramName)		
			if(attribute != null) {
				logger.debug("Parameter name for filter '{}'", paramName)
				for (value : req.parameterMap.get(paramName)) {
					builder.append(" " + kind + " LOWER(" + mappingStrategy.getFieldName(attribute) + ") LIKE '%" + attribute.getValue(value).toLowerCase + "%'")
				}
			}
		}
		if(req.xor && builder.length > 0) {
			return builder.toString.replaceFirst("OR ", "AND (") + ")"
		}
		return builder.toString
	}

	def private orderBy(EClass eClass, HttpServletRequest req, IMappingStrategy mappingStrategy) {
		if (req.orderBy != null && eClass.getAttribute(req.orderBy) != null) {
			return " ORDER BY " + mappingStrategy.getFieldName(eClass.getAttribute(req.orderBy))
		}
		if(eClass.nameAttribute != null) {
			return " ORDER BY NAME"
		}
		return ""
	}
	
	def private getMappingStrategy(CDOView view) {
		val repoName = view.session.repositoryInfo.name
		val repo = IPluginContainer.INSTANCE.elements.filter[it instanceof IRepository && (it as IRepository).name == repoName].head
		val store = (repo as IRepository).store as IDBStore
		return store.mappingStrategy
	}
	
	def private getValue(EAttribute attribute, String value) {
		if(attribute.EAttributeType instanceof EEnum) {
			val enum = attribute.EAttributeType as EEnum
			for (literal : enum.ELiterals) {
				if (literal.name == value) {
					return literal.value.toString
				}
			}
			return "-1"
		} else {
			return value
		}
	}
}
