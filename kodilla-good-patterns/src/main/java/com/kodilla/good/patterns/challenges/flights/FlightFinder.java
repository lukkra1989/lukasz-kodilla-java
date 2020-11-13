package com.kodilla.good.patterns.challenges.flights;

import java.util.Set;
import java.util.stream.Collectors;

public class FlightFinder {

    private Set<Flight> connections;



    public FlightFinder(Set<Flight> connections) {
        this.connections = connections;
    }

    public String flightFrom(String departureAirport) {
        String start = connections.stream()
                .filter(entry -> entry.getDepartureAirport().equals(departureAirport))
                .map(Flight::getDepartureAirport)
                .collect(Collectors.joining("Flight from: " + departureAirport + "available"));
        return start;
    }

    public String flightTo(String arrivalAirport) {
        String destination = connections.stream()
                .filter(entry -> entry.getArrivalAirport().equals(arrivalAirport))
                .map(Flight::getArrivalAirport)
                .collect(Collectors.joining("Flight to: " + arrivalAirport + "available"));
        return destination;
    }

    public String flightVia(String transitAirport) {
        String transit = connections.stream()
                .filter(entry -> entry.getDepartureAirport().equals(transitAirport))
                .map(Flight::getArrivalAirport)
                .collect(Collectors.joining(","));
        return transit;
    }
}
