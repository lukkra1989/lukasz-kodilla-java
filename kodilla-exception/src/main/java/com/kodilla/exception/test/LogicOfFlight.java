package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class LogicOfFlight {


    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> fly = new HashMap<>();
        fly.put("Warszawa", true);
        fly.put("Berlin", false);
        fly.put("London", true);

        Boolean available = fly.get(flight.getArrivalAirport());
        if (!available)throw new RouteNotFoundException();


    }
}



