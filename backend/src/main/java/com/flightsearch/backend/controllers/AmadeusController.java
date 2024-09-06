package com.flightsearch.backend.controllers;

import com.flightsearch.backend.dto.AirlinesResponseDto;
import com.flightsearch.backend.dto.FlightOfferDto;
import com.flightsearch.backend.dto.FlightOffersResponseDto;
import com.flightsearch.backend.models.AmadeusResponse;
import com.flightsearch.backend.models.FlightOffer;
import com.flightsearch.backend.services.IAmadeusService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;

@RestController
@RequestMapping("/")
public class AmadeusController {
    private IAmadeusService amadeusService;

    public AmadeusController(IAmadeusService amadeusService) {
        this.amadeusService = amadeusService;
    }

    @GetMapping("flights")
    public FlightOffersResponseDto getFlightOffers(@RequestParam() String origin, @RequestParam() String destination, @RequestParam() LocalDate departureDate, @RequestParam() LocalDate returnDate, @RequestParam(required = false) Integer adults, @RequestParam() String currencyCode, @RequestParam(required = false) Boolean nonStop) {
        if (adults == null) {
            adults = 1;
        }

        if (nonStop == null) {
            nonStop = false;
        }

        return amadeusService.getFlightOffers(origin,
                destination,
                departureDate,
                returnDate,
                adults,
                currencyCode,
                nonStop
        );
//        return amadeusService.getFlightOffers("HMO",
//                "GDL",
//                LocalDate.of(2024, Month.SEPTEMBER, 21),
//                LocalDate.of(2024, Month.SEPTEMBER, 23),
//                1,
//                "MXN",
//                true);
    }

    @GetMapping("airlines")
    public AirlinesResponseDto getAirlineByCode(@RequestParam() String airlineCode) {
        return amadeusService.getAirlineData(airlineCode);
    }

    @GetMapping("airports")
    public void getAirports() {

    }
}
