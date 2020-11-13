package com.kodilla.good.patterns.challenges.flights;

import java.util.Objects;

public class Flight {
    String departureAirport;
    String arrivalAirport;

    public Flight() {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public Flight(String departureAirport, String arrivalAirport) {
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departureAirport, flight.departureAirport) &&
                Objects.equals(arrivalAirport, flight.arrivalAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureAirport, arrivalAirport);
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }
}
