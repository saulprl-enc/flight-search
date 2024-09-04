package com.flightsearch.backend.services;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.flightsearch.backend.dto.FlightEndPointDto;
import com.flightsearch.backend.dto.FlightOfferDto;
import com.flightsearch.backend.dto.ItineraryDto;
import com.flightsearch.backend.dto.SegmentDto;
import com.flightsearch.backend.models.FlightOffer;
import com.flightsearch.backend.models.FlightOfferSource;
import com.flightsearch.backend.models.FlightOffersResponse;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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

        try {
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = getBasicHeaders();

            HttpEntity<String> entity = new HttpEntity<>(headers);
            ResponseEntity<FlightOffersResponse> response = restTemplate
                    .exchange(url, HttpMethod.GET, entity, FlightOffersResponse.class);

            System.out.println("Response: " + response.getBody());
        } catch (RestClientException rcEx) {
            try {
                ObjectMapper mapper = new ObjectMapper();
                mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

                FlightOffersResponse res = mapper.readValue(new File("./src/main/java/com/flightsearch/backend/flight-offers.json"), FlightOffersResponse.class);

                System.out.println(res);
            } catch (IOException ioEx) {
                System.out.println(ioEx);
            }
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
