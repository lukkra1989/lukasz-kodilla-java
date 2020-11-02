package com.kodilla.exception.test;

public class FlightsAvailable {
    public static void main(String[] args) {
        LogicOfFlight logicOfFlight=new LogicOfFlight();
        try {
            logicOfFlight.findFlight(new Flight("Warsaw", "Wroclove"));
        } catch (RouteNotFoundException e) {
            System.out.println("Airport Doesn't exist!");;
        }
    }
}
