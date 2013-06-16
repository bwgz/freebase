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
import java.lang.reflect.Type;

import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;

import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.freebase.Freebase;

public class MQLReadTest {
	static private final String applicationName = MQLReadTest.class.getName();
	static private final String query = 
			"{\"type\":\"/people/person\",\"id\":\"/en/albert_einstein\",\"children\":[]}";

	public static class Person {
		@com.google.api.client.util.Key
		private String[] children;

		public String[] getChildren() {
			return children;
		}

		public void setChildren(String[] children) {
			this.children = children;
		}
	}
	
	public static class MQLReadPersonResponse extends GenericJson {
		@com.google.api.client.util.Key
		private Person result;
		
		public Person getResult() {
			return result;
		}
		
		public void setResult(Person result) {
			this.result = result;
		}
	}

	public static class MQLReadResponse<T> extends GenericJson {
		@com.google.api.client.util.Key
		private T result;
		
		public T getResult() {
			return result;
		}
		
		public void setResult(T result) {
			this.result = result;
		}
	}
	
	public static void GenericJsonTest(Freebase freebase) {
        System.out.println("***** GenericJsonTest");
	    try {
	        Freebase.Mqlread<GenericJson> mqlRead = freebase.mqlread(query, GenericJson.class);
	        GenericJson response = mqlRead.execute();
	        System.out.println(response.toPrettyString());
	    } catch (Exception e) {
	        e.printStackTrace();
	    } 
        System.out.println("******************************");
	}
	
	public static void SingleResponseTest1(Freebase freebase) {
        System.out.println("SingleResponseTest1");
	    try {
	        Freebase.Mqlread<MQLReadPersonResponse> mqlRead = freebase.mqlread(query, MQLReadPersonResponse.class);
	        MQLReadPersonResponse response = mqlRead.execute();
	        System.out.println(response.toPrettyString());
	        Person person = response.getResult();
	        System.out.println(person);
	        for (String child : person.getChildren()) {
		        System.out.println(child);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    } 
        System.out.println("******************************");
	}

	public static void SingleResponseTest2(Freebase freebase) {
        System.out.println("***** SingleResponseTest2 - This will fail.");
	    try {
	        Freebase.Mqlread<MQLReadResponse<Person>> mqlRead = freebase.mqlread(query, MQLReadResponse.class);
	        MQLReadResponse<Person> response = mqlRead.execute();
	        System.out.println(response.toPrettyString());
	        
	        // This will fail.
	        Person person = response.getResult();
	        System.out.println(person);
	        for (String child : person.getChildren()) {
		        System.out.println(child);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    } 
        System.out.println("******************************");
	}

	public static void SingleResponseTest3(Freebase freebase) {
        System.out.println("SingleResponseTest3");
	    try {
	    	Type type = ParameterizedTypeImpl.make(MQLReadResponse.class, new Type[] { Person.class }, null);
	        Freebase.Mqlread<MQLReadResponse<Person>> mqlRead = freebase.mqlread(query, MQLReadResponse.class, type);
	        MQLReadResponse<Person> response = mqlRead.execute();
	        System.out.println(response.toPrettyString());
	        Person person = response.getResult();
	        System.out.println(person);
	        for (String child : person.getChildren()) {
		        System.out.println(child);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    } 
        System.out.println("******************************");
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
	    
	    GenericJsonTest(freebase);
	    SingleResponseTest1(freebase);
	    SingleResponseTest2(freebase);
	    SingleResponseTest3(freebase);
	}
}
