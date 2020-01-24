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

package com.google.api.services.docs.v1.model;

/**
 * The styling that applies to a section.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Docs API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SectionStyle extends com.google.api.client.json.GenericJson {

  /**
   * The section's columns properties.
   *
   * If empty, the section contains one column with the default properties in the Docs editor. A
   * section can be updated to have no more than three columns.
   *
   * When updating this property, setting a concrete value is required. Unsetting this property will
   * result in a 400 bad request error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SectionColumnProperties> columnProperties;

  static {
    // hack to force ProGuard to consider SectionColumnProperties used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(SectionColumnProperties.class);
  }

  /**
   * The style of column separators.
   *
   * This style can be set even when there is one column in the section.
   *
   * When updating this property, setting a concrete value is required. Unsetting this property
   * results in a 400 bad request error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String columnSeparatorStyle;

  /**
   * The content direction of this section. If unset, the value defaults to LEFT_TO_RIGHT.
   *
   * When updating this property, setting a concrete value is required. Unsetting this property
   * results in a 400 bad request error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentDirection;

  /**
   * The ID of the default footer. If unset, the value inherits from the previous SectionBreak's
   * SectionStyle. If the value is unset in the first SectionBreak, it inherits from DocumentStyle's
   * default_footer_id.
   *
   * This property is read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String defaultFooterId;

  /**
   * The ID of the default header. If unset, the value inherits from the previous SectionBreak's
   * SectionStyle. If the value is unset in the first SectionBreak, it inherits from DocumentStyle's
   * default_header_id.
   *
   * This property is read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String defaultHeaderId;

  /**
   * The ID of the footer used only for even pages. If the value of DocumentStyle's
   * use_even_page_header_footer is true, this value is used for the footers on even pages in the
   * section. If it is false, the footers on even pages uses the default_footer_id. If unset, the
   * value inherits from the previous SectionBreak's SectionStyle. If the value is unset in the
   * first SectionBreak, it inherits from DocumentStyle's even_page_footer_id.
   *
   * This property is read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String evenPageFooterId;

  /**
   * The ID of the header used only for even pages. If the value of DocumentStyle's
   * use_even_page_header_footer is true, this value is used for the headers on even pages in the
   * section. If it is false, the headers on even pages uses the default_header_id. If unset, the
   * value inherits from the previous SectionBreak's SectionStyle. If the value is unset in the
   * first SectionBreak, it inherits from DocumentStyle's even_page_header_id.
   *
   * This property is read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String evenPageHeaderId;

  /**
   * The ID of the footer used only for the first page of the section. If
   * use_first_page_header_footer is true, this value is used for the footer on the first page of
   * the section. If it is false, the footer on the first page of the section uses the
   * default_footer_id. If unset, the value inherits from the previous SectionBreak's SectionStyle.
   * If the value is unset in the first SectionBreak, it inherits from DocumentStyle's
   * first_page_footer_id.
   *
   * This property is read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String firstPageFooterId;

  /**
   * The ID of the header used only for the first page of the section. If
   * use_first_page_header_footer is true, this value is used for the header on the first page of
   * the section. If it is false, the header on the first page of the section uses the
   * default_header_id. If unset, the value inherits from the previous SectionBreak's SectionStyle.
   * If the value is unset in the first SectionBreak, it inherits from DocumentStyle's
   * first_page_header_id.
   *
   * This property is read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String firstPageHeaderId;

  /**
   * The bottom page margin of the section. If unset, uses margin_bottom from DocumentStyle.
   *
   * When updating this property, setting a concrete value is required. Unsetting this property
   * results in a 400 bad request error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Dimension marginBottom;

  /**
   * The footer margin of the section. If unset, uses margin_footer from DocumentStyle. If updated,
   * use_custom_header_footer_margins is set to true on DocumentStyle. The value of
   * use_custom_header_footer_margins on DocumentStyle indicates if a footer margin is being
   * respected for this section
   *
   * When updating this property, setting a concrete value is required. Unsetting this property
   * results in a 400 bad request error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Dimension marginFooter;

  /**
   * The header margin of the section. If unset, uses margin_header from DocumentStyle. If updated,
   * use_custom_header_footer_margins is set to true on DocumentStyle. The value of
   * use_custom_header_footer_margins on DocumentStyle indicates if a header margin is being
   * respected for this section.
   *
   * When updating this property, setting a concrete value is required. Unsetting this property
   * results in a 400 bad request error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Dimension marginHeader;

  /**
   * The left page margin of the section. If unset, uses margin_left from DocumentStyle. Updating
   * left margin causes columns in this section to resize. Since the margin affects column width, it
   * is applied before column properties.
   *
   * When updating this property, setting a concrete value is required. Unsetting this property
   * results in a 400 bad request error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Dimension marginLeft;

  /**
   * The right page margin of the section. If unset, uses margin_right from DocumentStyle. Updating
   * right margin causes columns in this section to resize. Since the margin affects column width,
   * it is applied before column properties.
   *
   * When updating this property, setting a concrete value is required. Unsetting this property
   * results in a 400 bad request error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Dimension marginRight;

  /**
   * The top page margin of the section. If unset, uses margin_top from DocumentStyle.
   *
   * When updating this property, setting a concrete value is required. Unsetting this property
   * results in a 400 bad request error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Dimension marginTop;

  /**
   * Output only. The type of section.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sectionType;

  /**
   * Indicates whether to use the first page header / footer IDs for the first page of the section.
   * If unset, it inherits from DocumentStyle's use_first_page_header_footer for the first section.
   * If the value is unset for subsequent sectors, it should be interpreted as false.
   *
   * When updating this property, setting a concrete value is required. Unsetting this property
   * results in a 400 bad request error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean useFirstPageHeaderFooter;

  /**
   * The section's columns properties.
   *
   * If empty, the section contains one column with the default properties in the Docs editor. A
   * section can be updated to have no more than three columns.
   *
   * When updating this property, setting a concrete value is required. Unsetting this property will
   * result in a 400 bad request error.
   * @return value or {@code null} for none
   */
  public java.util.List<SectionColumnProperties> getColumnProperties() {
    return columnProperties;
  }

  /**
   * The section's columns properties.
   *
   * If empty, the section contains one column with the default properties in the Docs editor. A
   * section can be updated to have no more than three columns.
   *
   * When updating this property, setting a concrete value is required. Unsetting this property will
   * result in a 400 bad request error.
   * @param columnProperties columnProperties or {@code null} for none
   */
  public SectionStyle setColumnProperties(java.util.List<SectionColumnProperties> columnProperties) {
    this.columnProperties = columnProperties;
    return this;
  }

  /**
   * The style of column separators.
   *
   * This style can be set even when there is one column in the section.
   *
   * When updating this property, setting a concrete value is required. Unsetting this property
   * results in a 400 bad request error.
   * @return value or {@code null} for none
   */
  public java.lang.String getColumnSeparatorStyle() {
    return columnSeparatorStyle;
  }

  /**
   * The style of column separators.
   *
   * This style can be set even when there is one column in the section.
   *
   * When updating this property, setting a concrete value is required. Unsetting this property
   * results in a 400 bad request error.
   * @param columnSeparatorStyle columnSeparatorStyle or {@code null} for none
   */
  public SectionStyle setColumnSeparatorStyle(java.lang.String columnSeparatorStyle) {
    this.columnSeparatorStyle = columnSeparatorStyle;
    return this;
  }

  /**
   * The content direction of this section. If unset, the value defaults to LEFT_TO_RIGHT.
   *
   * When updating this property, setting a concrete value is required. Unsetting this property
   * results in a 400 bad request error.
   * @return value or {@code null} for none
   */
  public java.lang.String getContentDirection() {
    return contentDirection;
  }

  /**
   * The content direction of this section. If unset, the value defaults to LEFT_TO_RIGHT.
   *
   * When updating this property, setting a concrete value is required. Unsetting this property
   * results in a 400 bad request error.
   * @param contentDirection contentDirection or {@code null} for none
   */
  public SectionStyle setContentDirection(java.lang.String contentDirection) {
    this.contentDirection = contentDirection;
    return this;
  }

  /**
   * The ID of the default footer. If unset, the value inherits from the previous SectionBreak's
   * SectionStyle. If the value is unset in the first SectionBreak, it inherits from DocumentStyle's
   * default_footer_id.
   *
   * This property is read-only.
   * @return value or {@code null} for none
   */
  public java.lang.String getDefaultFooterId() {
    return defaultFooterId;
  }

  /**
   * The ID of the default footer. If unset, the value inherits from the previous SectionBreak's
   * SectionStyle. If the value is unset in the first SectionBreak, it inherits from DocumentStyle's
   * default_footer_id.
   *
   * This property is read-only.
   * @param defaultFooterId defaultFooterId or {@code null} for none
   */
  public SectionStyle setDefaultFooterId(java.lang.String defaultFooterId) {
    this.defaultFooterId = defaultFooterId;
    return this;
  }

  /**
   * The ID of the default header. If unset, the value inherits from the previous SectionBreak's
   * SectionStyle. If the value is unset in the first SectionBreak, it inherits from DocumentStyle's
   * default_header_id.
   *
   * This property is read-only.
   * @return value or {@code null} for none
   */
  public java.lang.String getDefaultHeaderId() {
    return defaultHeaderId;
  }

  /**
   * The ID of the default header. If unset, the value inherits from the previous SectionBreak's
   * SectionStyle. If the value is unset in the first SectionBreak, it inherits from DocumentStyle's
   * default_header_id.
   *
   * This property is read-only.
   * @param defaultHeaderId defaultHeaderId or {@code null} for none
   */
  public SectionStyle setDefaultHeaderId(java.lang.String defaultHeaderId) {
    this.defaultHeaderId = defaultHeaderId;
    return this;
  }

  /**
   * The ID of the footer used only for even pages. If the value of DocumentStyle's
   * use_even_page_header_footer is true, this value is used for the footers on even pages in the
   * section. If it is false, the footers on even pages uses the default_footer_id. If unset, the
   * value inherits from the previous SectionBreak's SectionStyle. If the value is unset in the
   * first SectionBreak, it inherits from DocumentStyle's even_page_footer_id.
   *
   * This property is read-only.
   * @return value or {@code null} for none
   */
  public java.lang.String getEvenPageFooterId() {
    return evenPageFooterId;
  }

  /**
   * The ID of the footer used only for even pages. If the value of DocumentStyle's
   * use_even_page_header_footer is true, this value is used for the footers on even pages in the
   * section. If it is false, the footers on even pages uses the default_footer_id. If unset, the
   * value inherits from the previous SectionBreak's SectionStyle. If the value is unset in the
   * first SectionBreak, it inherits from DocumentStyle's even_page_footer_id.
   *
   * This property is read-only.
   * @param evenPageFooterId evenPageFooterId or {@code null} for none
   */
  public SectionStyle setEvenPageFooterId(java.lang.String evenPageFooterId) {
    this.evenPageFooterId = evenPageFooterId;
    return this;
  }

  /**
   * The ID of the header used only for even pages. If the value of DocumentStyle's
   * use_even_page_header_footer is true, this value is used for the headers on even pages in the
   * section. If it is false, the headers on even pages uses the default_header_id. If unset, the
   * value inherits from the previous SectionBreak's SectionStyle. If the value is unset in the
   * first SectionBreak, it inherits from DocumentStyle's even_page_header_id.
   *
   * This property is read-only.
   * @return value or {@code null} for none
   */
  public java.lang.String getEvenPageHeaderId() {
    return evenPageHeaderId;
  }

  /**
   * The ID of the header used only for even pages. If the value of DocumentStyle's
   * use_even_page_header_footer is true, this value is used for the headers on even pages in the
   * section. If it is false, the headers on even pages uses the default_header_id. If unset, the
   * value inherits from the previous SectionBreak's SectionStyle. If the value is unset in the
   * first SectionBreak, it inherits from DocumentStyle's even_page_header_id.
   *
   * This property is read-only.
   * @param evenPageHeaderId evenPageHeaderId or {@code null} for none
   */
  public SectionStyle setEvenPageHeaderId(java.lang.String evenPageHeaderId) {
    this.evenPageHeaderId = evenPageHeaderId;
    return this;
  }

  /**
   * The ID of the footer used only for the first page of the section. If
   * use_first_page_header_footer is true, this value is used for the footer on the first page of
   * the section. If it is false, the footer on the first page of the section uses the
   * default_footer_id. If unset, the value inherits from the previous SectionBreak's SectionStyle.
   * If the value is unset in the first SectionBreak, it inherits from DocumentStyle's
   * first_page_footer_id.
   *
   * This property is read-only.
   * @return value or {@code null} for none
   */
  public java.lang.String getFirstPageFooterId() {
    return firstPageFooterId;
  }

  /**
   * The ID of the footer used only for the first page of the section. If
   * use_first_page_header_footer is true, this value is used for the footer on the first page of
   * the section. If it is false, the footer on the first page of the section uses the
   * default_footer_id. If unset, the value inherits from the previous SectionBreak's SectionStyle.
   * If the value is unset in the first SectionBreak, it inherits from DocumentStyle's
   * first_page_footer_id.
   *
   * This property is read-only.
   * @param firstPageFooterId firstPageFooterId or {@code null} for none
   */
  public SectionStyle setFirstPageFooterId(java.lang.String firstPageFooterId) {
    this.firstPageFooterId = firstPageFooterId;
    return this;
  }

  /**
   * The ID of the header used only for the first page of the section. If
   * use_first_page_header_footer is true, this value is used for the header on the first page of
   * the section. If it is false, the header on the first page of the section uses the
   * default_header_id. If unset, the value inherits from the previous SectionBreak's SectionStyle.
   * If the value is unset in the first SectionBreak, it inherits from DocumentStyle's
   * first_page_header_id.
   *
   * This property is read-only.
   * @return value or {@code null} for none
   */
  public java.lang.String getFirstPageHeaderId() {
    return firstPageHeaderId;
  }

  /**
   * The ID of the header used only for the first page of the section. If
   * use_first_page_header_footer is true, this value is used for the header on the first page of
   * the section. If it is false, the header on the first page of the section uses the
   * default_header_id. If unset, the value inherits from the previous SectionBreak's SectionStyle.
   * If the value is unset in the first SectionBreak, it inherits from DocumentStyle's
   * first_page_header_id.
   *
   * This property is read-only.
   * @param firstPageHeaderId firstPageHeaderId or {@code null} for none
   */
  public SectionStyle setFirstPageHeaderId(java.lang.String firstPageHeaderId) {
    this.firstPageHeaderId = firstPageHeaderId;
    return this;
  }

  /**
   * The bottom page margin of the section. If unset, uses margin_bottom from DocumentStyle.
   *
   * When updating this property, setting a concrete value is required. Unsetting this property
   * results in a 400 bad request error.
   * @return value or {@code null} for none
   */
  public Dimension getMarginBottom() {
    return marginBottom;
  }

  /**
   * The bottom page margin of the section. If unset, uses margin_bottom from DocumentStyle.
   *
   * When updating this property, setting a concrete value is required. Unsetting this property
   * results in a 400 bad request error.
   * @param marginBottom marginBottom or {@code null} for none
   */
  public SectionStyle setMarginBottom(Dimension marginBottom) {
    this.marginBottom = marginBottom;
    return this;
  }

  /**
   * The footer margin of the section. If unset, uses margin_footer from DocumentStyle. If updated,
   * use_custom_header_footer_margins is set to true on DocumentStyle. The value of
   * use_custom_header_footer_margins on DocumentStyle indicates if a footer margin is being
   * respected for this section
   *
   * When updating this property, setting a concrete value is required. Unsetting this property
   * results in a 400 bad request error.
   * @return value or {@code null} for none
   */
  public Dimension getMarginFooter() {
    return marginFooter;
  }

  /**
   * The footer margin of the section. If unset, uses margin_footer from DocumentStyle. If updated,
   * use_custom_header_footer_margins is set to true on DocumentStyle. The value of
   * use_custom_header_footer_margins on DocumentStyle indicates if a footer margin is being
   * respected for this section
   *
   * When updating this property, setting a concrete value is required. Unsetting this property
   * results in a 400 bad request error.
   * @param marginFooter marginFooter or {@code null} for none
   */
  public SectionStyle setMarginFooter(Dimension marginFooter) {
    this.marginFooter = marginFooter;
    return this;
  }

  /**
   * The header margin of the section. If unset, uses margin_header from DocumentStyle. If updated,
   * use_custom_header_footer_margins is set to true on DocumentStyle. The value of
   * use_custom_header_footer_margins on DocumentStyle indicates if a header margin is being
   * respected for this section.
   *
   * When updating this property, setting a concrete value is required. Unsetting this property
   * results in a 400 bad request error.
   * @return value or {@code null} for none
   */
  public Dimension getMarginHeader() {
    return marginHeader;
  }

  /**
   * The header margin of the section. If unset, uses margin_header from DocumentStyle. If updated,
   * use_custom_header_footer_margins is set to true on DocumentStyle. The value of
   * use_custom_header_footer_margins on DocumentStyle indicates if a header margin is being
   * respected for this section.
   *
   * When updating this property, setting a concrete value is required. Unsetting this property
   * results in a 400 bad request error.
   * @param marginHeader marginHeader or {@code null} for none
   */
  public SectionStyle setMarginHeader(Dimension marginHeader) {
    this.marginHeader = marginHeader;
    return this;
  }

  /**
   * The left page margin of the section. If unset, uses margin_left from DocumentStyle. Updating
   * left margin causes columns in this section to resize. Since the margin affects column width, it
   * is applied before column properties.
   *
   * When updating this property, setting a concrete value is required. Unsetting this property
   * results in a 400 bad request error.
   * @return value or {@code null} for none
   */
  public Dimension getMarginLeft() {
    return marginLeft;
  }

  /**
   * The left page margin of the section. If unset, uses margin_left from DocumentStyle. Updating
   * left margin causes columns in this section to resize. Since the margin affects column width, it
   * is applied before column properties.
   *
   * When updating this property, setting a concrete value is required. Unsetting this property
   * results in a 400 bad request error.
   * @param marginLeft marginLeft or {@code null} for none
   */
  public SectionStyle setMarginLeft(Dimension marginLeft) {
    this.marginLeft = marginLeft;
    return this;
  }

  /**
   * The right page margin of the section. If unset, uses margin_right from DocumentStyle. Updating
   * right margin causes columns in this section to resize. Since the margin affects column width,
   * it is applied before column properties.
   *
   * When updating this property, setting a concrete value is required. Unsetting this property
   * results in a 400 bad request error.
   * @return value or {@code null} for none
   */
  public Dimension getMarginRight() {
    return marginRight;
  }

  /**
   * The right page margin of the section. If unset, uses margin_right from DocumentStyle. Updating
   * right margin causes columns in this section to resize. Since the margin affects column width,
   * it is applied before column properties.
   *
   * When updating this property, setting a concrete value is required. Unsetting this property
   * results in a 400 bad request error.
   * @param marginRight marginRight or {@code null} for none
   */
  public SectionStyle setMarginRight(Dimension marginRight) {
    this.marginRight = marginRight;
    return this;
  }

  /**
   * The top page margin of the section. If unset, uses margin_top from DocumentStyle.
   *
   * When updating this property, setting a concrete value is required. Unsetting this property
   * results in a 400 bad request error.
   * @return value or {@code null} for none
   */
  public Dimension getMarginTop() {
    return marginTop;
  }

  /**
   * The top page margin of the section. If unset, uses margin_top from DocumentStyle.
   *
   * When updating this property, setting a concrete value is required. Unsetting this property
   * results in a 400 bad request error.
   * @param marginTop marginTop or {@code null} for none
   */
  public SectionStyle setMarginTop(Dimension marginTop) {
    this.marginTop = marginTop;
    return this;
  }

  /**
   * Output only. The type of section.
   * @return value or {@code null} for none
   */
  public java.lang.String getSectionType() {
    return sectionType;
  }

  /**
   * Output only. The type of section.
   * @param sectionType sectionType or {@code null} for none
   */
  public SectionStyle setSectionType(java.lang.String sectionType) {
    this.sectionType = sectionType;
    return this;
  }

  /**
   * Indicates whether to use the first page header / footer IDs for the first page of the section.
   * If unset, it inherits from DocumentStyle's use_first_page_header_footer for the first section.
   * If the value is unset for subsequent sectors, it should be interpreted as false.
   *
   * When updating this property, setting a concrete value is required. Unsetting this property
   * results in a 400 bad request error.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUseFirstPageHeaderFooter() {
    return useFirstPageHeaderFooter;
  }

  /**
   * Indicates whether to use the first page header / footer IDs for the first page of the section.
   * If unset, it inherits from DocumentStyle's use_first_page_header_footer for the first section.
   * If the value is unset for subsequent sectors, it should be interpreted as false.
   *
   * When updating this property, setting a concrete value is required. Unsetting this property
   * results in a 400 bad request error.
   * @param useFirstPageHeaderFooter useFirstPageHeaderFooter or {@code null} for none
   */
  public SectionStyle setUseFirstPageHeaderFooter(java.lang.Boolean useFirstPageHeaderFooter) {
    this.useFirstPageHeaderFooter = useFirstPageHeaderFooter;
    return this;
  }

  @Override
  public SectionStyle set(String fieldName, Object value) {
    return (SectionStyle) super.set(fieldName, value);
  }

  @Override
  public SectionStyle clone() {
    return (SectionStyle) super.clone();
  }

}
