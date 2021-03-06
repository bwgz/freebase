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

import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.freebase.Freebase;
import com.google.api.services.freebase.model.TopicLookup;
import com.google.api.services.freebase.model.TopicLookup.Property;

public class StatusTest {
	static private final String applicationName = StatusTest.class.getName();

	public static void test1(Freebase freebase) {
	    try {
	        Freebase.Topic.Lookup lookup = freebase.topic().lookup(Arrays.asList("/m/xxx"));
	        lookup.setFilter(Arrays.asList(new String[] { "/common/topic/description" }));
	        //lookup.setKey("xxx");
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
	    	System.out.printf("e: %s\n", e.getClass().getName());
	    	if (e instanceof GoogleJsonResponseException) {
	    		GoogleJsonResponseException gjre = (GoogleJsonResponseException) e;
	    		
	    		// details: {"code":404,"errors":[{"domain":"global","message":"No topic with id /m/xxx","reason":"notFound"}],"message":"No topic with id /m/xxx"}
		    	System.out.printf("details: %s\n", gjre.getDetails());
	    	}
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
	}
}
