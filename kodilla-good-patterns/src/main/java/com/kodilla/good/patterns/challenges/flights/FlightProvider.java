package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FlightProvider {

    public Set<Flight> flights;

    //public static final getConnections()

    public Set<Flight> provide() {
        final Set<Flight> flights = new HashSet<>();

        flights.add(new Flight("Warsaw", "Berlin"));
        flights.add(new Flight("Krakow", "London"));
        flights.add(new Flight("Sydney", "Moscow"));
        flights.add(new Flight("Berlin", "Madrid"));
        flights.add(new Flight("Madrid", "Miami"));
        flights.add(new Flight("Kiev", "Phnom Penh"));
        flights.add(new Flight("London", "Moscow"));

        return flights;
    }
}




