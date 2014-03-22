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

package org.bwgz.freebase.sample;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.freebase.Freebase;
import com.google.api.services.freebase.model.TopicLookup;
import com.google.api.services.freebase.model.TopicLookup.Property;
import com.google.api.services.freebase.model.TopicPropertyValue;
import com.google.api.services.freebase.model.TopicValue;
import com.google.api.services.freebase.model.TopicValue.Citation;

public class TopicTest {
	static private final String applicationName = TopicTest.class.getName();
	
	static private final String TYPE_OBJECT_NAME				= "/type/object/name";
	static private final String COMMON_TOPIC_DESCRIPTION		= "/common/topic/description";
	static private final String COMMON_TOPIC_IMAGE				= "/common/topic/image";
	static private final String PEOPLE_PERSON_QUOTATIONS		= "/people/person/quotations";
	static private final String MEDIA_COMMON_QUOTATION_AUTHOR	= "/media_common/quotation/author";
	
	static private final String[] personFilters = { TYPE_OBJECT_NAME, COMMON_TOPIC_DESCRIPTION, PEOPLE_PERSON_QUOTATIONS, COMMON_TOPIC_IMAGE };
	private static final String[] quotationFilters = { TYPE_OBJECT_NAME, MEDIA_COMMON_QUOTATION_AUTHOR };

	public static void test1(Freebase freebase) {
	    try {
	        Freebase.Topic.Lookup lookup = freebase.topic().lookup(Arrays.asList("/m/0jcx"));
	        TopicLookup topic = lookup.execute();
	        System.out.println(topic.toPrettyString());
	    } catch (Exception e) {
	        e.printStackTrace();
	    } 
	}
	
	public static void test2(Freebase freebase) {
	    try {
	        Freebase.Topic.Lookup lookup = freebase.topic().lookup(Arrays.asList("/m/081k8"));
	        lookup.setFilter(Arrays.asList(new String[] { "/common/topic/description" }));
	        TopicLookup topic = lookup.execute();
	        System.out.println(topic.toPrettyString());
	        
			Property property = topic.getProperty();
			Map<String, ?> tpv = (Map<String, ?>) property.get("/common/topic/description");
			List<Map<String, ?>> values = (List<Map<String, ?>>) tpv.get("values");
			for (Map<String, ?> value : values) {
				for (String key : value.keySet()) {
					System.out.printf("\t %s: %s\n", key, value.get(key).toString());
				}
			}
	    } catch (Exception e) {
	        e.printStackTrace();
	    } 
	}
	
	public static void test3(Freebase freebase) {
	    try {
	        Freebase.Topic.Lookup lookup = freebase.topic().lookup(Arrays.asList("/m/0jcx"));
	        lookup.setFilter(Arrays.asList(personFilters));
	        TopicLookup topic = lookup.execute();
	        System.out.println(topic.toPrettyString());
	        
			System.out.printf("id: %s\n", topic.getId());
	        
			Property property = topic.getProperty();
			System.out.printf("property: %s\n", property.getClass());
			TopicPropertyValue pv = (TopicPropertyValue) property.get("/common/topic/description");
			System.out.printf("\t pv: %s\n", pv.getClass());
			System.out.printf("\t\t value type: %s\n", pv.getValueType());
			System.out.printf("\t\t count: %f\n", pv.getCount());
			List<TopicValue> values = pv.getValues();
			for (TopicValue value : values) {
				System.out.printf("\t\t creator: %s\n", value.getCreator());
				System.out.printf("\t\t lang: %s\n", value.getLang());
				System.out.printf("\t\t text: %s\n", value.getText());
				System.out.printf("\t\t time stamp: %s\n", value.getTimestamp());
				System.out.printf("\t\t value: %s\n", value.getValue());
				
				Citation citation = value.getCitation();
				System.out.printf("\t\t\t citation provider: %s\n", citation.getProvider());
				System.out.printf("\t\t\t citation statement: %s\n", citation.getStatement());
				System.out.printf("\t\t\t citation uri: %s\n", citation.getUri());
			}

			
	    } catch (Exception e) {
	        e.printStackTrace();
	    } 
	}

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
	    
	    //test1(freebase);
	    //test2(freebase);
	    test3(freebase);
	}
}
