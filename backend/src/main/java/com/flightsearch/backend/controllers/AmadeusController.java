package com.flightsearch.backend.controllers;

import com.flightsearch.backend.models.AmadeusResponse;
import com.flightsearch.backend.models.FlightOffer;
import com.flightsearch.backend.services.IAmadeusService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
    public AmadeusResponse<FlightOffer> getFlightOffers() {
        return amadeusService.getFlightOffers("HMO",
                "GDL",
                LocalDate.of(2024, Month.SEPTEMBER, 21),
                LocalDate.of(2024, Month.SEPTEMBER, 23),
                1,
                "MXN",
                true);
    }
}
