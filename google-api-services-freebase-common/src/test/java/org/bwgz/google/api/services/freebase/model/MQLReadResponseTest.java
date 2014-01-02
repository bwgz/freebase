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
package org.bwgz.google.api.services.freebase.model;

import static org.junit.Assert.*;

import java.io.IOException;

import org.bwgz.google.api.services.freebase.FreebaseTest;
import org.junit.Test;

import com.google.api.services.freebase.Freebase;

public class MQLReadResponseTest extends FreebaseTest {
	static final String query =  "{\"mid\": \"/m/01bpn\",\"name\": null}";
	
	@Test
	public void testNonTypedResponse() {
		try {
			Freebase.Mqlread mqlRead = freebase.mqlread(query);
			assertNotNull(mqlRead);
			Object response = mqlRead.execute();
			assertNotNull(response);
		} catch (IOException e) {
			fail(e.getMessage());
		}
	}
}
