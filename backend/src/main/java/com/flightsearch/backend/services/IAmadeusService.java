package com.flightsearch.backend.services;

import com.flightsearch.backend.dto.FlightOfferDto;
import com.flightsearch.backend.dto.FlightOffersResponseDto;
import com.flightsearch.backend.models.AmadeusResponse;

import java.time.LocalDate;

public interface IAmadeusService {
    FlightOffersResponseDto getFlightOffers(String origin,
                                            String destination,
                                            LocalDate departureDate,
                                            LocalDate returnDate,
                                            Integer adults,
                                            String currencyCode,
                                            Boolean nonStop);

    String getAirlineData(String airlineCode);

    String getAirports(String keyword);
}
