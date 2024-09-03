package com.flightsearch.backend.mapper;

import com.flightsearch.backend.dto.FlightEndPointDto;
import com.flightsearch.backend.models.FlightEndPoint;
import org.mapstruct.Mapper;

import java.text.ParseException;

@Mapper(componentModel = "spring")
public interface FlightEndPointMapper {
    FlightEndPointDto convertToDto(FlightEndPoint source);

    FlightEndPoint convertToEntity(FlightEndPointDto srouce)
            throws ParseException;
}
