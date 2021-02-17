package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class LogicOfFlight {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> fly = new HashMap<>();
        fly.put("Warsaw", true);
        fly.put("Berlin", false);
        fly.put("London", true);

        if (!fly.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException();
        }
    }
}



