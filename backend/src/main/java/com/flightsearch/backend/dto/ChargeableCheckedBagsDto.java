package com.flightsearch.backend.dto;

public record ChargeableCheckedBagsDto(Integer quantity,
                                       String weight,
                                       String weightUnit,
                                       String id) {
}
