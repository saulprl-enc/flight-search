package com.flightsearch.backend.models;

public class ChargeableSeat {
    private String id;
    private int number;

    public ChargeableSeat() {
    }

    public ChargeableSeat(String id, int number) {
        this.id = id;
        this.number = number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "ChargeableSeat{" +
                "id='" + id + '\'' +
                ", number=" + number +
                '}';
    }
}
