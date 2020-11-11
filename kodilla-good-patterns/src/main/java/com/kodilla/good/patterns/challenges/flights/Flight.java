package com.kodilla.good.patterns.challenges.flights;

public class Flight {
    String departureAirport;
    String transitAirport;
    String arrivalAirport;

    public Flight(String departureAirport, String transitAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.transitAirport = transitAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getTransitAirport() {
        return transitAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }
}
