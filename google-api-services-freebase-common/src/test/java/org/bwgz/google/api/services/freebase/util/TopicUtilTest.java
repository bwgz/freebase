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

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.bwgz.google.api.services.freebase.FreebaseTest;
import org.junit.Before;
import org.junit.Test;

import com.google.api.services.freebase.Freebase;
import com.google.api.services.freebase.model.TopicLookup;

public class TopicUtilTest extends FreebaseTest {
	private TopicLookup response;
	
	@Before
	public void setUp() throws IOException {
		Freebase.Topic.Lookup lookup = freebase.topic().lookup(Arrays.asList("/m/081k8")); // William Shakespeare
		assertNotNull(lookup);
		response = lookup.execute();
		assertNotNull(response);
	}

	@Test
	public void testGetPropertyValues() {
		List<Map<String, ?>> list = TopicUtil.getPropertyValues(response, "/type/object/name");
		assertNotNull(list);
	}
}
