package com.flightsearch.backend.models;

public class OperatingFlight {
    private String carrierCode;

    public OperatingFlight() {
    }

    public OperatingFlight(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    public String getCarrierCode() {
        return carrierCode;
    }

    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    @Override
    public String toString() {
        return "OperatingFlight{" +
                "carrierCode='" + carrierCode + '\'' +
                '}';
    }
}
