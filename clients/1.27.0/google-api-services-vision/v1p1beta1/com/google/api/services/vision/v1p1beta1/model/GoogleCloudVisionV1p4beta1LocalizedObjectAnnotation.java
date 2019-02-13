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

package com.google.api.services.vision.v1p1beta1.model;

/**
 * Set of detected objects with bounding boxes.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVisionV1p4beta1LocalizedObjectAnnotation extends com.google.api.client.json.GenericJson {

  /**
   * Image region to which this object belongs. This must be populated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVisionV1p4beta1BoundingPoly boundingPoly;

  /**
   * The BCP-47 language code, such as "en-US" or "sr-Latn". For more information, see
   * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String languageCode;

  /**
   * Object ID that should align with EntityAnnotation mid.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mid;

  /**
   * Object name, expressed in its `language_code` language.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Score of the result. Range [0, 1].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float score;

  /**
   * Image region to which this object belongs. This must be populated.
   * @return value or {@code null} for none
   */
  public GoogleCloudVisionV1p4beta1BoundingPoly getBoundingPoly() {
    return boundingPoly;
  }

  /**
   * Image region to which this object belongs. This must be populated.
   * @param boundingPoly boundingPoly or {@code null} for none
   */
  public GoogleCloudVisionV1p4beta1LocalizedObjectAnnotation setBoundingPoly(GoogleCloudVisionV1p4beta1BoundingPoly boundingPoly) {
    this.boundingPoly = boundingPoly;
    return this;
  }

  /**
   * The BCP-47 language code, such as "en-US" or "sr-Latn". For more information, see
   * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguageCode() {
    return languageCode;
  }

  /**
   * The BCP-47 language code, such as "en-US" or "sr-Latn". For more information, see
   * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
   * @param languageCode languageCode or {@code null} for none
   */
  public GoogleCloudVisionV1p4beta1LocalizedObjectAnnotation setLanguageCode(java.lang.String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * Object ID that should align with EntityAnnotation mid.
   * @return value or {@code null} for none
   */
  public java.lang.String getMid() {
    return mid;
  }

  /**
   * Object ID that should align with EntityAnnotation mid.
   * @param mid mid or {@code null} for none
   */
  public GoogleCloudVisionV1p4beta1LocalizedObjectAnnotation setMid(java.lang.String mid) {
    this.mid = mid;
    return this;
  }

  /**
   * Object name, expressed in its `language_code` language.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Object name, expressed in its `language_code` language.
   * @param name name or {@code null} for none
   */
  public GoogleCloudVisionV1p4beta1LocalizedObjectAnnotation setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Score of the result. Range [0, 1].
   * @return value or {@code null} for none
   */
  public java.lang.Float getScore() {
    return score;
  }

  /**
   * Score of the result. Range [0, 1].
   * @param score score or {@code null} for none
   */
  public GoogleCloudVisionV1p4beta1LocalizedObjectAnnotation setScore(java.lang.Float score) {
    this.score = score;
    return this;
  }

  @Override
  public GoogleCloudVisionV1p4beta1LocalizedObjectAnnotation set(String fieldName, Object value) {
    return (GoogleCloudVisionV1p4beta1LocalizedObjectAnnotation) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVisionV1p4beta1LocalizedObjectAnnotation clone() {
    return (GoogleCloudVisionV1p4beta1LocalizedObjectAnnotation) super.clone();
  }

}
