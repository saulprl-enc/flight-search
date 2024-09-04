package com.flightsearch.backend.dto;

public record AirlineDto(String type,
                         String iataCode,
                         String icaoCode,
                         String businessName,
                         String commonName) {
}
