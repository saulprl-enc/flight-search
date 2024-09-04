package com.flightsearch.backend.mapper;

import com.flightsearch.backend.dto.FlightOffersResponseDto;
import com.flightsearch.backend.models.AmadeusResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FlightOffersResponseMapper {
    FlightOffersResponseDto convertToDto(AmadeusResponse source);

    AmadeusResponse convertToEntity(FlightOffersResponseDto source);
}
