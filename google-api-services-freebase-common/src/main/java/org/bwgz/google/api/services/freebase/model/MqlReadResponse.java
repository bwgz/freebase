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

import com.google.api.client.util.Key;

public class MqlReadResponse<T> {
	@Key
	private Object cursor;
	@Key
	private Integer cost;
	@Key
	private T result;

	public Object getCursor() {
		return cursor;
	}
	public void setCursor(Object cursor) {
		this.cursor = cursor;
	}
	public Integer getCost() {
		return cost;
	}
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	public T getResult() {
		return result;
	}
	public void setResult(T result) {
		this.result = result;
	}
}
