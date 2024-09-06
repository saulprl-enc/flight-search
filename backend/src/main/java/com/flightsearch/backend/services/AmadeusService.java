package com.flightsearch.backend.services;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.flightsearch.backend.dto.AirlineDto;
import com.flightsearch.backend.dto.AirlinesResponseDto;
import com.flightsearch.backend.dto.FlightOfferDto;
import com.flightsearch.backend.dto.FlightOffersResponseDto;
import com.flightsearch.backend.mapper.AirlineMapper;
import com.flightsearch.backend.mapper.FlightOfferMapper;
import com.flightsearch.backend.models.AirlinesResponse;
import com.flightsearch.backend.models.AmadeusResponse;
import com.flightsearch.backend.models.FlightOffer;
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
import java.time.LocalDate;
import java.util.List;

@Service
public class AmadeusService implements IAmadeusService {
    private final FlightOfferMapper flightOfferMapper;
    private final AirlineMapper airlineMapper;
    private final IAmadeusAuthService amadeusAuthService;

    private String baseUrl = "https://test.api.amadeus.com";
    private String flightOffersEndpoint = "/v2/shopping/flight-offers";
    private String airlinesEndpoint = "/v1/reference-data/airlines";
    private String airportsEndpoint = "/v1/reference-data/locations";

    public AmadeusService(IAmadeusAuthService amadeusAuthService,
                          FlightOfferMapper flightOfferMapper,
                          AirlineMapper airlineMapper) {
        this.amadeusAuthService = amadeusAuthService;
        this.flightOfferMapper = flightOfferMapper;
        this.airlineMapper = airlineMapper;
    }

    @Override
    public FlightOffersResponseDto getFlightOffers(String origin,
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

            FlightOffersResponse responseBody = response.getBody();
            FlightOffersResponseDto dtoResponse = mapFlightOffersToDto(responseBody);

            return dtoResponse;
        } catch (RestClientException rcEx) {
            if (rcEx.getMessage().startsWith("500")) {
                try {
                    ObjectMapper mapper = new ObjectMapper();
                    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

                    FlightOffersResponse res = mapper.readValue(
                            new File("./src/main/java/com/flightsearch/backend/flight-offers.json"),
                            FlightOffersResponse.class);

                    return mapFlightOffersToDto(res);
                } catch (IOException ioEx) {
                    System.out.println(ioEx);
                }
            }
        }

        return null;
    }

    @Override
    public AirlinesResponseDto getAirlineData(String airlineCode) {
        String url = UriComponentsBuilder
                .fromUriString(baseUrl)
                .path(airlinesEndpoint)
                .queryParam("airlineCodes", airlineCode)
                .build().toUriString();

        try {
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = getBasicHeaders();

            HttpEntity<String> entity = new HttpEntity<>(headers);
            ResponseEntity<AirlinesResponse> response = restTemplate
                    .exchange(url, HttpMethod.GET, entity, AirlinesResponse.class);

            AirlinesResponse responseBody = response.getBody();

            AirlinesResponseDto dtoResponse = mapAirlinesToDto(responseBody);

            return dtoResponse;
        } catch (RestClientException rcEx) {

        }

        return null;
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

    private FlightOffersResponseDto mapFlightOffersToDto(FlightOffersResponse flightOffers) {
        List<FlightOfferDto> flightOfferDtoList = flightOfferMapper.convertToDtoList(flightOffers.getData());

        return new FlightOffersResponseDto(flightOfferDtoList);
    }

    private AirlinesResponseDto mapAirlinesToDto(AirlinesResponse airlines) {
        List<AirlineDto> airlinesDtoList = airlineMapper.convertToDtoList(airlines.getData());

        return new AirlinesResponseDto(airlinesDtoList);
    }
}
