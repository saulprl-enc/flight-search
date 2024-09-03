package com.flightsearch.backend.mapper;

import com.flightsearch.backend.dto.SegmentDto;
import com.flightsearch.backend.models.Segment;
import org.mapstruct.Mapper;

import java.text.ParseException;

@Mapper(componentModel = "spring")
public interface SegmentMapper {
    SegmentDto convertToDto(Segment source);

    Segment convertToEntity(SegmentDto source)
            throws ParseException;
}
