package com.flightsearch.backend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.flightsearch.backend.models.TravelClass;

public record FareDetailsBySegmentDto(String segmentId,
                                      TravelClass cabin,
                                      @JsonProperty("class") String classValue,
                                      AdditionalServicesRequestDto additionalServices) {
}
