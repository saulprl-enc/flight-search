package com.flightsearch.backend.dto;

import com.flightsearch.backend.models.FeeType;

public record FeeDto(String amount,
                     FeeType type) {
}
