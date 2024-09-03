package com.flightsearch.backend.mapper;

import com.flightsearch.backend.dto.ChargeableCheckedBagsDto;
import com.flightsearch.backend.models.ChargeableCheckedBags;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ChargeableCheckedBagsMapper {
    ChargeableCheckedBagsDto convertToDto(ChargeableCheckedBags source);

    ChargeableCheckedBags convertToEntity(ChargeableCheckedBagsDto source);
}
