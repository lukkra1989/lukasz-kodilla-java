package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class FlightProvider {

    public Set<Flight> flights;

    //public static final getConnections()


    public List<Flight> provide() {
        final List<Flight> flights = new ArrayList<>();

        flights.add(new Flight("Warsaw", "Berlin"));
        flights.add(new Flight("Krakow", "London"));
        flights.add(new Flight("Sydney", "Moscow"));
        flights.add(new Flight("Madrid", "Miami"));
        flights.add(new Flight("Kiev", "Phnom Penh"));



        return flights;
    }
}




