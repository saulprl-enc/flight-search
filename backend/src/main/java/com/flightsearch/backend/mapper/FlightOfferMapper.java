package com.flightsearch.backend.mapper;

import com.flightsearch.backend.dto.FlightOfferDto;
import com.flightsearch.backend.models.FlightOffer;
import org.mapstruct.Mapper;

import java.text.ParseException;

@Mapper(componentModel = "spring")
public interface FlightOfferMapper {
    FlightOfferDto convertToDto(FlightOffer source);

    FlightOffer convertToEntity(FlightOfferDto source)
            throws ParseException;
}
