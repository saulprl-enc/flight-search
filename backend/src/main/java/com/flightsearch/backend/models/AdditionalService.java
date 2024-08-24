package com.flightsearch.backend.models;

public class AdditionalService {
    private String amount;
    private AdditionalServiceType type;

    public AdditionalService() {
    }

    public AdditionalService(String amount, AdditionalServiceType type) {
        this.amount = amount;
        this.type = type;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public AdditionalServiceType getType() {
        return type;
    }

    public void setType(AdditionalServiceType type) {
        this.type = type;
    }
}
