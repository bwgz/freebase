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
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2013-03-20 15:12:36 UTC)
 * on 2013-03-29 at 15:42:40 UTC 
 * Modify at your own risk.
 */

package com.google.api.services.freebase.model;

/**
 * Model definition for TopicStatslinkcount.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Freebase API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-api-java-client/wiki/Json">http://code.google.com/p/google-api-java-client/wiki/Json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TopicStatslinkcount extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

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
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * @param type type or {@code null} for none
   */
  public TopicStatslinkcount setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<Values> getValues() {
    return values;
  }

  /**
   * @param values values or {@code null} for none
   */
  public TopicStatslinkcount setValues(java.util.List<Values> values) {
    this.values = values;
    return this;
  }

  @Override
  public TopicStatslinkcount set(String fieldName, Object value) {
    return (TopicStatslinkcount) super.set(fieldName, value);
  }

  @Override
  public TopicStatslinkcount clone() {
    return (TopicStatslinkcount) super.clone();
  }

  /**
   * Model definition for TopicStatslinkcountValues.
   */
  public static final class Values extends com.google.api.client.json.GenericJson {

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Integer count;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String id;

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
     * @return value or {@code null} for none
     */
    public java.lang.Integer getCount() {
      return count;
    }

    /**
     * @param count count or {@code null} for none
     */
    public Values setCount(java.lang.Integer count) {
      this.count = count;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getId() {
      return id;
    }

    /**
     * @param id id or {@code null} for none
     */
    public Values setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.util.List<TopicStatslinkcountValuesValues> getValues() {
      return values;
    }

    /**
     * @param values values or {@code null} for none
     */
    public Values setValues(java.util.List<TopicStatslinkcountValuesValues> values) {
      this.values = values;
      return this;
    }

    @Override
    public Values set(String fieldName, Object value) {
      return (Values) super.set(fieldName, value);
    }

    @Override
    public Values clone() {
      return (Values) super.clone();
    }

    /**
     * Model definition for TopicStatslinkcountValuesValues.
     */
    public static final class TopicStatslinkcountValuesValues extends com.google.api.client.json.GenericJson {

      /**
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.Integer count;

      /**
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String id;

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
       * @return value or {@code null} for none
       */
      public java.lang.Integer getCount() {
        return count;
      }

      /**
       * @param count count or {@code null} for none
       */
      public TopicStatslinkcountValuesValues setCount(java.lang.Integer count) {
        this.count = count;
        return this;
      }

      /**
       * @return value or {@code null} for none
       */
      public java.lang.String getId() {
        return id;
      }

      /**
       * @param id id or {@code null} for none
       */
      public TopicStatslinkcountValuesValues setId(java.lang.String id) {
        this.id = id;
        return this;
      }

      /**
       * @return value or {@code null} for none
       */
      public java.util.List<TopicStatslinkcountValuesValuesValues> getValues() {
        return values;
      }

      /**
       * @param values values or {@code null} for none
       */
      public TopicStatslinkcountValuesValues setValues(java.util.List<TopicStatslinkcountValuesValuesValues> values) {
        this.values = values;
        return this;
      }

      @Override
      public TopicStatslinkcountValuesValues set(String fieldName, Object value) {
        return (TopicStatslinkcountValuesValues) super.set(fieldName, value);
      }

      @Override
      public TopicStatslinkcountValuesValues clone() {
        return (TopicStatslinkcountValuesValues) super.clone();
      }

      /**
       * Model definition for TopicStatslinkcountValuesValuesValues.
       */
      public static final class TopicStatslinkcountValuesValuesValues extends com.google.api.client.json.GenericJson {

        /**
         * The value may be {@code null}.
         */
        @com.google.api.client.util.Key
        private java.lang.Integer count;

        /**
         * The value may be {@code null}.
         */
        @com.google.api.client.util.Key
        private java.lang.String id;

        /**
         * @return value or {@code null} for none
         */
        public java.lang.Integer getCount() {
          return count;
        }

        /**
         * @param count count or {@code null} for none
         */
        public TopicStatslinkcountValuesValuesValues setCount(java.lang.Integer count) {
          this.count = count;
          return this;
        }

        /**
         * @return value or {@code null} for none
         */
        public java.lang.String getId() {
          return id;
        }

        /**
         * @param id id or {@code null} for none
         */
        public TopicStatslinkcountValuesValuesValues setId(java.lang.String id) {
          this.id = id;
          return this;
        }

        @Override
        public TopicStatslinkcountValuesValuesValues set(String fieldName, Object value) {
          return (TopicStatslinkcountValuesValuesValues) super.set(fieldName, value);
        }

        @Override
        public TopicStatslinkcountValuesValuesValues clone() {
          return (TopicStatslinkcountValuesValuesValues) super.clone();
        }

      }
    }
  }

}
