package com.flightsearch.backend.models;

import java.util.List;

public class PricingOptions {
    private List<PricingOptionsFareType> fareType;
    private boolean includedCheckedBagsOnly;
    private boolean refundableFare;
    private boolean noRestrictionFare;
    private boolean noPenaltyFare;

    public PricingOptions() {
    }

    public PricingOptions(List<PricingOptionsFareType> fareType,
                          boolean includedCheckedBagsOnly,
                          boolean refundableFare,
                          boolean noRestrictionFare,
                          boolean noPenaltyFare) {
        this.fareType = fareType;
        this.includedCheckedBagsOnly = includedCheckedBagsOnly;
        this.refundableFare = refundableFare;
        this.noRestrictionFare = noRestrictionFare;
        this.noPenaltyFare = noPenaltyFare;
    }

    public List<PricingOptionsFareType> getFareType() {
        return fareType;
    }

    public void setFareType(List<PricingOptionsFareType> fareType) {
        this.fareType = fareType;
    }

    public boolean isIncludedCheckedBagsOnly() {
        return includedCheckedBagsOnly;
    }

    public void setIncludedCheckedBagsOnly(boolean includedCheckedBagsOnly) {
        this.includedCheckedBagsOnly = includedCheckedBagsOnly;
    }

    public boolean isRefundableFare() {
        return refundableFare;
    }

    public void setRefundableFare(boolean refundableFare) {
        this.refundableFare = refundableFare;
    }

    public boolean isNoRestrictionFare() {
        return noRestrictionFare;
    }

    public void setNoRestrictionFare(boolean noRestrictionFare) {
        this.noRestrictionFare = noRestrictionFare;
    }

    public boolean isNoPenaltyFare() {
        return noPenaltyFare;
    }

    public void setNoPenaltyFare(boolean noPenaltyFare) {
        this.noPenaltyFare = noPenaltyFare;
    }

    @Override
    public String toString() {
        return "PricingOptions{" +
                "fareType=" + fareType +
                ", includedCheckedBagsOnly=" + includedCheckedBagsOnly +
                ", refundableFare=" + refundableFare +
                ", noRestrictionFare=" + noRestrictionFare +
                ", noPenaltyFare=" + noPenaltyFare +
                '}';
    }
}
