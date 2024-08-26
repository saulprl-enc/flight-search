package com.flightsearch.backend.dto;

public record FlightStopDto(String iataCode,
                            String duration,
                            String arrivalAt,
                            String departureAt) {
}
