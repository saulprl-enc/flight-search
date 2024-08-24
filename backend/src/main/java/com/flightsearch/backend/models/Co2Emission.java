package com.flightsearch.backend.models;

public class Co2Emission {
    private int weight;
    private String weightUnit;
    private TravelClass cabin;

    public Co2Emission() {
    }

    public Co2Emission(int weight, String weightUnit, TravelClass cabin) {
        this.weight = weight;
        this.weightUnit = weightUnit;
        this.cabin = cabin;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    public TravelClass getCabin() {
        return cabin;
    }

    public void setCabin(TravelClass cabin) {
        this.cabin = cabin;
    }
}
