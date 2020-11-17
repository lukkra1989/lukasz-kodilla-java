package com.kodilla.good.patterns.challenges.flights;

public class Application {
    public static void main(String[] args) {
        FlightProvider flightProvider = new FlightProvider();
        FlightFinder flightFinder = new FlightFinder(flightProvider.flights);



        System.out.println(flightProvider.flights);
       // System.out.println(flightFinder.flightFrom("Warsaw"));
//        System.out.println(flightFinder.flightFrom("Krakow"));
//        System.out.println(flightFinder.flightFrom("Sydney"));
//        System.out.println(flightFinder.flightFrom("Madrid"));
//        System.out.println(flightFinder.flightFrom("Kiev"));
    }
}
