package com.kodilla.good.patterns.challenges.flights;

import java.util.Objects;

public class Flight {
    String departureAirport;
    String transitAirport;
    String arrivalAirport;

    public Flight() {
        this.departureAirport = departureAirport;
        this.transitAirport = transitAirport;
        this.arrivalAirport = arrivalAirport;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departureAirport, flight.departureAirport) &&
                Objects.equals(transitAirport, flight.transitAirport) &&
                Objects.equals(arrivalAirport, flight.arrivalAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureAirport, transitAirport, arrivalAirport);
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
