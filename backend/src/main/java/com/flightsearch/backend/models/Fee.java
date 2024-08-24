package com.flightsearch.backend.models;

public class Fee {
    private String amount;
    private FeeType type;

    public Fee() {
    }

    public Fee(String amount, FeeType type) {
        this.amount = amount;
        this.type = type;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public FeeType getType() {
        return type;
    }

    public void setType(FeeType type) {
        this.type = type;
    }
}
