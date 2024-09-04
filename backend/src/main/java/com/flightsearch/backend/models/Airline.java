package com.flightsearch.backend.models;

public class Airline {
    private String type;
    private String iataCode;
    private String icaoCode;
    private String businessName;
    private String commonName;

    public Airline() {
    }

    public Airline(String type, String iataCode, String icaoCode, String businessName, String commonName) {
        this.type = type;
        this.iataCode = iataCode;
        this.icaoCode = icaoCode;
        this.businessName = businessName;
        this.commonName = commonName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIataCode() {
        return iataCode;
    }

    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
    }

    public String getIcaoCode() {
        return icaoCode;
    }

    public void setIcaoCode(String icaoCode) {
        this.icaoCode = icaoCode;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }
}
