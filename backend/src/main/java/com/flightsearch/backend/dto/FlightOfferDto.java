package com.flightsearch.backend.dto;

import java.util.List;

public record FlightOfferDto(String id,
                             Boolean oneWay,
                             String lastTicketingDate,
                             String lastTicketingDateTime,
                             List<ItineraryDto> itineraries) {

}
