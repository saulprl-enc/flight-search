package com.flightsearch.backend.mapper;

import com.flightsearch.backend.dto.FlightStopDto;
import com.flightsearch.backend.models.FlightStop;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FlightStopMapper {
    FlightStopDto convertToDto(FlightStop source);

    FlightStop convertToEntity(FlightStopDto source);
}
