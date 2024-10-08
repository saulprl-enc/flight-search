package com.flightsearch.backend.mapper;

import com.flightsearch.backend.dto.FareDetailsBySegmentDto;
import com.flightsearch.backend.models.FareDetailsBySegment;
import org.mapstruct.Mapper;

import java.text.ParseException;

@Mapper(componentModel = "spring")
public interface FareDetailsBySegmentMapper {
    FareDetailsBySegmentDto convertToDto(FareDetailsBySegment source);

    FareDetailsBySegment convertToEntity(FareDetailsBySegmentDto source)
            throws ParseException;
}
