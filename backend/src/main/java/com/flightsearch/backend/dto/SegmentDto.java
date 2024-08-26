package com.flightsearch.backend.dto;

import java.util.List;

public record SegmentDto(String id,
                         Integer numberOfStops,
                         FlightEndPointDto departure,
                         FlightEndPointDto arrival,
                         String duration,
                         List<FlightStopDto> stops) {
}
