package com.flightsearch.backend.models;

import java.util.List;

public class FlightOffersResponse {
    private CollectionMeta meta;
    private List<FlightOffer> data;

    public FlightOffersResponse() {
    }

    public FlightOffersResponse(CollectionMeta meta, List<FlightOffer> data) {
        this.meta = meta;
        this.data = data;
    }

    public CollectionMeta getMeta() {
        return meta;
    }

    public void setMeta(CollectionMeta meta) {
        this.meta = meta;
    }

    public List<FlightOffer> getData() {
        return data;
    }

    public void setData(List<FlightOffer> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "FlightOffersResponse{" +
                "meta=" + meta +
                ", data=" + data +
                '}';
    }
}
