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

package com.google.api.services.vision.v1.model;

/**
 * Set of detected entity features.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVisionV1p4beta1EntityAnnotation extends com.google.api.client.json.GenericJson {

  /**
   * Image region to which this entity belongs. Not produced for `LABEL_DETECTION` features.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVisionV1p4beta1BoundingPoly boundingPoly;

  /**
   * **Deprecated. Use `score` instead.** The accuracy of the entity detection in an image. For
   * example, for an image in which the "Eiffel Tower" entity is detected, this field represents the
   * confidence that there is a tower in the query image. Range [0, 1].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float confidence;

  /**
   * Entity textual description, expressed in its `locale` language.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The language code for the locale in which the entity textual `description` is expressed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String locale;

  /**
   * The location information for the detected entity. Multiple `LocationInfo` elements can be
   * present because one location may indicate the location of the scene in the image, and another
   * location may indicate the location of the place where the image was taken. Location information
   * is usually present for landmarks.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVisionV1p4beta1LocationInfo> locations;

  /**
   * Opaque entity ID. Some IDs may be available in [Google Knowledge Graph Search
   * API](https://developers.google.com/knowledge-graph/).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mid;

  /**
   * Some entities may have optional user-supplied `Property` (name/value) fields, such a score or
   * string that qualifies the entity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVisionV1p4beta1Property> properties;

  /**
   * Overall score of the result. Range [0, 1].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float score;

  /**
   * The relevancy of the ICA (Image Content Annotation) label to the image. For example, the
   * relevancy of "tower" is likely higher to an image containing the detected "Eiffel Tower" than
   * to an image containing a detected distant towering building, even though the confidence that
   * there is a tower in each image may be the same. Range [0, 1].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float topicality;

  /**
   * Image region to which this entity belongs. Not produced for `LABEL_DETECTION` features.
   * @return value or {@code null} for none
   */
  public GoogleCloudVisionV1p4beta1BoundingPoly getBoundingPoly() {
    return boundingPoly;
  }

  /**
   * Image region to which this entity belongs. Not produced for `LABEL_DETECTION` features.
   * @param boundingPoly boundingPoly or {@code null} for none
   */
  public GoogleCloudVisionV1p4beta1EntityAnnotation setBoundingPoly(GoogleCloudVisionV1p4beta1BoundingPoly boundingPoly) {
    this.boundingPoly = boundingPoly;
    return this;
  }

  /**
   * **Deprecated. Use `score` instead.** The accuracy of the entity detection in an image. For
   * example, for an image in which the "Eiffel Tower" entity is detected, this field represents the
   * confidence that there is a tower in the query image. Range [0, 1].
   * @return value or {@code null} for none
   */
  public java.lang.Float getConfidence() {
    return confidence;
  }

  /**
   * **Deprecated. Use `score` instead.** The accuracy of the entity detection in an image. For
   * example, for an image in which the "Eiffel Tower" entity is detected, this field represents the
   * confidence that there is a tower in the query image. Range [0, 1].
   * @param confidence confidence or {@code null} for none
   */
  public GoogleCloudVisionV1p4beta1EntityAnnotation setConfidence(java.lang.Float confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * Entity textual description, expressed in its `locale` language.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Entity textual description, expressed in its `locale` language.
   * @param description description or {@code null} for none
   */
  public GoogleCloudVisionV1p4beta1EntityAnnotation setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The language code for the locale in which the entity textual `description` is expressed.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocale() {
    return locale;
  }

  /**
   * The language code for the locale in which the entity textual `description` is expressed.
   * @param locale locale or {@code null} for none
   */
  public GoogleCloudVisionV1p4beta1EntityAnnotation setLocale(java.lang.String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * The location information for the detected entity. Multiple `LocationInfo` elements can be
   * present because one location may indicate the location of the scene in the image, and another
   * location may indicate the location of the place where the image was taken. Location information
   * is usually present for landmarks.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVisionV1p4beta1LocationInfo> getLocations() {
    return locations;
  }

  /**
   * The location information for the detected entity. Multiple `LocationInfo` elements can be
   * present because one location may indicate the location of the scene in the image, and another
   * location may indicate the location of the place where the image was taken. Location information
   * is usually present for landmarks.
   * @param locations locations or {@code null} for none
   */
  public GoogleCloudVisionV1p4beta1EntityAnnotation setLocations(java.util.List<GoogleCloudVisionV1p4beta1LocationInfo> locations) {
    this.locations = locations;
    return this;
  }

  /**
   * Opaque entity ID. Some IDs may be available in [Google Knowledge Graph Search
   * API](https://developers.google.com/knowledge-graph/).
   * @return value or {@code null} for none
   */
  public java.lang.String getMid() {
    return mid;
  }

  /**
   * Opaque entity ID. Some IDs may be available in [Google Knowledge Graph Search
   * API](https://developers.google.com/knowledge-graph/).
   * @param mid mid or {@code null} for none
   */
  public GoogleCloudVisionV1p4beta1EntityAnnotation setMid(java.lang.String mid) {
    this.mid = mid;
    return this;
  }

  /**
   * Some entities may have optional user-supplied `Property` (name/value) fields, such a score or
   * string that qualifies the entity.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVisionV1p4beta1Property> getProperties() {
    return properties;
  }

  /**
   * Some entities may have optional user-supplied `Property` (name/value) fields, such a score or
   * string that qualifies the entity.
   * @param properties properties or {@code null} for none
   */
  public GoogleCloudVisionV1p4beta1EntityAnnotation setProperties(java.util.List<GoogleCloudVisionV1p4beta1Property> properties) {
    this.properties = properties;
    return this;
  }

  /**
   * Overall score of the result. Range [0, 1].
   * @return value or {@code null} for none
   */
  public java.lang.Float getScore() {
    return score;
  }

  /**
   * Overall score of the result. Range [0, 1].
   * @param score score or {@code null} for none
   */
  public GoogleCloudVisionV1p4beta1EntityAnnotation setScore(java.lang.Float score) {
    this.score = score;
    return this;
  }

  /**
   * The relevancy of the ICA (Image Content Annotation) label to the image. For example, the
   * relevancy of "tower" is likely higher to an image containing the detected "Eiffel Tower" than
   * to an image containing a detected distant towering building, even though the confidence that
   * there is a tower in each image may be the same. Range [0, 1].
   * @return value or {@code null} for none
   */
  public java.lang.Float getTopicality() {
    return topicality;
  }

  /**
   * The relevancy of the ICA (Image Content Annotation) label to the image. For example, the
   * relevancy of "tower" is likely higher to an image containing the detected "Eiffel Tower" than
   * to an image containing a detected distant towering building, even though the confidence that
   * there is a tower in each image may be the same. Range [0, 1].
   * @param topicality topicality or {@code null} for none
   */
  public GoogleCloudVisionV1p4beta1EntityAnnotation setTopicality(java.lang.Float topicality) {
    this.topicality = topicality;
    return this;
  }

  @Override
  public GoogleCloudVisionV1p4beta1EntityAnnotation set(String fieldName, Object value) {
    return (GoogleCloudVisionV1p4beta1EntityAnnotation) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVisionV1p4beta1EntityAnnotation clone() {
    return (GoogleCloudVisionV1p4beta1EntityAnnotation) super.clone();
  }

}
