package com.flightsearch.backend.mapper;

import com.flightsearch.backend.dto.AdditionalServicesRequestDto;
import com.flightsearch.backend.models.AdditionalServicesRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AdditionalServicesRequestMapper {
    AdditionalServicesRequestDto convertToDto(AdditionalServicesRequest source);

    AdditionalServicesRequest convertToEntity(AdditionalServicesRequestDto source);
}
