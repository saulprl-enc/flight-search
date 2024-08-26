package com.flightsearch.backend.services;

import com.flightsearch.backend.models.FlightOffersResponse;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.time.LocalDate;

@Service
public class AmadeusService implements IAmadeusService {
    private final IAmadeusAuthService amadeusAuthService;

    private String baseUrl = "https://test.api.amadeus.com";
    private String flightOffersEndpoint = "/v2/shopping/flight-offers";
    private String airlinesEndpoint = "/v1/reference-data/airlines";
    private String airportsEndpoint = "/v1/reference-data/locations";

    public AmadeusService(IAmadeusAuthService amadeusAuthService) {
        this.amadeusAuthService = amadeusAuthService;
    }

    @Override
    public String getFlightOffers(String origin,
                                  String destination,
                                  LocalDate departureDate,
                                  LocalDate returnDate,
                                  Integer adults,
                                  String currencyCode,
                                  Boolean nonStop) {
        String url = UriComponentsBuilder
                .fromUriString(baseUrl)
                .path(flightOffersEndpoint)
                .queryParam("originLocationCode", origin)
                .queryParam("destinationLocationCode", destination)
                .queryParam("departureDate", departureDate)
                .queryParam("returnDate", returnDate)
                .queryParam("adults", adults)
                .queryParam("currencyCode", currencyCode)
                .queryParam("nonStop", nonStop)
                .build().toUriString();

        System.out.println(url);

        try {
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = getBasicHeaders();

            HttpEntity<String> entity = new HttpEntity<>(headers);
            ResponseEntity<FlightOffersResponse> response = restTemplate
                    .exchange(url, HttpMethod.GET, entity, FlightOffersResponse.class);

            System.out.println("Response: " + response.getBody());
        } catch (RestClientException rcEx) {
            System.out.println("Exception: " + rcEx.getMessage());
        }

        return "";
    }

    @Override
    public String getAirlineData(String airlineCode) {
        return "";
    }

    @Override
    public String getAirports(String keyword) {
        return "";
    }

    private HttpHeaders getBasicHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + amadeusAuthService.getAccessToken());

        return headers;
    }
}
