package com.kodilla.good.patterns.challenges.flights;

import java.util.Set;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class FlightFinder {

    private Set<Flight> flights;


    public FlightFinder(Set<Flight> flights) {
        this.flights = flights;
    }
    // String start = flightProvider.getConnections().stream()

    public String flightFrom(String departureAirport) {

        String start = flights.stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .map(Flight::getDepartureAirport)
                .collect(Collectors.joining("Flight from: " + departureAirport + "available"));
        return start;
    }

    public String flightTo(String arrivalAirport) {
        String destination = flights.stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .map(Flight::getArrivalAirport)
                .collect(Collectors.joining("Flight to: " + arrivalAirport + "available"));
        return destination;
    }

    public String flightVia(String transitAirport) {
        StringJoiner stringJoiner=new StringJoiner(",");
            for(Flight flight :flights){
                for(Flight flight1:flights){
                    if(!flight.equals(flight1)){
                        if(flight.getDepartureAirport().equals(transitAirport)&&
                                flight1.getArrivalAirport().equals(transitAirport))
                       stringJoiner.add("Flight from: "+ flight.getArrivalAirport() + " via " +
                                transitAirport + " to: "+ flight1.getDepartureAirport());

                    }
                }
            }

//        String transit = flights.stream()
//                .filter(entry -> entry.getDepartureAirport().equals(transitAirport))
//                .map(Flight::getArrivalAirport)
//                .collect(Collectors.joining(","));
//        return transit;
        return stringJoiner.toString();
    }

}
