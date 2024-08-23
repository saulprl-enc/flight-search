package com.flightsearch.backend.models;

public class Analytics {
    private Travelers travelers;

    public Analytics(Travelers travelers) {
        this.travelers = travelers;
    }

    public Travelers getTravelers() {
        return travelers;
    }

    public void setTravelers(Travelers travelers) {
        this.travelers = travelers;
    }
}
