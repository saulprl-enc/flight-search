package com.flightsearch.backend.models;

import java.util.List;

public class TravelerPricing {
    private String travelerId;
    private TravelerPricingFareOption fareOption;
    private TravelerType travelerType;
    private String associatedAdultId;
    private Price price;
    private List<FareDetailsBySegment> fareDetailsBySegments;

    public TravelerPricing() {
    }

    public TravelerPricing(String travelerId,
                           TravelerPricingFareOption fareOption,
                           TravelerType travelerType,
                           String associatedAdultId,
                           Price price,
                           List<FareDetailsBySegment> fareDetailsBySegments) {
        this.travelerId = travelerId;
        this.fareOption = fareOption;
        this.travelerType = travelerType;
        this.associatedAdultId = associatedAdultId;
        this.price = price;
        this.fareDetailsBySegments = fareDetailsBySegments;
    }

    public String getTravelerId() {
        return travelerId;
    }

    public void setTravelerId(String travelerId) {
        this.travelerId = travelerId;
    }

    public TravelerPricingFareOption getFareOption() {
        return fareOption;
    }

    public void setFareOption(TravelerPricingFareOption fareOption) {
        this.fareOption = fareOption;
    }

    public TravelerType getTravelerType() {
        return travelerType;
    }

    public void setTravelerType(TravelerType travelerType) {
        this.travelerType = travelerType;
    }

    public String getAssociatedAdultId() {
        return associatedAdultId;
    }

    public void setAssociatedAdultId(String associatedAdultId) {
        this.associatedAdultId = associatedAdultId;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public List<FareDetailsBySegment> getFareDetailsBySegments() {
        return fareDetailsBySegments;
    }

    public void setFareDetailsBySegments(List<FareDetailsBySegment> fareDetailsBySegments) {
        this.fareDetailsBySegments = fareDetailsBySegments;
    }
}
