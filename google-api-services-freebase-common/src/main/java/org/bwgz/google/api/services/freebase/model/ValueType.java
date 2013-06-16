/*
 * Copyright (C) 2013 bwgz.org
 * 
 * This program is free software for use, reproduction, and distribution
 * under the terms of the:
 * 
 *   Apache License, Version 2.0
 *   http://www.apache.org/licenses
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  
 */
package org.bwgz.google.api.services.freebase.model;

/*
 * A domain has a "property value". The value's type is denoted in valuetype. 
 * The value type is also an inferred reference (key) to which object in the
 * value map contains the "property value".
 * 
 * "/people/person/weight_kg": {
 *    "valuetype": "float",
 *    "values": [
 *     {
 *     "text": "80.0",
 *     "lang": "en",
 *     "value": 80.0,
 *     "creator": "/user/dtoprak",
 *     "timestamp": "2008-08-14T11:52:42.000Z"
 *     }
 *    ],
 *    "count": 1.0
 * }
 */
public enum ValueType {
    FLOAT("value"), INT("value"), BOOL("value"), DATETIME("value"), URI("value"), STRING("value"), OBJECT("id"), KEY("value"), COMPOUND("property");
    
    private String key;
    
    ValueType(String key) {
    	this.key = key;
    }

	public String getKey() {
		return key;
	}
}