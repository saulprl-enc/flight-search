package com.flightsearch.backend.models;

public class Tax {
    private String amount;
    private String code;

    public Tax() {
    }

    public Tax(String amount, String code) {
        this.amount = amount;
        this.code = code;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
