package com.flightsearch.backend.mapper;

import com.flightsearch.backend.dto.FlightOffersResponseDto;
import com.flightsearch.backend.models.AmadeusResponse;
import com.flightsearch.backend.models.FlightOffersResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FlightOffersResponseMapper {
    FlightOffersResponseDto convertToDto(FlightOffersResponse source);

    FlightOffersResponse convertToEntity(FlightOffersResponseDto source);
}
