package com.flightsearch.backend.models;

import java.util.List;

public class FlightOffersResponse implements AmadeusResponse<FlightOffer> {
    private CollectionMeta meta;
    private List<FlightOffer> data;

    public FlightOffersResponse() {
    }

    public FlightOffersResponse(CollectionMeta meta, List<FlightOffer> data) {
        this.meta = meta;
        this.data = data;
    }

    @Override
    public CollectionMeta getMeta() {
        return meta;
    }

    @Override
    public void setMeta(CollectionMeta meta) {
        this.meta = meta;
    }

    @Override
    public List<FlightOffer> getData() {
        return data;
    }

    @Override
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
