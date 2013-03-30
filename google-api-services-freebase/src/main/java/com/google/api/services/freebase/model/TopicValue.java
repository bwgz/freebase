/*
 * Copyright 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * Warning! This file is generated. Modify at your own risk.
 */

package com.google.api.services.freebase.model;

import com.google.api.client.json.GenericJson;

/**
 * Model definition for TopicValue.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Freebase API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-api-java-client/wiki/Json">http://code.google.com/p/google-api-java-client/wiki/Json</a>
 * </p>
 *
 * <p>
 * Upgrade warning: starting with version 1.12 {@code getResponseHeaders()} is removed, instead use
 * {@link com.google.api.client.http.json.JsonHttpRequest#getLastResponseHeaders()}
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TopicValue extends GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Citation citation;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String creator;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String dataset;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lang;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String project;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, TopicPropertyvalue> property;

  static {
    // hack to force ProGuard to consider TopicPropertyvalue used, since otherwise it would be stripped out
    // see http://code.google.com/p/google-api-java-client/issues/detail?id=528
    com.google.api.client.util.Data.nullOf(TopicPropertyvalue.class);
  }

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String text;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String timestamp;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Object value;

  /**

   * The value returned may be {@code null}.
   */
  public Citation getCitation() {
    return citation;
  }

  /**

   * The value set may be {@code null}.
   */
  public TopicValue setCitation(Citation citation) {
    this.citation = citation;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public String getCreator() {
    return creator;
  }

  /**

   * The value set may be {@code null}.
   */
  public TopicValue setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public String getDataset() {
    return dataset;
  }

  /**

   * The value set may be {@code null}.
   */
  public TopicValue setDataset(String dataset) {
    this.dataset = dataset;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public String getId() {
    return id;
  }

  /**

   * The value set may be {@code null}.
   */
  public TopicValue setId(String id) {
    this.id = id;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public String getLang() {
    return lang;
  }

  /**

   * The value set may be {@code null}.
   */
  public TopicValue setLang(String lang) {
    this.lang = lang;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public String getProject() {
    return project;
  }

  /**

   * The value set may be {@code null}.
   */
  public TopicValue setProject(String project) {
    this.project = project;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public java.util.Map<String, TopicPropertyvalue> getProperty() {
    return property;
  }

  /**

   * The value set may be {@code null}.
   */
  public TopicValue setProperty(java.util.Map<String, TopicPropertyvalue> property) {
    this.property = property;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public String getText() {
    return text;
  }

  /**

   * The value set may be {@code null}.
   */
  public TopicValue setText(String text) {
    this.text = text;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public String getTimestamp() {
    return timestamp;
  }

  /**

   * The value set may be {@code null}.
   */
  public TopicValue setTimestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public Object getValue() {
    return value;
  }

  /**

   * The value set may be {@code null}.
   */
  public TopicValue setValue(Object value) {
    this.value = value;
    return this;
  }

  /**
   * Model definition for TopicValueCitation.
   */
  public static final class Citation extends GenericJson {

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private String provider;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private String statement;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private String uri;

    /**

     * The value returned may be {@code null}.
     */
    public String getProvider() {
      return provider;
    }

    /**

     * The value set may be {@code null}.
     */
    public Citation setProvider(String provider) {
      this.provider = provider;
      return this;
    }

    /**

     * The value returned may be {@code null}.
     */
    public String getStatement() {
      return statement;
    }

    /**

     * The value set may be {@code null}.
     */
    public Citation setStatement(String statement) {
      this.statement = statement;
      return this;
    }

    /**

     * The value returned may be {@code null}.
     */
    public String getUri() {
      return uri;
    }

    /**

     * The value set may be {@code null}.
     */
    public Citation setUri(String uri) {
      this.uri = uri;
      return this;
    }

  }

}
