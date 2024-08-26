package com.flightsearch.backend.dto;

public record FlightEndPointDto(String iataCode,
                                String terminal,
                                String at) {
}
