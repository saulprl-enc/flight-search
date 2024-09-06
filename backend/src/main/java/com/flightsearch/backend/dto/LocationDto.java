package com.flightsearch.backend.dto;

import com.flightsearch.backend.models.Address;
import com.flightsearch.backend.models.Distance;
import com.flightsearch.backend.models.GeoCode;
import com.flightsearch.backend.models.LocationCategory;

public record LocationDto(String id,
                          String type,
                          String subType,
                          String name,
                          String detailedName,
                          String timeZoneOffset,
                          String iataCode,
                          GeoCode geoCode,
                          Address address,
                          Distance distance,
                          LocationCategory category,
                          double relevance,
                          String rank) {
}
