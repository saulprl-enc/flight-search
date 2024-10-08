package com.flightsearch.backend.mapper;

import com.flightsearch.backend.dto.PriceDto;
import com.flightsearch.backend.models.Price;
import org.mapstruct.Mapper;

import java.text.ParseException;

@Mapper(componentModel = "spring")
public interface PriceMapper {
    PriceDto convertToDto(Price source);

    Price convertToEntity(PriceDto source)
            throws ParseException;
}
