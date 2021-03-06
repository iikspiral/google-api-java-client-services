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

package com.google.api.services.identitytoolkit.model;

/**
 * Request of verifying the password.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Identity Toolkit API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VerifyPasswordResponse extends com.google.api.client.json.GenericJson {

  /**
   * The name of the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The email returned by the IdP. NOTE: The federated login user may not own the email.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String email;

  /**
   * If idToken is STS id token, then this field will be expiration time of STS id token in seconds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long expiresIn;

  /**
   * The GITKit token for authenticated user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String idToken;

  /**
   * The fixed string "identitytoolkit#VerifyPasswordResponse".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The RP local ID if it's already been mapped to the IdP account identified by the federated ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String localId;

  /**
   * The OAuth2 access token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String oauthAccessToken;

  /**
   * The OAuth2 authorization code.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String oauthAuthorizationCode;

  /**
   * The lifetime in seconds of the OAuth2 access token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer oauthExpireIn;

  /**
   * The URI of the user's photo at IdP
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String photoUrl;

  /**
   * If idToken is STS id token, then this field will be refresh token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String refreshToken;

  /**
   * Whether the email is registered.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean registered;

  /**
   * The name of the user.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The name of the user.
   * @param displayName displayName or {@code null} for none
   */
  public VerifyPasswordResponse setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The email returned by the IdP. NOTE: The federated login user may not own the email.
   * @return value or {@code null} for none
   */
  public java.lang.String getEmail() {
    return email;
  }

  /**
   * The email returned by the IdP. NOTE: The federated login user may not own the email.
   * @param email email or {@code null} for none
   */
  public VerifyPasswordResponse setEmail(java.lang.String email) {
    this.email = email;
    return this;
  }

  /**
   * If idToken is STS id token, then this field will be expiration time of STS id token in seconds.
   * @return value or {@code null} for none
   */
  public java.lang.Long getExpiresIn() {
    return expiresIn;
  }

  /**
   * If idToken is STS id token, then this field will be expiration time of STS id token in seconds.
   * @param expiresIn expiresIn or {@code null} for none
   */
  public VerifyPasswordResponse setExpiresIn(java.lang.Long expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

  /**
   * The GITKit token for authenticated user.
   * @return value or {@code null} for none
   */
  public java.lang.String getIdToken() {
    return idToken;
  }

  /**
   * The GITKit token for authenticated user.
   * @param idToken idToken or {@code null} for none
   */
  public VerifyPasswordResponse setIdToken(java.lang.String idToken) {
    this.idToken = idToken;
    return this;
  }

  /**
   * The fixed string "identitytoolkit#VerifyPasswordResponse".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The fixed string "identitytoolkit#VerifyPasswordResponse".
   * @param kind kind or {@code null} for none
   */
  public VerifyPasswordResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The RP local ID if it's already been mapped to the IdP account identified by the federated ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocalId() {
    return localId;
  }

  /**
   * The RP local ID if it's already been mapped to the IdP account identified by the federated ID.
   * @param localId localId or {@code null} for none
   */
  public VerifyPasswordResponse setLocalId(java.lang.String localId) {
    this.localId = localId;
    return this;
  }

  /**
   * The OAuth2 access token.
   * @return value or {@code null} for none
   */
  public java.lang.String getOauthAccessToken() {
    return oauthAccessToken;
  }

  /**
   * The OAuth2 access token.
   * @param oauthAccessToken oauthAccessToken or {@code null} for none
   */
  public VerifyPasswordResponse setOauthAccessToken(java.lang.String oauthAccessToken) {
    this.oauthAccessToken = oauthAccessToken;
    return this;
  }

  /**
   * The OAuth2 authorization code.
   * @return value or {@code null} for none
   */
  public java.lang.String getOauthAuthorizationCode() {
    return oauthAuthorizationCode;
  }

  /**
   * The OAuth2 authorization code.
   * @param oauthAuthorizationCode oauthAuthorizationCode or {@code null} for none
   */
  public VerifyPasswordResponse setOauthAuthorizationCode(java.lang.String oauthAuthorizationCode) {
    this.oauthAuthorizationCode = oauthAuthorizationCode;
    return this;
  }

  /**
   * The lifetime in seconds of the OAuth2 access token.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getOauthExpireIn() {
    return oauthExpireIn;
  }

  /**
   * The lifetime in seconds of the OAuth2 access token.
   * @param oauthExpireIn oauthExpireIn or {@code null} for none
   */
  public VerifyPasswordResponse setOauthExpireIn(java.lang.Integer oauthExpireIn) {
    this.oauthExpireIn = oauthExpireIn;
    return this;
  }

  /**
   * The URI of the user's photo at IdP
   * @return value or {@code null} for none
   */
  public java.lang.String getPhotoUrl() {
    return photoUrl;
  }

  /**
   * The URI of the user's photo at IdP
   * @param photoUrl photoUrl or {@code null} for none
   */
  public VerifyPasswordResponse setPhotoUrl(java.lang.String photoUrl) {
    this.photoUrl = photoUrl;
    return this;
  }

  /**
   * If idToken is STS id token, then this field will be refresh token.
   * @return value or {@code null} for none
   */
  public java.lang.String getRefreshToken() {
    return refreshToken;
  }

  /**
   * If idToken is STS id token, then this field will be refresh token.
   * @param refreshToken refreshToken or {@code null} for none
   */
  public VerifyPasswordResponse setRefreshToken(java.lang.String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  /**
   * Whether the email is registered.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRegistered() {
    return registered;
  }

  /**
   * Whether the email is registered.
   * @param registered registered or {@code null} for none
   */
  public VerifyPasswordResponse setRegistered(java.lang.Boolean registered) {
    this.registered = registered;
    return this;
  }

  @Override
  public VerifyPasswordResponse set(String fieldName, Object value) {
    return (VerifyPasswordResponse) super.set(fieldName, value);
  }

  @Override
  public VerifyPasswordResponse clone() {
    return (VerifyPasswordResponse) super.clone();
  }

}
