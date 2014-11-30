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

import java.lang.Exception

class FlatlandException extends Exception {

	val public static STATUS_NOK = "NOK"
	var int httpStatus

	new(String message, int httpStatus) {
		super(message)
		this.httpStatus = httpStatus
	}
	
	def getHttpStatus() {
		httpStatus
	}
}
