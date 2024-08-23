package com.flightsearch.backend.models;

public class Address {
    private String cityName;
    private String cityCode;
    private String countryName;
    private String countryCode;
    private String stateCode;
    private String regionCode;

    public Address(String cityName, String cityCode, String countryName, String countryCode, String stateCode, String regionCode) {
        this.cityName = cityName;
        this.cityCode = cityCode;
        this.countryName = countryName;
        this.countryCode = countryCode;
        this.stateCode = stateCode;
        this.regionCode = regionCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }
}
