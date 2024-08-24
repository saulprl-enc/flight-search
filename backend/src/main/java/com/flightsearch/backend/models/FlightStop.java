package com.flightsearch.backend.models;

public class FlightStop {
    private String iataCode;
    private String duration;
    private String arrivalAt;
    private String departureAt;

    public FlightStop() {
    }

    public FlightStop(String iataCode, String duration, String arrivalAt, String departureAt) {
        this.iataCode = iataCode;
        this.duration = duration;
        this.arrivalAt = arrivalAt;
        this.departureAt = departureAt;
    }

    public String getIataCode() {
        return iataCode;
    }

    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getArrivalAt() {
        return arrivalAt;
    }

    public void setArrivalAt(String arrivalAt) {
        this.arrivalAt = arrivalAt;
    }

    public String getDepartureAt() {
        return departureAt;
    }

    public void setDepartureAt(String departureAt) {
        this.departureAt = departureAt;
    }
}
