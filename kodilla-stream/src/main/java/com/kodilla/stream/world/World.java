package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class World {
    private final List<Continent> continents;

    public World(List<Continent> continents) {
        this.continents = continents;
    }


    public BigDecimal getPeopleQuantity() {
        return continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
