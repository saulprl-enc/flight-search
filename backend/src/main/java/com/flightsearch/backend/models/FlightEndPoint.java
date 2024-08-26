package com.flightsearch.backend.models;

public class FlightEndPoint {
    private String iataCode;
    private String terminal;
    private String at;

    public FlightEndPoint() {
    }

    public FlightEndPoint(String iataCode, String terminal, String at) {
        this.iataCode = iataCode;
        this.terminal = terminal;
        this.at = at;
    }

    public String getIataCode() {
        return iataCode;
    }

    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getAt() {
        return at;
    }

    public void setAt(String at) {
        this.at = at;
    }

    @Override
    public String toString() {
        return "FlightEndPoint{" +
                "iataCode='" + iataCode + '\'' +
                ", terminal='" + terminal + '\'' +
                ", at='" + at + '\'' +
                '}';
    }
}
