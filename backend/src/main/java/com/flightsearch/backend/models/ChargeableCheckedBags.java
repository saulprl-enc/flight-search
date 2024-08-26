package com.flightsearch.backend.models;

public class ChargeableCheckedBags {
    private int quantity;
    private int weight;
    private String weightUnit;
    private String id;

    public ChargeableCheckedBags() {
    }

    public ChargeableCheckedBags(int quantity, int weight, String weightUnit, String id) {
        this.quantity = quantity;
        this.weight = weight;
        this.weightUnit = weightUnit;
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ChargeableCheckedBags{" +
                "quantity=" + quantity +
                ", weight=" + weight +
                ", weightUnit='" + weightUnit + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
