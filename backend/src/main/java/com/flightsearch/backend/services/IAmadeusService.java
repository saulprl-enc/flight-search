package com.flightsearch.backend.services;

import com.flightsearch.backend.dto.AirlinesResponseDto;
import com.flightsearch.backend.dto.AirportsResponseDto;
import com.flightsearch.backend.dto.FlightOffersResponseDto;

import java.time.LocalDate;

public interface IAmadeusService {
    FlightOffersResponseDto getFlightOffers(String origin,
                                            String destination,
                                            LocalDate departureDate,
                                            LocalDate returnDate,
                                            Integer adults,
                                            String currencyCode,
                                            Boolean nonStop);

    AirlinesResponseDto getAirlineData(String airlineCode);

    AirportsResponseDto getAirports(String keyword, int limit, int offset);
}
