package com.kodilla.exception.test;

public class FlightsAvailable {
    public static void main(String[] args) throws RouteNotFoundException {
        LogicOfFlight logicOfFlight = new LogicOfFlight();
        logicOfFlight.findFlight(new Flight("Warsaw", "Wroclove"));
    }
}
