package com.flightsearch.backend.mapper;

import com.flightsearch.backend.dto.AirlineDto;
import com.flightsearch.backend.models.Airline;
import org.mapstruct.Mapper;

import java.text.ParseException;
import java.util.List;

@Mapper(componentModel = "spring")
public interface AirlineMapper {
    AirlineDto convertToDto(Airline source);

    Airline convertToEntity(AirlineDto source) throws ParseException;

    List<AirlineDto> convertToDtoList(List<Airline> source);
}
