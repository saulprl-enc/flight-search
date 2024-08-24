package com.flightsearch.backend.models;

import java.util.List;

public class FlightOffer {
    private String type;
    private String id;
    private FlightOfferSource source;
    private boolean instantTicketingRequired;
    private boolean disablePricing;
    private boolean nonHomogeneous;
    private boolean oneWay;
    private boolean paymentCardRequired;
    private String lastTicketingDate;
    private String lastTicketingDateTime;
    private int numberOfBookableSeats;
    private List<Itinerary> itineraries;
    private Price price;
    private PricingOptions pricingOptions;
    private List<String> validatingAirlineCodes;
    private List<TravelerPricing> travelerPricings;

    public FlightOffer() {
    }

    public FlightOffer(String type,
                       String id,
                       FlightOfferSource source,
                       boolean instantTicketingRequired,
                       boolean disablePricing,
                       boolean nonHomogeneous,
                       boolean oneWay,
                       boolean paymentCardRequired,
                       String lastTicketingDate,
                       String lastTicketingDateTime,
                       int numberOfBookableSeats,
                       List<Itinerary> itineraries,
                       Price price,
                       PricingOptions pricingOptions,
                       List<String> validatingAirlineCodes,
                       List<TravelerPricing> travelerPricings) {
        this.type = type;
        this.id = id;
        this.source = source;
        this.instantTicketingRequired = instantTicketingRequired;
        this.disablePricing = disablePricing;
        this.nonHomogeneous = nonHomogeneous;
        this.oneWay = oneWay;
        this.paymentCardRequired = paymentCardRequired;
        this.lastTicketingDate = lastTicketingDate;
        this.lastTicketingDateTime = lastTicketingDateTime;
        this.numberOfBookableSeats = numberOfBookableSeats;
        this.itineraries = itineraries;
        this.price = price;
        this.pricingOptions = pricingOptions;
        this.validatingAirlineCodes = validatingAirlineCodes;
        this.travelerPricings = travelerPricings;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FlightOfferSource getSource() {
        return source;
    }

    public void setSource(FlightOfferSource source) {
        this.source = source;
    }

    public boolean isInstantTicketingRequired() {
        return instantTicketingRequired;
    }

    public void setInstantTicketingRequired(boolean instantTicketingRequired) {
        this.instantTicketingRequired = instantTicketingRequired;
    }

    public boolean isDisablePricing() {
        return disablePricing;
    }

    public void setDisablePricing(boolean disablePricing) {
        this.disablePricing = disablePricing;
    }

    public boolean isNonHomogeneous() {
        return nonHomogeneous;
    }

    public void setNonHomogeneous(boolean nonHomogeneous) {
        this.nonHomogeneous = nonHomogeneous;
    }

    public boolean isOneWay() {
        return oneWay;
    }

    public void setOneWay(boolean oneWay) {
        this.oneWay = oneWay;
    }

    public boolean isPaymentCardRequired() {
        return paymentCardRequired;
    }

    public void setPaymentCardRequired(boolean paymentCardRequired) {
        this.paymentCardRequired = paymentCardRequired;
    }

    public String getLastTicketingDate() {
        return lastTicketingDate;
    }

    public void setLastTicketingDate(String lastTicketingDate) {
        this.lastTicketingDate = lastTicketingDate;
    }

    public String getLastTicketingDateTime() {
        return lastTicketingDateTime;
    }

    public void setLastTicketingDateTime(String lastTicketingDateTime) {
        this.lastTicketingDateTime = lastTicketingDateTime;
    }

    public int getNumberOfBookableSeats() {
        return numberOfBookableSeats;
    }

    public void setNumberOfBookableSeats(int numberOfBookableSeats) {
        this.numberOfBookableSeats = numberOfBookableSeats;
    }

    public List<Itinerary> getItineraries() {
        return itineraries;
    }

    public void setItineraries(List<Itinerary> itineraries) {
        this.itineraries = itineraries;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public PricingOptions getPricingOptions() {
        return pricingOptions;
    }

    public void setPricingOptions(PricingOptions pricingOptions) {
        this.pricingOptions = pricingOptions;
    }

    public List<String> getValidatingAirlineCodes() {
        return validatingAirlineCodes;
    }

    public void setValidatingAirlineCodes(List<String> validatingAirlineCodes) {
        this.validatingAirlineCodes = validatingAirlineCodes;
    }

    public List<TravelerPricing> getTravelerPricings() {
        return travelerPricings;
    }

    public void setTravelerPricings(List<TravelerPricing> travelerPricings) {
        this.travelerPricings = travelerPricings;
    }
}
