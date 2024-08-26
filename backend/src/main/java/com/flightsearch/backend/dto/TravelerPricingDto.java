package com.flightsearch.backend.dto;

import com.flightsearch.backend.models.TravelerPricingFareOption;
import com.flightsearch.backend.models.TravelerType;

public record TravelerPricingDto(String travelerId,
                                 TravelerPricingFareOption fareOption,
                                 TravelerType travelerType,
                                 PriceDto price) {
}
