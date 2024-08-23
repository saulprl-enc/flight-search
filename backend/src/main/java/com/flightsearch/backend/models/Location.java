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
}
