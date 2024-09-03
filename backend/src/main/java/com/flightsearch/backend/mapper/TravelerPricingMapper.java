package com.flightsearch.backend.mapper;

import com.flightsearch.backend.dto.TravelerPricingDto;
import com.flightsearch.backend.models.TravelerPricing;
import org.mapstruct.Mapper;

import java.text.ParseException;

@Mapper(componentModel = "spring")
public interface TravelerPricingMapper {
    TravelerPricingDto convertToDto(TravelerPricing source);

    TravelerPricing convertToEntity(TravelerPricingDto source)
            throws ParseException;
}
