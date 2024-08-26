package com.flightsearch.backend.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FareDetailsBySegment {
    private String segmentId;
    private TravelClass cabin;
    private String fareBasis;
    private String brandedFare;

    @JsonProperty("class")
    private String bookingClass;
    private boolean isAllotment;
    private AllotmentDetails allotmentDetails;
    private SliceDiceIndicator sliceDiceIndicator;
    private BaggageAllowance includedCheckedBags;
    private AdditionalServicesRequest additionalServicesRequest;

    public FareDetailsBySegment() {
    }

    public FareDetailsBySegment(String segmentId,
                                TravelClass cabin,
                                String fareBasis,
                                String brandedFare,
                                String bookingClass,
                                boolean isAllotment,
                                AllotmentDetails allotmentDetails,
                                SliceDiceIndicator sliceDiceIndicator,
                                BaggageAllowance includedCheckedBags,
                                AdditionalServicesRequest additionalServicesRequest) {
        this.segmentId = segmentId;
        this.cabin = cabin;
        this.fareBasis = fareBasis;
        this.brandedFare = brandedFare;
        this.bookingClass = bookingClass;
        this.isAllotment = isAllotment;
        this.allotmentDetails = allotmentDetails;
        this.sliceDiceIndicator = sliceDiceIndicator;
        this.includedCheckedBags = includedCheckedBags;
        this.additionalServicesRequest = additionalServicesRequest;
    }

    public String getSegmentId() {
        return segmentId;
    }

    public void setSegmentId(String segmentId) {
        this.segmentId = segmentId;
    }

    public TravelClass getCabin() {
        return cabin;
    }

    public void setCabin(TravelClass cabin) {
        this.cabin = cabin;
    }

    public String getFareBasis() {
        return fareBasis;
    }

    public void setFareBasis(String fareBasis) {
        this.fareBasis = fareBasis;
    }

    public String getBrandedFare() {
        return brandedFare;
    }

    public void setBrandedFare(String brandedFare) {
        this.brandedFare = brandedFare;
    }

    public String getBookingClass() {
        return bookingClass;
    }

    public void setBookingClass(String bookingClass) {
        this.bookingClass = bookingClass;
    }

    public boolean isAllotment() {
        return isAllotment;
    }

    public void setAllotment(boolean allotment) {
        isAllotment = allotment;
    }

    public AllotmentDetails getAllotmentDetails() {
        return allotmentDetails;
    }

    public void setAllotmentDetails(AllotmentDetails allotmentDetails) {
        this.allotmentDetails = allotmentDetails;
    }

    public SliceDiceIndicator getSliceDiceIndicator() {
        return sliceDiceIndicator;
    }

    public void setSliceDiceIndicator(SliceDiceIndicator sliceDiceIndicator) {
        this.sliceDiceIndicator = sliceDiceIndicator;
    }

    public BaggageAllowance getIncludedCheckedBags() {
        return includedCheckedBags;
    }

    public void setIncludedCheckedBags(BaggageAllowance includedCheckedBags) {
        this.includedCheckedBags = includedCheckedBags;
    }

    public AdditionalServicesRequest getAdditionalServicesRequest() {
        return additionalServicesRequest;
    }

    public void setAdditionalServicesRequest(AdditionalServicesRequest additionalServicesRequest) {
        this.additionalServicesRequest = additionalServicesRequest;
    }

    @Override
    public String toString() {
        return "FareDetailsBySegment{" +
                "segmentId='" + segmentId + '\'' +
                ", cabin=" + cabin +
                ", fareBasis='" + fareBasis + '\'' +
                ", brandedFare='" + brandedFare + '\'' +
                ", bookingClass='" + bookingClass + '\'' +
                ", isAllotment=" + isAllotment +
                ", allotmentDetails=" + allotmentDetails +
                ", sliceDiceIndicator=" + sliceDiceIndicator +
                ", includedCheckedBags=" + includedCheckedBags +
                ", additionalServicesRequest=" + additionalServicesRequest +
                '}';
    }
}
