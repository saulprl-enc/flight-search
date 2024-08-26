package com.flightsearch.backend.dto;

import java.util.List;

public record PriceDto(String grandTotal,
                       String billingCurrency,
                       String currency,
                       String total,
                       String base,
                       List<FeeDto> fees,
                       List<TaxDto> taxes) {
}
