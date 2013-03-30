/*
 * Original code ...
 * 
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
 * This file was generated.
 *  with google-apis-code-generator 1.3.0 (build: 2013-03-20 15:12:36 UTC)
 *  on 2013-03-21 at 23:22:33 UTC 
 */
/*
 * Code changes ...
 * 
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
package com.google.api.services.freebase;

import java.io.IOException;
import java.lang.reflect.Type;

import com.google.api.client.googleapis.GoogleUtils;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;
import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.common.base.Preconditions;

import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;

/**
 * Service definition for Freebase (v1).
 *
 * <p>
 * Topic and MQL APIs provide you structured access to Freebase data.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="http://wiki.freebase.com/wiki/API" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link FreebaseRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * <p>
 * Upgrade warning: this class now extends {@link AbstractGoogleJsonClient}, whereas in prior
 * version 1.8 it extended {@link com.google.api.client.googleapis.services.GoogleClient}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Freebase extends AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    Preconditions.checkState(GoogleUtils.VERSION.equals("1.13.2-beta"),
        "You are currently running with version %s of google-api-client. " +
        "You need version 1.13.2-beta of google-api-client to run version " +
        "1.13.2-beta of the Freebase API library.", GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://www.googleapis.com/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "freebase/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   * @deprecated (scheduled to be removed in 1.13)
   */
  @Deprecated
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport
   * @param jsonFactory JSON factory
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Freebase(HttpTransport transport, JsonFactory jsonFactory,
      HttpRequestInitializer httpRequestInitializer) {
    super(transport,
        jsonFactory,
        DEFAULT_ROOT_URL,
        DEFAULT_SERVICE_PATH,
        httpRequestInitializer,
        false);
  }

  /**
   * @param transport HTTP transport
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @param rootUrl root URL of the service
   * @param servicePath service path
   * @param jsonObjectParser JSON object parser
   * @param googleClientRequestInitializer Google request initializer or {@code null} for none
   * @param applicationName application name to be sent in the User-Agent header of requests or
   *        {@code null} for none
   * @param suppressPatternChecks whether discovery pattern checks should be suppressed on required
   *        parameters
   */
  Freebase(HttpTransport transport,
      HttpRequestInitializer httpRequestInitializer,
      String rootUrl,
      String servicePath,
      JsonObjectParser jsonObjectParser,
      GoogleClientRequestInitializer googleClientRequestInitializer,
      String applicationName,
      boolean suppressPatternChecks) {
    super(transport,
        httpRequestInitializer,
        rootUrl,
        servicePath,
        jsonObjectParser,
        googleClientRequestInitializer,
        applicationName,
        suppressPatternChecks);
  }

  @Override
  protected void initialize(AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Text collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Freebase freebase = new Freebase(...);}
   *   {@code Freebase.Text.List request = freebase.text().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Text text() {
    return new Text();
  }

  /**
   * The "text" collection of methods.
   */
  public class Text {

    /**
     * Returns blob attached to node at specified id as HTML
     *
     * Create a request for the method "text.get".
     *
     * This request holds the parameters needed by the the freebase server.  After setting any optional
     * parameters, call the {@link Get#execute()} method to invoke the remote operation.
     *
     * @param id The id of the item that you want data about
     * @return the request
     */
    public Get get(java.util.List<String> id) throws java.io.IOException {
      Get result = new Get(id);
      initialize(result);
      return result;
    }

    public class Get extends FreebaseRequest<com.google.api.services.freebase.model.ContentserviceGet> {

      private static final String REST_PATH = "text{/id*}";

      /**
       * Returns blob attached to node at specified id as HTML
       *
       * Create a request for the method "text.get".
       *
       * This request holds the parameters needed by the the freebase server.  After setting any
       * optional parameters, call the {@link Get#execute()} method to invoke the remote operation. <p>
       * {@link Get#initialize(AbstractGoogleClientRequest)} must be called to initialize this instance
       * immediately after invoking the constructor. </p>
       *
       * @param id The id of the item that you want data about
       * @since 1.13
       */
      protected Get(java.util.List<String> id) {
        super(Freebase.this, "GET", REST_PATH, null, com.google.api.services.freebase.model.ContentserviceGet.class);
        this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public Get setAlt(String alt) {
        return (Get) super.setAlt(alt);
      }

      @Override
      public Get setFields(String fields) {
        return (Get) super.setFields(fields);
      }

      @Override
      public Get setKey(String key) {
        return (Get) super.setKey(key);
      }

      @Override
      public Get setOauthToken(String oauthToken) {
        return (Get) super.setOauthToken(oauthToken);
      }

      @Override
      public Get setPrettyPrint(Boolean prettyPrint) {
        return (Get) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Get setQuotaUser(String quotaUser) {
        return (Get) super.setQuotaUser(quotaUser);
      }

      @Override
      public Get setUserIp(String userIp) {
        return (Get) super.setUserIp(userIp);
      }

      /** The id of the item that you want data about */
      @com.google.api.client.util.Key
      private java.util.List<String> id;

      /** The id of the item that you want data about
       */
      public java.util.List<String> getId() {
        return id;
      }

      /** The id of the item that you want data about */
      public Get setId(java.util.List<String> id) {
        this.id = id;
        return this;
      }

      /** The max number of characters to return. Valid only for 'plain' format. */
      @com.google.api.client.util.Key
      private Long maxlength;

      /** The max number of characters to return. Valid only for 'plain' format.
       */
      public Long getMaxlength() {
        return maxlength;
      }

      /** The max number of characters to return. Valid only for 'plain' format. */
      public Get setMaxlength(Long maxlength) {
        this.maxlength = maxlength;
        return this;
      }

      /** Sanitizing transformation. */
      @com.google.api.client.util.Key
      private String format;

      /** Sanitizing transformation. [default: plain]
       */
      public String getFormat() {
        return format;
      }

      /** Sanitizing transformation. */
      public Get setFormat(String format) {
        this.format = format;
        return this;
      }

    }

  }

  /**
   * An accessor for creating requests from the Topic collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Freebase freebase = new Freebase(...);}
   *   {@code Freebase.Topic.List request = freebase.topic().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Topic topic() {
    return new Topic();
  }

  /**
   * The "topic" collection of methods.
   */
  public class Topic {

    /**
     * Get properties and meta-data about a topic.
     *
     * Create a request for the method "topic.lookup".
     *
     * This request holds the parameters needed by the the freebase server.  After setting any optional
     * parameters, call the {@link Lookup#execute()} method to invoke the remote operation.
     *
     * @param id The id of the item that you want data about.
     * @return the request
     */
    public Lookup lookup(java.util.List<String> id) throws java.io.IOException {
      Lookup result = new Lookup(id);
      initialize(result);
      return result;
    }

    public class Lookup extends FreebaseRequest<com.google.api.services.freebase.model.TopicLookup> {

      private static final String REST_PATH = "topic{/id*}";

      /**
       * Get properties and meta-data about a topic.
       *
       * Create a request for the method "topic.lookup".
       *
       * This request holds the parameters needed by the the freebase server.  After setting any
       * optional parameters, call the {@link Lookup#execute()} method to invoke the remote operation.
       * <p> {@link Lookup#initialize(AbstractGoogleClientRequest)} must be called to initialize this
       * instance immediately after invoking the constructor. </p>
       *
       * @param id The id of the item that you want data about.
       * @since 1.13
       */
      protected Lookup(java.util.List<String> id) {
        super(Freebase.this, "GET", REST_PATH, null, com.google.api.services.freebase.model.TopicLookup.class);
        this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public Lookup setAlt(String alt) {
        return (Lookup) super.setAlt(alt);
      }

      @Override
      public Lookup setFields(String fields) {
        return (Lookup) super.setFields(fields);
      }

      @Override
      public Lookup setKey(String key) {
        return (Lookup) super.setKey(key);
      }

      @Override
      public Lookup setOauthToken(String oauthToken) {
        return (Lookup) super.setOauthToken(oauthToken);
      }

      @Override
      public Lookup setPrettyPrint(Boolean prettyPrint) {
        return (Lookup) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Lookup setQuotaUser(String quotaUser) {
        return (Lookup) super.setQuotaUser(quotaUser);
      }

      @Override
      public Lookup setUserIp(String userIp) {
        return (Lookup) super.setUserIp(userIp);
      }

      /** The id of the item that you want data about. */
      @com.google.api.client.util.Key
      private java.util.List<String> id;

      /** The id of the item that you want data about.
       */
      public java.util.List<String> getId() {
        return id;
      }

      /** The id of the item that you want data about. */
      public Lookup setId(java.util.List<String> id) {
        this.id = id;
        return this;
      }

      /** The language you 'd like the content in - a freebase /type/lang language key. */
      @com.google.api.client.util.Key
      private String lang;

      /** The language you 'd like the content in - a freebase /type/lang language key. [default: en]
       */
      public String getLang() {
        return lang;
      }

      /** The language you 'd like the content in - a freebase /type/lang language key. */
      public Lookup setLang(String lang) {
        this.lang = lang;
        return this;
      }

      /** Determines how up-to-date the data returned is. A unix epoch time, a guid or a 'now' */
      @com.google.api.client.util.Key
      private String dateline;

      /** Determines how up-to-date the data returned is. A unix epoch time, a guid or a 'now'
       */
      public String getDateline() {
        return dateline;
      }

      /** Determines how up-to-date the data returned is. A unix epoch time, a guid or a 'now' */
      public Lookup setDateline(String dateline) {
        this.dateline = dateline;
        return this;
      }

      /**
     * A frebase domain, type or property id, 'suggest', 'commons', or 'all'. Filter the results and
     * returns only appropriate properties.
     */
      @com.google.api.client.util.Key
      private java.util.List<String> filter;

      /** A frebase domain, type or property id, 'suggest', 'commons', or 'all'. Filter the results and
     returns only appropriate properties.
       */
      public java.util.List<String> getFilter() {
        return filter;
      }

      /**
     * A frebase domain, type or property id, 'suggest', 'commons', or 'all'. Filter the results and
     * returns only appropriate properties.
     */
      public Lookup setFilter(java.util.List<String> filter) {
        this.filter = filter;
        return this;
      }

      /** Do not apply any constraints, or get any names. */
      @com.google.api.client.util.Key
      private Boolean raw;

      /** Do not apply any constraints, or get any names. [default: false]
       */
      public Boolean getRaw() {
        return raw;
      }

      /** Do not apply any constraints, or get any names. */
      public Lookup setRaw(Boolean raw) {
        this.raw = raw;
        return this;
      }

      /**
       * Convenience method that returns only {@link Boolean#TRUE} or {@link Boolean#FALSE}.
       *
       * <p>
       * Boolean properties can have four possible values:
       * {@code null}, {@link com.google.api.client.util.Data#NULL_BOOLEAN}, {@link Boolean#TRUE}
       * or {@link Boolean#FALSE}.
       * </p>
       *
       * <p>
       * This method returns {@link Boolean#TRUE} if the default of the property is {@link Boolean#TRUE}
       * and it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
       * {@link Boolean#FALSE} is returned if the default of the property is {@link Boolean#FALSE} and
       * it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
       * </p>
       *
       * <p>
       * Do not apply any constraints, or get any names.
       * </p>
       */
      public boolean isRaw() {
        if (raw == null || raw == com.google.api.client.util.Data.NULL_BOOLEAN) {
          return false;
        }
        return raw;
      }

      /** The maximum number of property values to return for each property. */
      @com.google.api.client.util.Key
      private Long limit;

      /** The maximum number of property values to return for each property. [default: 10]
       */
      public Long getLimit() {
        return limit;
      }

      /** The maximum number of property values to return for each property. */
      public Lookup setLimit(Long limit) {
        this.limit = limit;
        return this;
      }

    }

  }

  /**
   * Returns the scaled/cropped image attached to a freebase node.
   *
   * Create a request for the method "image".
   *
   * This request holds the parameters needed by the the freebase server.  After setting any optional
   * parameters, call the {@link Image#execute()} method to invoke the remote operation.
   *
   * @param id Freebase entity or content id, mid, or guid.
   * @return the request
   */
  public Image image(java.util.List<String> id) throws java.io.IOException {
    Image result = new Image(id);
    initialize(result);
    return result;
  }

  public class Image extends FreebaseRequest<Void> {

    private static final String REST_PATH = "image{/id*}";

    private final java.util.regex.Pattern FALLBACKID_PATTERN =
        java.util.regex.Pattern.compile("/[^.]*$");

    /**
     * Returns the scaled/cropped image attached to a freebase node.
     *
     * Create a request for the method "image".
     *
     * This request holds the parameters needed by the the freebase server.  After setting any
     * optional parameters, call the {@link Image#execute()} method to invoke the remote operation.
     * <p> {@link Image#initialize(AbstractGoogleClientRequest)} must be called to initialize this
     * instance immediately after invoking the constructor. </p>
     *
     * @param id Freebase entity or content id, mid, or guid.
     * @since 1.13
     */
    protected Image(java.util.List<String> id) {
      super(Freebase.this, "GET", REST_PATH, null, Void.class);
      this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public Image setAlt(String alt) {
      return (Image) super.setAlt(alt);
    }

    @Override
    public Image setFields(String fields) {
      return (Image) super.setFields(fields);
    }

    @Override
    public Image setKey(String key) {
      return (Image) super.setKey(key);
    }

    @Override
    public Image setOauthToken(String oauthToken) {
      return (Image) super.setOauthToken(oauthToken);
    }

    @Override
    public Image setPrettyPrint(Boolean prettyPrint) {
      return (Image) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public Image setQuotaUser(String quotaUser) {
      return (Image) super.setQuotaUser(quotaUser);
    }

    @Override
    public Image setUserIp(String userIp) {
      return (Image) super.setUserIp(userIp);
    }

    /** Freebase entity or content id, mid, or guid. */
    @com.google.api.client.util.Key
    private java.util.List<String> id;

    /** Freebase entity or content id, mid, or guid.
     */
    public java.util.List<String> getId() {
      return id;
    }

    /** Freebase entity or content id, mid, or guid. */
    public Image setId(java.util.List<String> id) {
      this.id = id;
      return this;
    }

    /** Maximum width in pixels for resulting image. */
    @com.google.api.client.util.Key
    private Long maxwidth;

    /** Maximum width in pixels for resulting image.

   [maximum: 4096]
     */
    public Long getMaxwidth() {
      return maxwidth;
    }

    /** Maximum width in pixels for resulting image. */
    public Image setMaxwidth(Long maxwidth) {
      this.maxwidth = maxwidth;
      return this;
    }

    /** Maximum height in pixels for resulting image. */
    @com.google.api.client.util.Key
    private Long maxheight;

    /** Maximum height in pixels for resulting image.

   [maximum: 4096]
     */
    public Long getMaxheight() {
      return maxheight;
    }

    /** Maximum height in pixels for resulting image. */
    public Image setMaxheight(Long maxheight) {
      this.maxheight = maxheight;
      return this;
    }

    /**
   * Use the image associated with this secondary id if no image is associated with the primary id.
   */
    @com.google.api.client.util.Key
    private String fallbackid;

    /** Use the image associated with this secondary id if no image is associated with the primary id.
   [default: /freebase/no_image_png]
     */
    public String getFallbackid() {
      return fallbackid;
    }

    /**
   * Use the image associated with this secondary id if no image is associated with the primary id.
   */
    public Image setFallbackid(String fallbackid) {
      if (!getSuppressPatternChecks()) {
        Preconditions.checkArgument(FALLBACKID_PATTERN.matcher(fallbackid).matches(),
            "Parameter fallbackid must conform to the pattern " +
            "/[^.]*$");
      }
      this.fallbackid = fallbackid;
      return this;
    }

    /**
   * A boolean specifying whether the resulting image should be padded up to the requested
   * dimensions.
   */
    @com.google.api.client.util.Key
    private Boolean pad;

    /** A boolean specifying whether the resulting image should be padded up to the requested dimensions.
   [default: false]
     */
    public Boolean getPad() {
      return pad;
    }

    /**
   * A boolean specifying whether the resulting image should be padded up to the requested
   * dimensions.
   */
    public Image setPad(Boolean pad) {
      this.pad = pad;
      return this;
    }

    /**
     * Convenience method that returns only {@link Boolean#TRUE} or {@link Boolean#FALSE}.
     *
     * <p>
     * Boolean properties can have four possible values:
     * {@code null}, {@link com.google.api.client.util.Data#NULL_BOOLEAN}, {@link Boolean#TRUE}
     * or {@link Boolean#FALSE}.
     * </p>
     *
     * <p>
     * This method returns {@link Boolean#TRUE} if the default of the property is {@link Boolean#TRUE}
     * and it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
     * {@link Boolean#FALSE} is returned if the default of the property is {@link Boolean#FALSE} and
     * it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
     * </p>
     *
     * <p>
     * A boolean specifying whether the resulting image should be padded up to the requested dimensions.
     * </p>
     */
    public boolean isPad() {
      if (pad == null || pad == com.google.api.client.util.Data.NULL_BOOLEAN) {
        return false;
      }
      return pad;
    }

    /** Method used to scale or crop image. */
    @com.google.api.client.util.Key
    private String mode;

    /** Method used to scale or crop image. [default: fit]
     */
    public String getMode() {
      return mode;
    }

    /** Method used to scale or crop image. */
    public Image setMode(String mode) {
      this.mode = mode;
      return this;
    }

  }

  /**
   * Performs MQL Queries.
   *
   * Create a request for the method "mqlread".
   *
   * This request holds the parameters needed by the the freebase server.  After setting any optional
   * parameters, call the {@link Mqlread#execute()} method to invoke the remote operation.
   *
   * @param query An envelope containing a single MQL query.
   * @return the request
   */
  public Mqlread mqlread(String query, Class<?> classType) throws java.io.IOException {
    Mqlread result = new Mqlread(query, classType);
    initialize(result);
    return result;
  }

  public Mqlread mqlread(String query, Class<?> classType, Type type) throws java.io.IOException {
	    Mqlread result = new Mqlread(query, classType, type);
	    initialize(result);
	    return result;
	  }

  public class Mqlread<T> extends FreebaseRequest<T> {
    private static final String REST_PATH = "mqlread";

    private final java.util.regex.Pattern CALLBACK_PATTERN =
        java.util.regex.Pattern.compile("([A-Za-z0-9_$.]|\\[|\\])+");

	private Type responseType;

    public Type getResponseType() {
		return responseType;
	}

	public void setResponseType(Type responseType) {
		this.responseType = responseType;
	}

	/**
     * Performs MQL Queries.
     *
     * Create a request for the method "mqlread".
     *
     * This request holds the parameters needed by the the freebase server.  After setting any
     * optional parameters, call the {@link Mqlread#execute()} method to invoke the remote operation.
     * <p> {@link Mqlread#initialize(AbstractGoogleClientRequest)} must be called to initialize this
     * instance immediately after invoking the constructor. </p>
     *
     * @param query An envelope containing a single MQL query.
     * @since 1.13
     */
    protected Mqlread(String query, Class<T> responseClass) {
      super(Freebase.this, "GET", REST_PATH, null, responseClass);
      this.query = Preconditions.checkNotNull(query, "Required parameter query must be specified.");
    }

    protected Mqlread(String query, Class<T> responseClass, Type responseType) {
        this(query, responseClass);
        this.responseType = responseType;
	}

    @SuppressWarnings("unchecked")
	private T execute(Type type) throws IOException {
        HttpResponse response = executeUnparsed();

        return (T) response.parseAs(type);
    }

	@Override
    public T execute() throws IOException {
		return (getResponseType() != null) ? execute(getResponseType()) : super.execute();
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public Mqlread setAlt(String alt) {
      return (Mqlread) super.setAlt(alt);
    }

    @Override
    public Mqlread setFields(String fields) {
      return (Mqlread) super.setFields(fields);
    }

    @Override
    public Mqlread setKey(String key) {
      return (Mqlread) super.setKey(key);
    }

    @Override
    public Mqlread setOauthToken(String oauthToken) {
      return (Mqlread) super.setOauthToken(oauthToken);
    }

    @Override
    public Mqlread setPrettyPrint(Boolean prettyPrint) {
      return (Mqlread) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public Mqlread setQuotaUser(String quotaUser) {
      return (Mqlread) super.setQuotaUser(quotaUser);
    }

    @Override
    public Mqlread setUserIp(String userIp) {
      return (Mqlread) super.setUserIp(userIp);
    }

    /** An envelope containing a single MQL query. */
    @com.google.api.client.util.Key
    private String query;

    /** An envelope containing a single MQL query.
     */
    public String getQuery() {
      return query;
    }

    /** An envelope containing a single MQL query. */
    public Mqlread setQuery(String query) {
      this.query = query;
      return this;
    }

    /** The language of the results - an id of a /type/lang object. */
    @com.google.api.client.util.Key
    private String lang;

    /** The language of the results - an id of a /type/lang object. [default: /lang/en]
     */
    public String getLang() {
      return lang;
    }

    /** The language of the results - an id of a /type/lang object. */
    public Mqlread setLang(String lang) {
      this.lang = lang;
      return this;
    }

    /** Whether or not to escape entities. */
    @com.google.api.client.util.Key("html_escape")
    private Boolean htmlEscape;

    /** Whether or not to escape entities. [default: true]
     */
    public Boolean getHtmlEscape() {
      return htmlEscape;
    }

    /** Whether or not to escape entities. */
    public Mqlread setHtmlEscape(Boolean htmlEscape) {
      this.htmlEscape = htmlEscape;
      return this;
    }

    /**
     * Convenience method that returns only {@link Boolean#TRUE} or {@link Boolean#FALSE}.
     *
     * <p>
     * Boolean properties can have four possible values:
     * {@code null}, {@link com.google.api.client.util.Data#NULL_BOOLEAN}, {@link Boolean#TRUE}
     * or {@link Boolean#FALSE}.
     * </p>
     *
     * <p>
     * This method returns {@link Boolean#TRUE} if the default of the property is {@link Boolean#TRUE}
     * and it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
     * {@link Boolean#FALSE} is returned if the default of the property is {@link Boolean#FALSE} and
     * it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
     * </p>
     *
     * <p>
     * Whether or not to escape entities.
     * </p>
     */
    public boolean isHtmlEscape() {
      if (htmlEscape == null || htmlEscape == com.google.api.client.util.Data.NULL_BOOLEAN) {
        return true;
      }
      return htmlEscape;
    }

    /** How many spaces to indent the json. */
    @com.google.api.client.util.Key
    private Long indent;

    /** How many spaces to indent the json. [default: 0]

   [maximum: 10]
     */
    public Long getIndent() {
      return indent;
    }

    /** How many spaces to indent the json. */
    public Mqlread setIndent(Long indent) {
      this.indent = indent;
      return this;
    }

    /** How MQL responds to uniqueness failures. */
    @com.google.api.client.util.Key("uniqueness_failure")
    private String uniquenessFailure;

    /** How MQL responds to uniqueness failures. [default: hard]
     */
    public String getUniquenessFailure() {
      return uniquenessFailure;
    }

    /** How MQL responds to uniqueness failures. */
    public Mqlread setUniquenessFailure(String uniquenessFailure) {
      this.uniquenessFailure = uniquenessFailure;
      return this;
    }

    /** The dateline that you get in a mqlwrite response to ensure consistent results. */
    @com.google.api.client.util.Key
    private String dateline;

    /** The dateline that you get in a mqlwrite response to ensure consistent results.
     */
    public String getDateline() {
      return dateline;
    }

    /** The dateline that you get in a mqlwrite response to ensure consistent results. */
    public Mqlread setDateline(String dateline) {
      this.dateline = dateline;
      return this;
    }

    /** The mql cursor. */
    @com.google.api.client.util.Key
    private String cursor;

    /** The mql cursor.
     */
    public String getCursor() {
      return cursor;
    }

    /** The mql cursor. */
    public Mqlread setCursor(String cursor) {
      this.cursor = cursor;
      return this;
    }

    /** JS method name for JSONP callbacks. */
    @com.google.api.client.util.Key
    private String callback;

    /** JS method name for JSONP callbacks.
     */
    public String getCallback() {
      return callback;
    }

    /** JS method name for JSONP callbacks. */
    public Mqlread setCallback(String callback) {
      if (!getSuppressPatternChecks()) {
        Preconditions.checkArgument(CALLBACK_PATTERN.matcher(callback).matches(),
            "Parameter callback must conform to the pattern " +
            "([A-Za-z0-9_$.]|\\[|\\])+");
      }
      this.callback = callback;
      return this;
    }

    /** Show the costs or not. */
    @com.google.api.client.util.Key
    private Boolean cost;

    /** Show the costs or not. [default: false]
     */
    public Boolean getCost() {
      return cost;
    }

    /** Show the costs or not. */
    public Mqlread setCost(Boolean cost) {
      this.cost = cost;
      return this;
    }

    /**
     * Convenience method that returns only {@link Boolean#TRUE} or {@link Boolean#FALSE}.
     *
     * <p>
     * Boolean properties can have four possible values:
     * {@code null}, {@link com.google.api.client.util.Data#NULL_BOOLEAN}, {@link Boolean#TRUE}
     * or {@link Boolean#FALSE}.
     * </p>
     *
     * <p>
     * This method returns {@link Boolean#TRUE} if the default of the property is {@link Boolean#TRUE}
     * and it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
     * {@link Boolean#FALSE} is returned if the default of the property is {@link Boolean#FALSE} and
     * it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
     * </p>
     *
     * <p>
     * Show the costs or not.
     * </p>
     */
    public boolean isCost() {
      if (cost == null || cost == com.google.api.client.util.Data.NULL_BOOLEAN) {
        return false;
      }
      return cost;
    }

    /** Run the query as it would've been run at the specified point in time. */
    @com.google.api.client.util.Key("as_of_time")
    private String asOfTime;

    /** Run the query as it would've been run at the specified point in time.
     */
    public String getAsOfTime() {
      return asOfTime;
    }

    /** Run the query as it would've been run at the specified point in time. */
    public Mqlread setAsOfTime(String asOfTime) {
      this.asOfTime = asOfTime;
      return this;
    }

  }

  /**
   * Performs MQL Write Operations.
   *
   * Create a request for the method "mqlwrite".
   *
   * This request holds the parameters needed by the the freebase server.  After setting any optional
   * parameters, call the {@link Mqlwrite#execute()} method to invoke the remote operation.
   *
   * @param query An MQL query with write directives.
   * @return the request
   */
  public Mqlwrite mqlwrite(String query) throws java.io.IOException {
    Mqlwrite result = new Mqlwrite(query);
    initialize(result);
    return result;
  }

  public class Mqlwrite extends FreebaseRequest<Void> {

    private static final String REST_PATH = "mqlwrite";

    private final java.util.regex.Pattern CALLBACK_PATTERN =
        java.util.regex.Pattern.compile("([A-Za-z0-9_$.]|\\[|\\])+");

    /**
     * Performs MQL Write Operations.
     *
     * Create a request for the method "mqlwrite".
     *
     * This request holds the parameters needed by the the freebase server.  After setting any
     * optional parameters, call the {@link Mqlwrite#execute()} method to invoke the remote operation.
     * <p> {@link Mqlwrite#initialize(AbstractGoogleClientRequest)} must be called to initialize this
     * instance immediately after invoking the constructor. </p>
     *
     * @param query An MQL query with write directives.
     * @since 1.13
     */
    protected Mqlwrite(String query) {
      super(Freebase.this, "GET", REST_PATH, null, Void.class);
      this.query = Preconditions.checkNotNull(query, "Required parameter query must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public Mqlwrite setAlt(String alt) {
      return (Mqlwrite) super.setAlt(alt);
    }

    @Override
    public Mqlwrite setFields(String fields) {
      return (Mqlwrite) super.setFields(fields);
    }

    @Override
    public Mqlwrite setKey(String key) {
      return (Mqlwrite) super.setKey(key);
    }

    @Override
    public Mqlwrite setOauthToken(String oauthToken) {
      return (Mqlwrite) super.setOauthToken(oauthToken);
    }

    @Override
    public Mqlwrite setPrettyPrint(Boolean prettyPrint) {
      return (Mqlwrite) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public Mqlwrite setQuotaUser(String quotaUser) {
      return (Mqlwrite) super.setQuotaUser(quotaUser);
    }

    @Override
    public Mqlwrite setUserIp(String userIp) {
      return (Mqlwrite) super.setUserIp(userIp);
    }

    /** An MQL query with write directives. */
    @com.google.api.client.util.Key
    private String query;

    /** An MQL query with write directives.
     */
    public String getQuery() {
      return query;
    }

    /** An MQL query with write directives. */
    public Mqlwrite setQuery(String query) {
      this.query = query;
      return this;
    }

    /** JS method name for JSONP callbacks. */
    @com.google.api.client.util.Key
    private String callback;

    /** JS method name for JSONP callbacks.
     */
    public String getCallback() {
      return callback;
    }

    /** JS method name for JSONP callbacks. */
    public Mqlwrite setCallback(String callback) {
      if (!getSuppressPatternChecks()) {
        Preconditions.checkArgument(CALLBACK_PATTERN.matcher(callback).matches(),
            "Parameter callback must conform to the pattern " +
            "([A-Za-z0-9_$.]|\\[|\\])+");
      }
      this.callback = callback;
      return this;
    }

    /** The dateline that you get in a mqlwrite response to ensure consistent results. */
    @com.google.api.client.util.Key
    private String dateline;

    /** The dateline that you get in a mqlwrite response to ensure consistent results.
     */
    public String getDateline() {
      return dateline;
    }

    /** The dateline that you get in a mqlwrite response to ensure consistent results. */
    public Mqlwrite setDateline(String dateline) {
      this.dateline = dateline;
      return this;
    }

    /** How many spaces to indent the json. */
    @com.google.api.client.util.Key
    private Long indent;

    /** How many spaces to indent the json. [default: 0]

   [maximum: 10]
     */
    public Long getIndent() {
      return indent;
    }

    /** How many spaces to indent the json. */
    public Mqlwrite setIndent(Long indent) {
      this.indent = indent;
      return this;
    }

    /** Use the same permission node of the object with the specified id. */
    @com.google.api.client.util.Key("use_permission_of")
    private String usePermissionOf;

    /** Use the same permission node of the object with the specified id.
     */
    public String getUsePermissionOf() {
      return usePermissionOf;
    }

    /** Use the same permission node of the object with the specified id. */
    public Mqlwrite setUsePermissionOf(String usePermissionOf) {
      this.usePermissionOf = usePermissionOf;
      return this;
    }

  }

  /**
   * Builder for {@link Freebase}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport
     * @param jsonFactory JSON factory
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(HttpTransport transport, JsonFactory jsonFactory,
        HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Freebase}. */
    @Override
    public Freebase build() {
      return new Freebase(getTransport(),
          getHttpRequestInitializer(),
          getRootUrl(),
          getServicePath(),
          getObjectParser(),
          getGoogleClientRequestInitializer(),
          getApplicationName(),
          getSuppressPatternChecks());
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    /**
     * Set the {@link FreebaseRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setFreebaseRequestInitializer(
        FreebaseRequestInitializer freebaseRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(freebaseRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
