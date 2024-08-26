package com.flightsearch.backend.services;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class AmadeusAuthService implements IAmadeusAuthService {
    private final String clientId = "0Q0GwQmxvgrXqWexgfoOxW1m74mTwEQx";
    private final String clientSecret = "mxX5aifGpbGsgpTD";
    private final String authUrl = "https://test.api.amadeus.com/v1/security/oauth2/token";

    private String accessToken;
    private long tokenExpirationTime;

    @Override
    public String getAccessToken() {
        if (accessToken == null || isTokenExpired()) {
            authenticate();
        }

        return accessToken;
    }

    private void authenticate() {
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
        body.add("grant_type", "client_credentials");
        body.add("client_id", clientId);
        body.add("client_secret", clientSecret);

        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(body, headers);
        ResponseEntity<Map> response = restTemplate.postForEntity(authUrl, request, Map.class);

        if (response.getStatusCode().is2xxSuccessful()) {
            Map<String, Object> responseBody = response.getBody();
            this.accessToken = (String) responseBody.get("access_token");
            int expiresIn = (Integer) responseBody.get("expires_in");
            this.tokenExpirationTime = System.currentTimeMillis() + (expiresIn * 1000);
        } else {
            throw new RuntimeException("Failed to authenticate with Amadeus API");
        }
    }

    private boolean isTokenExpired() {
        return System.currentTimeMillis() > tokenExpirationTime;
    }
}
