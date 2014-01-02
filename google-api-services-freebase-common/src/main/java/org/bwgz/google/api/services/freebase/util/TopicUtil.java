/*
 * Copyright (C) 2014 bwgz.org
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
package org.bwgz.google.api.services.freebase.util;

import java.util.List;
import java.util.Map;

import com.google.api.services.freebase.model.TopicLookup;
import com.google.api.services.freebase.model.TopicLookup.Property;

public class TopicUtil {
	
	@SuppressWarnings("unchecked")
	public static Map<String, ?> getProperty(Property property, String name) {
		return (Map<String, ?>) property.get(name);
	}

	public static Map<String, ?> getProperty(TopicLookup response, String name) {
		return getProperty(response.getProperty(), name);
	}

	@SuppressWarnings("unchecked")
	public static List<Map<String, ?>> getPropertyValues(Property property, String name) {
		return (List<Map<String, ?>>) getProperty(property, name).get("values");
	}
	
	public static List<Map<String, ?>> getPropertyValues(TopicLookup response, String name) {
		return getPropertyValues(response.getProperty(), name);
	}

}
