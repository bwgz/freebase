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

import static org.junit.Assert.*;

import java.io.IOException;
import java.lang.reflect.Type;

import org.bwgz.google.api.services.freebase.FreebaseTest;
import org.junit.Test;

import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;

import com.google.api.client.util.Key;
import com.google.api.services.freebase.Freebase;

public class MQLReadResponseTest extends FreebaseTest {
	static final String query =  "{\"mid\": \"/m/01bpn\",\"name\": null}";
	
	@Test
	public void testNonTypedResponse() {
		try {
			Freebase.Mqlread<?> mqlRead = freebase.mqlread(query, MqlReadResponse.class);
			assertNotNull(mqlRead);
			Object response = mqlRead.execute();
			assertNotNull(response);
			assertTrue(response instanceof MqlReadResponse);
		} catch (IOException e) {
			fail(e.getMessage());
		}
	}
	
	static public class Person {
		@Key
		String name;

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
	
	@Test
	public void testTypedResponse() {
		try {
	    	Type type = ParameterizedTypeImpl.make(MqlReadResponse.class, new Type[] { Person.class }, null);
	        Freebase.Mqlread<MqlReadResponse<Person>> mqlRead = freebase.mqlread(query, MqlReadResponse.class, type);
			assertNotNull(mqlRead);
	        MqlReadResponse<Person> response = mqlRead.execute();
			assertNotNull(response);
			assertTrue(response instanceof MqlReadResponse);
			Person person = response.getResult();
			assertNotNull(person);
			assertEquals(person.getName(), "Bertrand Russell");
		} catch (IOException e) {
			fail(e.getMessage());
		}
	}
	
	
}
