package com.kodilla.good.patterns.challenges.flights;

import java.util.HashMap;
import java.util.Map;

public class FlightProcessor {
    public void findFlight(){
        Map<Flight, Boolean>fly=new HashMap<>();
        fly.put("Warsaw","Berlin","Wroclove", true);
        fly.put("Warsaw", true);
        fly.put("Warsaw", true);

    }

}
