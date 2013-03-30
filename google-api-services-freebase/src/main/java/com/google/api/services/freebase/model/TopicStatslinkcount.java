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
 * Model definition for TopicStatslinkcount.
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
public final class TopicStatslinkcount extends GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String type;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Values> values;

  static {
    // hack to force ProGuard to consider Values used, since otherwise it would be stripped out
    // see http://code.google.com/p/google-api-java-client/issues/detail?id=528
    com.google.api.client.util.Data.nullOf(Values.class);
  }

  /**

   * The value returned may be {@code null}.
   */
  public String getType() {
    return type;
  }

  /**

   * The value set may be {@code null}.
   */
  public TopicStatslinkcount setType(String type) {
    this.type = type;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public java.util.List<Values> getValues() {
    return values;
  }

  /**

   * The value set may be {@code null}.
   */
  public TopicStatslinkcount setValues(java.util.List<Values> values) {
    this.values = values;
    return this;
  }

  /**
   * Model definition for TopicStatslinkcountValues.
   */
  public static final class Values extends GenericJson {

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private Integer count;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private String id;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<TopicStatslinkcountValuesValues> values;

    static {
      // hack to force ProGuard to consider TopicStatslinkcountValuesValues used, since otherwise it would be stripped out
      // see http://code.google.com/p/google-api-java-client/issues/detail?id=528
      com.google.api.client.util.Data.nullOf(TopicStatslinkcountValuesValues.class);
    }

    /**

     * The value returned may be {@code null}.
     */
    public Integer getCount() {
      return count;
    }

    /**

     * The value set may be {@code null}.
     */
    public Values setCount(Integer count) {
      this.count = count;
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
    public Values setId(String id) {
      this.id = id;
      return this;
    }

    /**

     * The value returned may be {@code null}.
     */
    public java.util.List<TopicStatslinkcountValuesValues> getValues() {
      return values;
    }

    /**

     * The value set may be {@code null}.
     */
    public Values setValues(java.util.List<TopicStatslinkcountValuesValues> values) {
      this.values = values;
      return this;
    }

    /**
     * Model definition for TopicStatslinkcountValuesValues.
     */
    public static final class TopicStatslinkcountValuesValues extends GenericJson {

      /**
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private Integer count;

      /**
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private String id;

      /**
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.util.List<TopicStatslinkcountValuesValuesValues> values;

      static {
        // hack to force ProGuard to consider TopicStatslinkcountValuesValuesValues used, since otherwise it would be stripped out
        // see http://code.google.com/p/google-api-java-client/issues/detail?id=528
        com.google.api.client.util.Data.nullOf(TopicStatslinkcountValuesValuesValues.class);
      }

      /**

       * The value returned may be {@code null}.
       */
      public Integer getCount() {
        return count;
      }

      /**

       * The value set may be {@code null}.
       */
      public TopicStatslinkcountValuesValues setCount(Integer count) {
        this.count = count;
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
      public TopicStatslinkcountValuesValues setId(String id) {
        this.id = id;
        return this;
      }

      /**

       * The value returned may be {@code null}.
       */
      public java.util.List<TopicStatslinkcountValuesValuesValues> getValues() {
        return values;
      }

      /**

       * The value set may be {@code null}.
       */
      public TopicStatslinkcountValuesValues setValues(java.util.List<TopicStatslinkcountValuesValuesValues> values) {
        this.values = values;
        return this;
      }

      /**
       * Model definition for TopicStatslinkcountValuesValuesValues.
       */
      public static final class TopicStatslinkcountValuesValuesValues extends GenericJson {

        /**
         * The value may be {@code null}.
         */
        @com.google.api.client.util.Key
        private Integer count;

        /**
         * The value may be {@code null}.
         */
        @com.google.api.client.util.Key
        private String id;

        /**

         * The value returned may be {@code null}.
         */
        public Integer getCount() {
          return count;
        }

        /**

         * The value set may be {@code null}.
         */
        public TopicStatslinkcountValuesValuesValues setCount(Integer count) {
          this.count = count;
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
        public TopicStatslinkcountValuesValuesValues setId(String id) {
          this.id = id;
          return this;
        }

      }
    }
  }

}
