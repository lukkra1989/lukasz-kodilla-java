package com.kodilla.stream.world;

import java.util.LinkedList;
import java.util.List;

public final class Continent{

    private final List<Country>countries;

    private final String continent;

    public Continent(List<Country> countries,String continent) {
        this.countries = countries;
        this.continent = continent;
    }

    public String getContinent() {
        return continent;
    }

    public List<Country> getCountries() {
        return countries;
    }
}
