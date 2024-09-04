package com.flightsearch.backend.services;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.flightsearch.backend.models.AmadeusResponse;
import com.flightsearch.backend.models.FlightOffer;
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
    public AmadeusResponse<FlightOffer> getFlightOffers(String origin,
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
            ResponseEntity<AmadeusResponse> response = restTemplate
                    .exchange(url, HttpMethod.GET, entity, AmadeusResponse.class);

            return response.getBody();
        } catch (RestClientException rcEx) {
            try {
                ObjectMapper mapper = new ObjectMapper();
                mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

                AmadeusResponse<FlightOffer> res = mapper.readValue(
                        new File("./src/main/java/com/flightsearch/backend/flight-offers.json"),
                        AmadeusResponse.class);

                return res;
            } catch (IOException ioEx) {
                System.out.println(ioEx);
            }
        }

        return null;
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
