package com.flightsearch.backend.models;

public class CollectionMeta {
    private int count;
    private CollectionLinks links;

    public CollectionMeta() {
    }

    public CollectionMeta(int count, CollectionLinks links) {
        this.count = count;
        this.links = links;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public CollectionLinks getLinks() {
        return links;
    }

    public void setLinks(CollectionLinks links) {
        this.links = links;
    }

    @Override
    public String toString() {
        return "CollectionMeta{" +
                "count=" + count +
                ", links=" + links +
                '}';
    }
}
