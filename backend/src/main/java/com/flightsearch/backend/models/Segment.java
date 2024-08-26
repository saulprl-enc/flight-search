package com.flightsearch.backend.models;

import java.util.List;

public class Segment {
    private String id;
    private int numberOfStops;
    private boolean blacklistedInEU;
    private List<Co2Emission> co2Emissions;
    private FlightEndPoint departure;
    private FlightEndPoint arrival;
    private String carrierCode;
    private int number;
    private AircraftEquipment aircraft;
    private OperatingFlight operating;
    private String duration;
    private List<FlightStop> stops;

    public Segment() {
    }

    public Segment(String id,
                   int numberOfStops,
                   boolean blacklistedInEU,
                   List<Co2Emission> co2Emissions,
                   FlightEndPoint departure,
                   FlightEndPoint arrival,
                   String carrierCode,
                   int number,
                   AircraftEquipment aircraft,
                   OperatingFlight operating,
                   String duration,
                   List<FlightStop> stops) {
        this.id = id;
        this.numberOfStops = numberOfStops;
        this.blacklistedInEU = blacklistedInEU;
        this.co2Emissions = co2Emissions;
        this.departure = departure;
        this.arrival = arrival;
        this.carrierCode = carrierCode;
        this.number = number;
        this.aircraft = aircraft;
        this.operating = operating;
        this.duration = duration;
        this.stops = stops;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumberOfStops() {
        return numberOfStops;
    }

    public void setNumberOfStops(int numberOfStops) {
        this.numberOfStops = numberOfStops;
    }

    public boolean isBlacklistedInEU() {
        return blacklistedInEU;
    }

    public void setBlacklistedInEU(boolean blacklistedInEU) {
        this.blacklistedInEU = blacklistedInEU;
    }

    public List<Co2Emission> getCo2Emissions() {
        return co2Emissions;
    }

    public void setCo2Emissions(List<Co2Emission> co2Emissions) {
        this.co2Emissions = co2Emissions;
    }

    public FlightEndPoint getDeparture() {
        return departure;
    }

    public void setDeparture(FlightEndPoint departure) {
        this.departure = departure;
    }

    public FlightEndPoint getArrival() {
        return arrival;
    }

    public void setArrival(FlightEndPoint arrival) {
        this.arrival = arrival;
    }

    public String getCarrierCode() {
        return carrierCode;
    }

    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public AircraftEquipment getAircraft() {
        return aircraft;
    }

    public void setAircraft(AircraftEquipment aircraft) {
        this.aircraft = aircraft;
    }

    public OperatingFlight getOperating() {
        return operating;
    }

    public void setOperating(OperatingFlight operating) {
        this.operating = operating;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public List<FlightStop> getStops() {
        return stops;
    }

    public void setStops(List<FlightStop> stops) {
        this.stops = stops;
    }

    @Override
    public String toString() {
        return "Segment{" +
                "id='" + id + '\'' +
                ", numberOfStops=" + numberOfStops +
                ", blacklistedInEU=" + blacklistedInEU +
                ", co2Emissions=" + co2Emissions +
                ", departure=" + departure +
                ", arrival=" + arrival +
                ", carrierCode='" + carrierCode + '\'' +
                ", number=" + number +
                ", aircraft=" + aircraft +
                ", operating=" + operating +
                ", duration='" + duration + '\'' +
                ", stops=" + stops +
                '}';
    }
}
