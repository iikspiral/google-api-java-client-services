/*
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
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.cloudsearch.v1.model;

/**
 * Indicates which freshness property to use when adjusting search ranking for an item. Fresher,
 * more recent dates indicate higher quality. Use the freshness option property that best works with
 * your data. For fileshare documents, last modified time is most relevant. For calendar event data,
 * the time when the event occurs is a more relevant freshness indicator. In this way, calendar
 * events that occur closer to the time of the search query are considered higher quality and ranked
 * accordingly.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FreshnessOptions extends com.google.api.client.json.GenericJson {

  /**
   * The duration after which an object should be considered stale. The default value is 180 days
   * (in seconds).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String freshnessDuration;

  /**
   * This property indicates the freshness level of the object in the index. If set, this property
   * must be a top-level property within the property definitions and it must be a timestamp type or
   * date type. Otherwise, the Indexing API uses updateTime as the freshness indicator. The maximum
   * length is 256 characters.
   *
   * When a property is used to calculate freshness, the value defaults to 2 years from the current
   * time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String freshnessProperty;

  /**
   * The duration after which an object should be considered stale. The default value is 180 days
   * (in seconds).
   * @return value or {@code null} for none
   */
  public String getFreshnessDuration() {
    return freshnessDuration;
  }

  /**
   * The duration after which an object should be considered stale. The default value is 180 days
   * (in seconds).
   * @param freshnessDuration freshnessDuration or {@code null} for none
   */
  public FreshnessOptions setFreshnessDuration(String freshnessDuration) {
    this.freshnessDuration = freshnessDuration;
    return this;
  }

  /**
   * This property indicates the freshness level of the object in the index. If set, this property
   * must be a top-level property within the property definitions and it must be a timestamp type or
   * date type. Otherwise, the Indexing API uses updateTime as the freshness indicator. The maximum
   * length is 256 characters.
   *
   * When a property is used to calculate freshness, the value defaults to 2 years from the current
   * time.
   * @return value or {@code null} for none
   */
  public java.lang.String getFreshnessProperty() {
    return freshnessProperty;
  }

  /**
   * This property indicates the freshness level of the object in the index. If set, this property
   * must be a top-level property within the property definitions and it must be a timestamp type or
   * date type. Otherwise, the Indexing API uses updateTime as the freshness indicator. The maximum
   * length is 256 characters.
   *
   * When a property is used to calculate freshness, the value defaults to 2 years from the current
   * time.
   * @param freshnessProperty freshnessProperty or {@code null} for none
   */
  public FreshnessOptions setFreshnessProperty(java.lang.String freshnessProperty) {
    this.freshnessProperty = freshnessProperty;
    return this;
  }

  @Override
  public FreshnessOptions set(String fieldName, Object value) {
    return (FreshnessOptions) super.set(fieldName, value);
  }

  @Override
  public FreshnessOptions clone() {
    return (FreshnessOptions) super.clone();
  }

}
