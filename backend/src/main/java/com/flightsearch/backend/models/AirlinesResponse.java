package com.flightsearch.backend.models;

import java.util.List;

public class AirlinesResponse implements AmadeusResponse<Airline> {
    private CollectionMeta meta;
    private List<Airline> data;

    public AirlinesResponse() {
    }

    public AirlinesResponse(CollectionMeta meta, List<Airline> data) {
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
    public List<Airline> getData() {
        return data;
    }

    @Override
    public void setData(List<Airline> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "AirlinesResponse{" +
                "meta=" + meta +
                ", data=" + data +
                '}';
    }
}
