package com.flightsearch.backend.models;

public class BaggageAllowance {
    private int quantity;
    private int weight;
    private String weightUnit;

    public BaggageAllowance() {
    }

    public BaggageAllowance(int quantity, int weight, String weightUnit) {
        this.quantity = quantity;
        this.weight = weight;
        this.weightUnit = weightUnit;
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

    @Override
    public String toString() {
        return "BaggageAllowance{" +
                "quantity=" + quantity +
                ", weight=" + weight +
                ", weightUnit='" + weightUnit + '\'' +
                '}';
    }
}
