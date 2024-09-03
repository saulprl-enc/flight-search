package com.flightsearch.backend.dto;

import java.util.List;

public class FlightOffersResponseDto {
    private List<FlightOfferDto> data;

    public FlightOffersResponseDto() {
    }

    public FlightOffersResponseDto(List<FlightOfferDto> data) {
        this.data = data;
    }

    public List<FlightOfferDto> getData() {
        return data;
    }

    public void setData(List<FlightOfferDto> data) {
        this.data = data;
    }
}
