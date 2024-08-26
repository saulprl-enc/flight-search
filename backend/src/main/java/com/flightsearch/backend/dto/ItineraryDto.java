package com.flightsearch.backend.dto;

import com.flightsearch.backend.models.Segment;

import java.util.List;

public record ItineraryDto(String duration,
                           List<Segment> segments) {
}
