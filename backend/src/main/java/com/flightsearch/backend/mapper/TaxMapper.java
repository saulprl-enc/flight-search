package com.flightsearch.backend.mapper;

import com.flightsearch.backend.dto.TaxDto;
import com.flightsearch.backend.models.Tax;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TaxMapper {
    TaxDto convertToDto(Tax tax);

    Tax convertToEntity(TaxDto taxDto);
}
