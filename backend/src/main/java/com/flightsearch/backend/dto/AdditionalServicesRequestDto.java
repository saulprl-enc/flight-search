package com.flightsearch.backend.dto;

import com.flightsearch.backend.models.ServiceName;

import java.util.List;

public record AdditionalServicesRequestDto(ChargeableCheckedBagsDto chargeableCheckedBags,
                                           ChargeableSeatDto chargeableSeat,
                                           String chargeableSeatNumber,
                                           List<ServiceName> otherServices) {
}
