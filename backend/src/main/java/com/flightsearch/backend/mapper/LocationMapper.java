package com.flightsearch.backend.mapper;

import com.flightsearch.backend.dto.LocationDto;
import com.flightsearch.backend.models.Location;
import org.mapstruct.Mapper;

import java.text.ParseException;
import java.util.List;

@Mapper(componentModel = "spring")
public interface LocationMapper {
    LocationDto convertToDto(Location source);

    Location convertToEntity(LocationDto source) throws ParseException;

    List<LocationDto> convertToDtoList(List<Location> source);
}
