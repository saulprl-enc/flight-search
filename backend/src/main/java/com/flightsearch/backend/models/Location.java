package com.flightsearch.backend.models;

import java.util.List;

public class Location {
    private String id;
    private String type;
    private String subType;
    private String name;
    private String detailedName;
    private String timeZoneOffset;
    private String iataCode;
    private GeoCode geoCode;
    private Address address;
    private Distance distance;
    private Analytics analytics;
    private double relevance;
    private LocationCategory category;
    private List<String> tags;
    private String rank;

    public Location() {
    }

    public Location(String id,
                    String type,
                    String subType,
                    String name,
                    String detailedName,
                    String timeZoneOffset,
                    String iataCode,
                    GeoCode geoCode,
                    Address address,
                    Distance distance,
                    Analytics analytics,
                    double relevance,
                    LocationCategory category,
                    List<String> tags,
                    String rank) {
        this.id = id;
        this.type = type;
        this.subType = subType;
        this.name = name;
        this.detailedName = detailedName;
        this.timeZoneOffset = timeZoneOffset;
        this.iataCode = iataCode;
        this.geoCode = geoCode;
        this.address = address;
        this.distance = distance;
        this.analytics = analytics;
        this.relevance = relevance;
        this.category = category;
        this.tags = tags;
        this.rank = rank;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetailedName() {
        return detailedName;
    }

    public void setDetailedName(String detailedName) {
        this.detailedName = detailedName;
    }

    public String getTimeZoneOffset() {
        return timeZoneOffset;
    }

    public void setTimeZoneOffset(String timeZoneOffset) {
        this.timeZoneOffset = timeZoneOffset;
    }

    public String getIataCode() {
        return iataCode;
    }

    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
    }

    public GeoCode getGeoCode() {
        return geoCode;
    }

    public void setGeoCode(GeoCode geoCode) {
        this.geoCode = geoCode;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Distance getDistance() {
        return distance;
    }

    public void setDistance(Distance distance) {
        this.distance = distance;
    }

    public Analytics getAnalytics() {
        return analytics;
    }

    public void setAnalytics(Analytics analytics) {
        this.analytics = analytics;
    }

    public double getRelevance() {
        return relevance;
    }

    public void setRelevance(double relevance) {
        this.relevance = relevance;
    }

    public LocationCategory getCategory() {
        return category;
    }

    public void setCategory(LocationCategory category) {
        this.category = category;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
