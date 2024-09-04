package com.flightsearch.backend.models;

import java.util.List;

public class AmadeusResponse<T> {
    private CollectionMeta meta;
    private List<T> data;

    public AmadeusResponse() {
    }

    public AmadeusResponse(CollectionMeta meta, List<T> data) {
        this.meta = meta;
        this.data = data;
    }

    public CollectionMeta getMeta() {
        return meta;
    }

    public void setMeta(CollectionMeta meta) {
        this.meta = meta;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
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
