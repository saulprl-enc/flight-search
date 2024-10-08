package com.flightsearch.backend.mapper;

import com.flightsearch.backend.dto.ChargeableSeatDto;
import com.flightsearch.backend.models.ChargeableSeat;
import org.mapstruct.Mapper;

import java.text.ParseException;

@Mapper(componentModel = "spring")
public interface ChargeableSeatMapper {
    ChargeableSeatDto convertToDto(ChargeableSeat source);

    ChargeableSeat convertToEntity(ChargeableSeatDto source)
            throws ParseException;
}
