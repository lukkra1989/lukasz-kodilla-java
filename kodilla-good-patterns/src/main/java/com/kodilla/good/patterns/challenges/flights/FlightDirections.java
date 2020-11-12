package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightDirections {

    Flight flight=new Flight();

    public static List<Flight>getList(){
        final List<Flight>theList=new ArrayList<>();

        theList.add(new Flight());

        return new ArrayList<>(theList);
    }
}
