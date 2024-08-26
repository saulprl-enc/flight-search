package com.flightsearch.backend.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AmadeusAuthResponse {
    private String type;
    private String username;
    @JsonProperty("application_name")
    private String applicationName;
    @JsonProperty("client_id")
    private String clientId;
    @JsonProperty("token_type")
    private String tokenType;
    @JsonProperty("access_token")
    private String accessToken;
    @JsonProperty("expires_in")
    private int expiresIn;
    private String state;
    private String scope;

    public AmadeusAuthResponse() {
    }

    public AmadeusAuthResponse(String type,
                               String username,
                               String applicationName,
                               String clientId,
                               String tokenType,
                               String accessToken,
                               int expiresIn,
                               String state,
                               String scope) {
        this.type = type;
        this.username = username;
        this.applicationName = applicationName;
        this.clientId = clientId;
        this.tokenType = tokenType;
        this.accessToken = accessToken;
        this.expiresIn = expiresIn;
        this.state = state;
        this.scope = scope;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public int getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(int expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @Override
    public String toString() {
        return "AmadeusAuthResponse{" +
                "type='" + type + '\'' +
                ", username='" + username + '\'' +
                ", applicationName='" + applicationName + '\'' +
                ", clientId='" + clientId + '\'' +
                ", tokenType='" + tokenType + '\'' +
                ", accessToken='" + accessToken + '\'' +
                ", expiresIn=" + expiresIn +
                ", state='" + state + '\'' +
                ", scope='" + scope + '\'' +
                '}';
    }
}
