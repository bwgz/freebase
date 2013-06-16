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

package org.bwgz.freebase.sample;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.freebase.Freebase;
import com.google.api.services.freebase.model.TopicLookup;
import com.google.api.services.freebase.model.TopicLookup.Property;
import com.google.api.services.freebase.model.TopicPropertyvalue;
import com.google.api.services.freebase.model.TopicValue;

public class TopicTest {
	static private final String applicationName = TopicTest.class.getName();

	public static void test1(Freebase freebase) {
	    ArrayList<String> list = new ArrayList<String>();
	    try {
	        list.add("/m/0jcx");
	        Freebase.Topic.Lookup lookup = freebase.topic().lookup(list);
	        TopicLookup topic = lookup.execute();
	        System.out.println(topic.toPrettyString());
	    } catch (Exception e) {
	        e.printStackTrace();
	    } 
	}
	
	public static void test2(Freebase freebase) {
	    ArrayList<String> list = new ArrayList<String>();
	    try {
	        list.add("/m/081k8"); // William Shakespeare
	        Freebase.Topic.Lookup lookup = freebase.topic().lookup(list);
	        lookup.setFilter(Arrays.asList(new String[] { "/common/topic/description" }));
	        TopicLookup topic = lookup.execute();
	        System.out.println(topic.toPrettyString());
	        
			Property property = topic.getProperty();
			TopicPropertyvalue tpv = property.get("/common/topic/description");
			System.out.printf("value type: %s\n", tpv.getValuetype());
			for (TopicValue value: tpv.getValues()) {
				for (String key : value.keySet()) {
					System.out.printf("\t %s: %s\n", key, value.get(key).toString());
				}
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
	    
	    test1(freebase);
	    test2(freebase);
	}
}
