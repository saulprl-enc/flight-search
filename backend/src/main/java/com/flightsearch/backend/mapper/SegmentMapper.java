package com.flightsearch.backend.mapper;

import com.flightsearch.backend.dto.SegmentDto;
import com.flightsearch.backend.models.Segment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SegmentMapper {
    SegmentDto convertToDto(Segment source);

    Segment convertToEntity(SegmentDto source);
}
