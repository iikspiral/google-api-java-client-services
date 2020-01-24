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
 * The style of the document.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Docs API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DocumentStyle extends com.google.api.client.json.GenericJson {

  /**
   * The background of the document. Documents cannot have a transparent background color.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Background background;

  /**
   * The ID of the default footer. If not set, there is no default footer.
   *
   * This property is read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String defaultFooterId;

  /**
   * The ID of the default header. If not set, there is no default header.
   *
   * This property is read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String defaultHeaderId;

  /**
   * The ID of the footer used only for even pages. The value of use_even_page_header_footer
   * determines whether to use the default_footer_id or this value for the footer on even pages. If
   * not set, there is no even page footer.
   *
   * This property is read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String evenPageFooterId;

  /**
   * The ID of the header used only for even pages. The value of use_even_page_header_footer
   * determines whether to use the default_header_id or this value for the header on even pages. If
   * not set, there is no even page header.
   *
   * This property is read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String evenPageHeaderId;

  /**
   * The ID of the footer used only for the first page. If not set then a unique footer for the
   * first page does not exist. The value of use_first_page_header_footer determines whether to use
   * the default_footer_id or this value for the footer on the first page. If not set, there is no
   * first page footer.
   *
   * This property is read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String firstPageFooterId;

  /**
   * The ID of the header used only for the first page. If not set then a unique header for the
   * first page does not exist. The value of use_first_page_header_footer determines whether to use
   * the default_header_id or this value for the header on the first page. If not set, there is no
   * first page header.
   *
   * This property is read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String firstPageHeaderId;

  /**
   * The bottom page margin.
   *
   * Updating the bottom page margin on the document style clears the bottom page margin on all
   * section styles.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Dimension marginBottom;

  /**
   * The amount of space between the bottom of the page and the contents of the footer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Dimension marginFooter;

  /**
   * The amount of space between the top of the page and the contents of the header.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Dimension marginHeader;

  /**
   * The left page margin.
   *
   * Updating the left page margin on the document style clears the left page margin on all section
   * styles. It may also cause columns to resize in all sections.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Dimension marginLeft;

  /**
   * The right page margin.
   *
   * Updating the right page margin on the document style clears the right page margin on all
   * section styles. It may also cause columns to resize in all sections.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Dimension marginRight;

  /**
   * The top page margin.
   *
   * Updating the top page margin on the document style clears the top page margin on all section
   * styles.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Dimension marginTop;

  /**
   * The page number from which to start counting the number of pages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer pageNumberStart;

  /**
   * The size of a page in the document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Size pageSize;

  /**
   * Indicates whether DocumentStyle margin_header, SectionStyle margin_header and DocumentStyle
   * margin_footer, SectionStyle margin_footer are respected. When false, the default values in the
   * Docs editor for header and footer margin are used.
   *
   * This property is read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean useCustomHeaderFooterMargins;

  /**
   * Indicates whether to use the even page header / footer IDs for the even pages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean useEvenPageHeaderFooter;

  /**
   * Indicates whether to use the first page header / footer IDs for the first page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean useFirstPageHeaderFooter;

  /**
   * The background of the document. Documents cannot have a transparent background color.
   * @return value or {@code null} for none
   */
  public Background getBackground() {
    return background;
  }

  /**
   * The background of the document. Documents cannot have a transparent background color.
   * @param background background or {@code null} for none
   */
  public DocumentStyle setBackground(Background background) {
    this.background = background;
    return this;
  }

  /**
   * The ID of the default footer. If not set, there is no default footer.
   *
   * This property is read-only.
   * @return value or {@code null} for none
   */
  public java.lang.String getDefaultFooterId() {
    return defaultFooterId;
  }

  /**
   * The ID of the default footer. If not set, there is no default footer.
   *
   * This property is read-only.
   * @param defaultFooterId defaultFooterId or {@code null} for none
   */
  public DocumentStyle setDefaultFooterId(java.lang.String defaultFooterId) {
    this.defaultFooterId = defaultFooterId;
    return this;
  }

  /**
   * The ID of the default header. If not set, there is no default header.
   *
   * This property is read-only.
   * @return value or {@code null} for none
   */
  public java.lang.String getDefaultHeaderId() {
    return defaultHeaderId;
  }

  /**
   * The ID of the default header. If not set, there is no default header.
   *
   * This property is read-only.
   * @param defaultHeaderId defaultHeaderId or {@code null} for none
   */
  public DocumentStyle setDefaultHeaderId(java.lang.String defaultHeaderId) {
    this.defaultHeaderId = defaultHeaderId;
    return this;
  }

  /**
   * The ID of the footer used only for even pages. The value of use_even_page_header_footer
   * determines whether to use the default_footer_id or this value for the footer on even pages. If
   * not set, there is no even page footer.
   *
   * This property is read-only.
   * @return value or {@code null} for none
   */
  public java.lang.String getEvenPageFooterId() {
    return evenPageFooterId;
  }

  /**
   * The ID of the footer used only for even pages. The value of use_even_page_header_footer
   * determines whether to use the default_footer_id or this value for the footer on even pages. If
   * not set, there is no even page footer.
   *
   * This property is read-only.
   * @param evenPageFooterId evenPageFooterId or {@code null} for none
   */
  public DocumentStyle setEvenPageFooterId(java.lang.String evenPageFooterId) {
    this.evenPageFooterId = evenPageFooterId;
    return this;
  }

  /**
   * The ID of the header used only for even pages. The value of use_even_page_header_footer
   * determines whether to use the default_header_id or this value for the header on even pages. If
   * not set, there is no even page header.
   *
   * This property is read-only.
   * @return value or {@code null} for none
   */
  public java.lang.String getEvenPageHeaderId() {
    return evenPageHeaderId;
  }

  /**
   * The ID of the header used only for even pages. The value of use_even_page_header_footer
   * determines whether to use the default_header_id or this value for the header on even pages. If
   * not set, there is no even page header.
   *
   * This property is read-only.
   * @param evenPageHeaderId evenPageHeaderId or {@code null} for none
   */
  public DocumentStyle setEvenPageHeaderId(java.lang.String evenPageHeaderId) {
    this.evenPageHeaderId = evenPageHeaderId;
    return this;
  }

  /**
   * The ID of the footer used only for the first page. If not set then a unique footer for the
   * first page does not exist. The value of use_first_page_header_footer determines whether to use
   * the default_footer_id or this value for the footer on the first page. If not set, there is no
   * first page footer.
   *
   * This property is read-only.
   * @return value or {@code null} for none
   */
  public java.lang.String getFirstPageFooterId() {
    return firstPageFooterId;
  }

  /**
   * The ID of the footer used only for the first page. If not set then a unique footer for the
   * first page does not exist. The value of use_first_page_header_footer determines whether to use
   * the default_footer_id or this value for the footer on the first page. If not set, there is no
   * first page footer.
   *
   * This property is read-only.
   * @param firstPageFooterId firstPageFooterId or {@code null} for none
   */
  public DocumentStyle setFirstPageFooterId(java.lang.String firstPageFooterId) {
    this.firstPageFooterId = firstPageFooterId;
    return this;
  }

  /**
   * The ID of the header used only for the first page. If not set then a unique header for the
   * first page does not exist. The value of use_first_page_header_footer determines whether to use
   * the default_header_id or this value for the header on the first page. If not set, there is no
   * first page header.
   *
   * This property is read-only.
   * @return value or {@code null} for none
   */
  public java.lang.String getFirstPageHeaderId() {
    return firstPageHeaderId;
  }

  /**
   * The ID of the header used only for the first page. If not set then a unique header for the
   * first page does not exist. The value of use_first_page_header_footer determines whether to use
   * the default_header_id or this value for the header on the first page. If not set, there is no
   * first page header.
   *
   * This property is read-only.
   * @param firstPageHeaderId firstPageHeaderId or {@code null} for none
   */
  public DocumentStyle setFirstPageHeaderId(java.lang.String firstPageHeaderId) {
    this.firstPageHeaderId = firstPageHeaderId;
    return this;
  }

  /**
   * The bottom page margin.
   *
   * Updating the bottom page margin on the document style clears the bottom page margin on all
   * section styles.
   * @return value or {@code null} for none
   */
  public Dimension getMarginBottom() {
    return marginBottom;
  }

  /**
   * The bottom page margin.
   *
   * Updating the bottom page margin on the document style clears the bottom page margin on all
   * section styles.
   * @param marginBottom marginBottom or {@code null} for none
   */
  public DocumentStyle setMarginBottom(Dimension marginBottom) {
    this.marginBottom = marginBottom;
    return this;
  }

  /**
   * The amount of space between the bottom of the page and the contents of the footer.
   * @return value or {@code null} for none
   */
  public Dimension getMarginFooter() {
    return marginFooter;
  }

  /**
   * The amount of space between the bottom of the page and the contents of the footer.
   * @param marginFooter marginFooter or {@code null} for none
   */
  public DocumentStyle setMarginFooter(Dimension marginFooter) {
    this.marginFooter = marginFooter;
    return this;
  }

  /**
   * The amount of space between the top of the page and the contents of the header.
   * @return value or {@code null} for none
   */
  public Dimension getMarginHeader() {
    return marginHeader;
  }

  /**
   * The amount of space between the top of the page and the contents of the header.
   * @param marginHeader marginHeader or {@code null} for none
   */
  public DocumentStyle setMarginHeader(Dimension marginHeader) {
    this.marginHeader = marginHeader;
    return this;
  }

  /**
   * The left page margin.
   *
   * Updating the left page margin on the document style clears the left page margin on all section
   * styles. It may also cause columns to resize in all sections.
   * @return value or {@code null} for none
   */
  public Dimension getMarginLeft() {
    return marginLeft;
  }

  /**
   * The left page margin.
   *
   * Updating the left page margin on the document style clears the left page margin on all section
   * styles. It may also cause columns to resize in all sections.
   * @param marginLeft marginLeft or {@code null} for none
   */
  public DocumentStyle setMarginLeft(Dimension marginLeft) {
    this.marginLeft = marginLeft;
    return this;
  }

  /**
   * The right page margin.
   *
   * Updating the right page margin on the document style clears the right page margin on all
   * section styles. It may also cause columns to resize in all sections.
   * @return value or {@code null} for none
   */
  public Dimension getMarginRight() {
    return marginRight;
  }

  /**
   * The right page margin.
   *
   * Updating the right page margin on the document style clears the right page margin on all
   * section styles. It may also cause columns to resize in all sections.
   * @param marginRight marginRight or {@code null} for none
   */
  public DocumentStyle setMarginRight(Dimension marginRight) {
    this.marginRight = marginRight;
    return this;
  }

  /**
   * The top page margin.
   *
   * Updating the top page margin on the document style clears the top page margin on all section
   * styles.
   * @return value or {@code null} for none
   */
  public Dimension getMarginTop() {
    return marginTop;
  }

  /**
   * The top page margin.
   *
   * Updating the top page margin on the document style clears the top page margin on all section
   * styles.
   * @param marginTop marginTop or {@code null} for none
   */
  public DocumentStyle setMarginTop(Dimension marginTop) {
    this.marginTop = marginTop;
    return this;
  }

  /**
   * The page number from which to start counting the number of pages.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPageNumberStart() {
    return pageNumberStart;
  }

  /**
   * The page number from which to start counting the number of pages.
   * @param pageNumberStart pageNumberStart or {@code null} for none
   */
  public DocumentStyle setPageNumberStart(java.lang.Integer pageNumberStart) {
    this.pageNumberStart = pageNumberStart;
    return this;
  }

  /**
   * The size of a page in the document.
   * @return value or {@code null} for none
   */
  public Size getPageSize() {
    return pageSize;
  }

  /**
   * The size of a page in the document.
   * @param pageSize pageSize or {@code null} for none
   */
  public DocumentStyle setPageSize(Size pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Indicates whether DocumentStyle margin_header, SectionStyle margin_header and DocumentStyle
   * margin_footer, SectionStyle margin_footer are respected. When false, the default values in the
   * Docs editor for header and footer margin are used.
   *
   * This property is read-only.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUseCustomHeaderFooterMargins() {
    return useCustomHeaderFooterMargins;
  }

  /**
   * Indicates whether DocumentStyle margin_header, SectionStyle margin_header and DocumentStyle
   * margin_footer, SectionStyle margin_footer are respected. When false, the default values in the
   * Docs editor for header and footer margin are used.
   *
   * This property is read-only.
   * @param useCustomHeaderFooterMargins useCustomHeaderFooterMargins or {@code null} for none
   */
  public DocumentStyle setUseCustomHeaderFooterMargins(java.lang.Boolean useCustomHeaderFooterMargins) {
    this.useCustomHeaderFooterMargins = useCustomHeaderFooterMargins;
    return this;
  }

  /**
   * Indicates whether to use the even page header / footer IDs for the even pages.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUseEvenPageHeaderFooter() {
    return useEvenPageHeaderFooter;
  }

  /**
   * Indicates whether to use the even page header / footer IDs for the even pages.
   * @param useEvenPageHeaderFooter useEvenPageHeaderFooter or {@code null} for none
   */
  public DocumentStyle setUseEvenPageHeaderFooter(java.lang.Boolean useEvenPageHeaderFooter) {
    this.useEvenPageHeaderFooter = useEvenPageHeaderFooter;
    return this;
  }

  /**
   * Indicates whether to use the first page header / footer IDs for the first page.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUseFirstPageHeaderFooter() {
    return useFirstPageHeaderFooter;
  }

  /**
   * Indicates whether to use the first page header / footer IDs for the first page.
   * @param useFirstPageHeaderFooter useFirstPageHeaderFooter or {@code null} for none
   */
  public DocumentStyle setUseFirstPageHeaderFooter(java.lang.Boolean useFirstPageHeaderFooter) {
    this.useFirstPageHeaderFooter = useFirstPageHeaderFooter;
    return this;
  }

  @Override
  public DocumentStyle set(String fieldName, Object value) {
    return (DocumentStyle) super.set(fieldName, value);
  }

  @Override
  public DocumentStyle clone() {
    return (DocumentStyle) super.clone();
  }

}
