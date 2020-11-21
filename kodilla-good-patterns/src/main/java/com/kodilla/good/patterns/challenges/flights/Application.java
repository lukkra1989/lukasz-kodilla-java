package com.kodilla.good.patterns.challenges.flights;

public class Application {
    public static void main(String[] args) {
        FlightProvider flightProvider = new FlightProvider();
        FlightFinder flightFinder = new FlightFinder(flightProvider.provide());

        System.out.println(flightFinder.flightVia("London"));
    }
}
