package com.kodilla.good.patterns.challenges.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightProvider {

    private Set<Flight> connections = new HashSet<>();

    public Set<Flight> findFlight() {
        connections.add(new Flight("Warsaw", "Berlin"));
        connections.add(new Flight("Krakow", "London"));
        connections.add(new Flight("Sydney", "Moscow"));
        connections.add(new Flight("Madrid", "Miami"));
        connections.add(new Flight("Kiev", "Phnom Penh"));

        return connections;
    }

    public static void main(String[] args) {
        FlightProvider flightProvider=new FlightProvider();
        FlightFinder flightFinder= new FlightFinder(flightProvider.connections);
        System.out.println(flightFinder.flightFrom("Warsaw"));
        System.out.println(flightFinder.flightFrom("Krakow"));
        System.out.println(flightFinder.flightFrom("Sydney"));
        System.out.println(flightFinder.flightFrom("Madrid"));
        System.out.println(flightFinder.flightFrom("Kiev"));
    }
}




