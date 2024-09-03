package com.flightsearch.backend.mapper;

import com.flightsearch.backend.dto.FeeDto;
import com.flightsearch.backend.models.Fee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FeeMapper {
    FeeDto convertToDto(Fee source);

    Fee convertToEntity(FeeDto source);
}
