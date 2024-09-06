package com.flightsearch.backend.dto;

import com.flightsearch.backend.models.CollectionMeta;

import java.util.List;

public record AirportsResponseDto(CollectionMeta meta, List<LocationDto> data) {
}
