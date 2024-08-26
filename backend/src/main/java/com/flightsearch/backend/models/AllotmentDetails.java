package com.flightsearch.backend.models;

public class AllotmentDetails {
    private String tourName;
    private String tourReference;

    public AllotmentDetails() {
    }

    public AllotmentDetails(String tourName, String tourReference) {
        this.tourName = tourName;
        this.tourReference = tourReference;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public String getTourReference() {
        return tourReference;
    }

    public void setTourReference(String tourReference) {
        this.tourReference = tourReference;
    }

    @Override
    public String toString() {
        return "AllotmentDetails{" +
                "tourName='" + tourName + '\'' +
                ", tourReference='" + tourReference + '\'' +
                '}';
    }
}
