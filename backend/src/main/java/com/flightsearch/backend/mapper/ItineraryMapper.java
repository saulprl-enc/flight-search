package com.flightsearch.backend.mapper;

import com.flightsearch.backend.dto.ItineraryDto;
import com.flightsearch.backend.models.Itinerary;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ItineraryMapper {
    ItineraryDto convertToDto(Itinerary source);

    Itinerary convertToEntity(ItineraryDto source);
}
