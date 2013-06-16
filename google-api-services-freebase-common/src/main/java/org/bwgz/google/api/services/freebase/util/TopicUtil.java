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
package org.bwgz.google.api.services.freebase.util;

import java.util.List;

import com.google.api.services.freebase.model.TopicLookup;
import com.google.api.services.freebase.model.TopicLookup.Property;
import com.google.api.services.freebase.model.TopicPropertyvalue;
import com.google.api.services.freebase.model.TopicValue;

import org.bwgz.google.api.services.freebase.model.ValueType;

public class TopicUtil {
	
	static public Object getPropertyValue(TopicValue value, String key) {
		return value != null ? value.get(key) : null;
	}
	
	static public Object getPropertyValue(TopicPropertyvalue topicPropertyvalue, int index, String key) {
		return topicPropertyvalue != null ? getPropertyValue(topicPropertyvalue.getValues().get(index), key) : null;
	}

	static public List<TopicValue> getPropertyValues(TopicPropertyvalue topicPropertyvalue) {
		return topicPropertyvalue != null ? topicPropertyvalue.getValues() : null;
	}

	static public Object getPropertyValue(Property property, String name, int index, String key) {
		return property != null ? getPropertyValue(property.get(name), index, key) : null;
	}

	static public List<TopicValue> getPropertyValues(Property property, String name) {
		return property != null ? getPropertyValues(property.get(name)) : null;
	}

	static public Object getPropertyValue(TopicLookup topic, String name, int index, String key) {
		return getPropertyValue(topic.getProperty(), name, index, key);
	}
	
	static public List<TopicValue> getPropertyValues(TopicLookup topic, String name) {
		return getPropertyValues(topic.getProperty(), name);
	}

	static public Object getPropertyValue(TopicPropertyvalue topicPropertyvalue, int index) {
		return topicPropertyvalue != null ? getPropertyValue(topicPropertyvalue.getValues().get(index), ValueType.valueOf(topicPropertyvalue.getValuetype().toUpperCase()).getKey()) : null;
	}

	static public Object getPropertyValue(Property property, String name, int index) {
		return property != null ? getPropertyValue(property.get(name), index) : null;
	}
	
	static public Object getPropertyValue(TopicLookup topic, String name, int index) {
		return getPropertyValue(topic.getProperty(), name, index);
	}
	
	static public Object getFirstPropertyValue(TopicLookup topic, String name) {
		return getPropertyValue(topic.getProperty(), name, 0);
	}

	private static String getPropertyValueType(TopicPropertyvalue topicPropertyvalue) {
		return topicPropertyvalue != null ? topicPropertyvalue.getValuetype() : null;
	}
	
	private static String getPropertyValueType(Property property, String name) {
		return property != null ? getPropertyValueType(property.get(name)) : null;
	}

	public static String getPropertyValueType(TopicLookup topic, String name) {
		return getPropertyValueType(topic.getProperty(), name);
	}

}
