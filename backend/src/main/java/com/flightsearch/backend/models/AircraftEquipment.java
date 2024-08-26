package com.flightsearch.backend.models;

public class AircraftEquipment {
    private String code;

    public AircraftEquipment() {
    }

    public AircraftEquipment(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "AircraftEquipment{" +
                "code='" + code + '\'' +
                '}';
    }
}
