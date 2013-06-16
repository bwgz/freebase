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

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.bwgz.google.api.services.freebase.FreebaseTest;
import org.bwgz.google.api.services.freebase.model.ValueType;

import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.freebase.Freebase;
import com.google.api.services.freebase.model.TopicLookup;
import com.google.api.services.freebase.model.TopicValue;
import com.google.api.services.freebase.model.TopicValue.Citation;

public class PersonSample {
	static private final String applicationName = FreebaseTest.class.getName();
	
	static private final String TYPE_OBJECT_NAME			= "/type/object/name";
	static private final String COMMON_TOPIC_DESCRIPTION	= "/common/topic/description";
	
	static private final String[] filters = { TYPE_OBJECT_NAME, COMMON_TOPIC_DESCRIPTION };

	public static void main(String[] args) {
	    HttpTransport httpTransport = new NetHttpTransport();
	    JsonFactory jsonFactory = new JacksonFactory();
	    HttpRequestInitializer httpRequestInitializer = new HttpRequestInitializer() {

			@Override
			public void initialize(HttpRequest request) throws IOException {
			}
	    };
	    
	    Freebase.Builder fbb = new  Freebase.Builder(httpTransport, jsonFactory, httpRequestInitializer);
	    fbb.setApplicationName(applicationName);
	    Freebase freebase = fbb.build();
	    
		try {
			Freebase.Topic.Lookup lookup = freebase.topic().lookup(Arrays.asList("/m/081k8"));	// William Shakespeare
			lookup.setFilter(Arrays.asList(filters));
			TopicLookup topic = lookup.execute();
			
			System.out.println(topic.toPrettyString());
			String id = topic.getId();
			System.out.printf("id: %s\n", id);
			
			String name = (String) TopicUtil.getFirstPropertyValue(topic, TYPE_OBJECT_NAME);
			System.out.printf("\t name: %s\n", name);
			
			String description = (String) TopicUtil.getFirstPropertyValue(topic, COMMON_TOPIC_DESCRIPTION);
			System.out.printf("\t description: %s\n", description);
			
			List<TopicValue> values = TopicUtil.getPropertyValues(topic, COMMON_TOPIC_DESCRIPTION);
			if (values == null) {
				System.out.printf("\t there are no descriptons\n");
			}
			else {
				String valueType = TopicUtil.getPropertyValueType(topic, COMMON_TOPIC_DESCRIPTION);
				System.out.printf("\t description value type: %s\n", valueType);
				
				for (TopicValue value : values) {
					System.out.printf("\t text: %s\n",  value.getText());
					System.out.printf("\t value: %s\n", value.getValue());
					String key = ValueType.valueOf(valueType.toUpperCase()).getKey();
					System.out.printf("\t value[\"%s\"]: %s\n", key, value.get(key));
					
					Citation citation = value.getCitation();
					if (citation == null) {
						System.out.printf("\t\t no citiation\n");
					}
					else {
						System.out.printf("\t\t citiation provider: %s\n", citation.getProvider());
						System.out.printf("\t\t citiation statement: %s\n", citation.getStatement());
						System.out.printf("\t\t citiation uri: %s\n", citation.getUri());
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
