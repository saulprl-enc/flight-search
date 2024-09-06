package com.flightsearch.backend.models;

import java.util.List;

public class AirportsResponse implements AmadeusResponse<Location> {
    private CollectionMeta meta;
    private List<Location> data;

    public AirportsResponse() {
    }

    public AirportsResponse(CollectionMeta meta, List<Location> data) {
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
    public List<Location> getData() {
        return data;
    }

    @Override
    public void setData(List<Location> data) {
        this.data = data;
    }
}
