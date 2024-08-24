package com.flightsearch.backend.models;

import java.util.List;

public class AdditionalServicesRequest {
    private ChargeableCheckedBags chargeableCheckedBags;
    private ChargeableSeat chargeableSeat;
    private String chargeableSeatNumber;
    private List<ServiceName> otherServices;

    public AdditionalServicesRequest() {
    }

    public AdditionalServicesRequest(ChargeableCheckedBags chargeableCheckedBags,
                                     ChargeableSeat chargeableSeat,
                                     String chargeableSeatNumber,
                                     List<ServiceName> otherServices) {
        this.chargeableCheckedBags = chargeableCheckedBags;
        this.chargeableSeat = chargeableSeat;
        this.chargeableSeatNumber = chargeableSeatNumber;
        this.otherServices = otherServices;
    }

    public ChargeableCheckedBags getChargeableCheckedBags() {
        return chargeableCheckedBags;
    }

    public void setChargeableCheckedBags(ChargeableCheckedBags chargeableCheckedBags) {
        this.chargeableCheckedBags = chargeableCheckedBags;
    }

    public ChargeableSeat getChargeableSeat() {
        return chargeableSeat;
    }

    public void setChargeableSeat(ChargeableSeat chargeableSeat) {
        this.chargeableSeat = chargeableSeat;
    }

    public String getChargeableSeatNumber() {
        return chargeableSeatNumber;
    }

    public void setChargeableSeatNumber(String chargeableSeatNumber) {
        this.chargeableSeatNumber = chargeableSeatNumber;
    }

    public List<ServiceName> getOtherServices() {
        return otherServices;
    }

    public void setOtherServices(List<ServiceName> otherServices) {
        this.otherServices = otherServices;
    }
}
