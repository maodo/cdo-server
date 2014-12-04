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
package ch.flatland.cdo.service.repoaccess

import ch.flatland.cdo.util.EMF
import ch.flatland.cdo.util.FlatlandException
import ch.flatland.cdo.util.Request
import ch.flatland.cdo.util.Response
import ch.flatland.cdo.util.View
import java.util.List
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import org.slf4j.LoggerFactory
import org.eclipse.emf.cdo.CDOObject

class Put {

	val logger = LoggerFactory.getLogger(this.class)

	val extension Request = new Request
	val extension Response = new Response
	val extension EMF = new EMF
	val extension View = new View

	/*
	 * Sample json request body
	 * {
	 *		"put": "elements",
	 *		"type": "base.FLPackage",
	 *			"attributes": {
	 *				"name": "New Child"
	 *			}
	 * }
	 * 
	 */
	def void run(HttpServletRequest req, HttpServletResponse resp) {

		val extension JsonConverter = req.createJsonConverter

		val view = SessionFactory.getCDOSession(req).openTransaction
		var String jsonString = null

		try {
			val body = req.safeReadBody
			logger.debug("Run for '{}' with body '{}'", req.userId, body)

			val jsonObject = body.safeFromJson
			val put = jsonObject.safeResolvePut
			val type = jsonObject.safeResolveType

			val requestedObject = view.safeRequestResource(req) as CDOObject

			logger.debug("Object '{}' loaded type of {}", requestedObject.cdoID, requestedObject.eClass.type)

			requestedObject.safeCanWrite

			val newObject = view.safeCreateType(type.value.asString)

			val eReference = requestedObject.eClass.EAllReferences.filter[it.name == put.value.asString].head

			if (eReference == null) {
				throw new FlatlandException('''Object '�requestedObject.cdoID�' does not support '�put�' ''',
					HttpServletResponse.SC_BAD_REQUEST)
			}
			if (!eReference.isContainmentSettable) {
				throw new FlatlandException('''Feature '�put.value�' is not a containment''',
					HttpServletResponse.SC_BAD_REQUEST)
			}

			jsonObject.toEObject = newObject

			if (eReference.many) {
				val objects = requestedObject.eGet(eReference) as List<Object>
				objects.add(newObject)
			} else {
				requestedObject.eSet(eReference, newObject)
			}

			view.commit

			// now transform manipulated object to json for the reponse			
			jsonString = requestedObject.safeToJson
		} catch (FlatlandException e) {
			resp.status = e.httpStatus
			jsonString = e.safeToJson
			logger.error("Request failed", e)
		} finally {
			if (!view.closed) {
				view.close
			}
		}
		resp.status = HttpServletResponse.SC_CREATED
		resp.writeResponse(req, jsonString)
	}
}
