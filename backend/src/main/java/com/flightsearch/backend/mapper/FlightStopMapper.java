package com.flightsearch.backend.mapper;

import com.flightsearch.backend.dto.FlightStopDto;
import com.flightsearch.backend.models.FlightStop;
import org.mapstruct.Mapper;

import java.text.ParseException;

@Mapper(componentModel = "spring")
public interface FlightStopMapper {
    FlightStopDto convertToDto(FlightStop source);

    FlightStop convertToEntity(FlightStopDto source)
            throws ParseException;
}
