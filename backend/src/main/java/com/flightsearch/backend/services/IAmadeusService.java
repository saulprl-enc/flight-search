package com.flightsearch.backend.services;

import java.time.LocalDate;

public interface IAmadeusService {
    String getFlightOffers(String origin,
                           String destination,
                           LocalDate departureDate,
                           LocalDate returnDate,
                           Integer adults,
                           String currencyCode,
                           Boolean nonStop);

    String getAirlineData(String airlineCode);

    String getAirports(String keyword);
}
