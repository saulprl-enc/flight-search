package com.flightsearch.backend.services;

import com.flightsearch.backend.models.AmadeusResponse;
import com.flightsearch.backend.models.FlightOffer;

import java.time.LocalDate;

public interface IAmadeusService {
    AmadeusResponse<FlightOffer> getFlightOffers(String origin,
                                                 String destination,
                                                 LocalDate departureDate,
                                                 LocalDate returnDate,
                                                 Integer adults,
                                                 String currencyCode,
                                                 Boolean nonStop);

    String getAirlineData(String airlineCode);

    String getAirports(String keyword);
}
