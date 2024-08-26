package com.flightsearch.backend;

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
    public void getFlightOffers() {
        amadeusService.getFlightOffers("HMO",
                "GDL",
                LocalDate.of(2024, Month.SEPTEMBER, 21),
                LocalDate.of(2024, Month.SEPTEMBER, 23),
                1,
                "MXN",
                true);
    }
}
