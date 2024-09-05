package com.flightsearch.backend.models;

import java.util.List;

public interface AmadeusResponse<T> {
    public CollectionMeta getMeta();

    public void setMeta(CollectionMeta meta);

    public List<T> getData();

    public void setData(List<T> data);

    @Override
    public String toString();
}
