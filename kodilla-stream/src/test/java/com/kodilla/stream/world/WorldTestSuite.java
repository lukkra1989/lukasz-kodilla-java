package com.kodilla.stream.world;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {


        //Given
        List<World> country = new ArrayList<>();


        Country country1 = new Country("Poland", new BigDecimal("3800000000"));
        Country country2 = new Country("Germany", new BigDecimal("5600000"));
        Country country3 = new Country("Spain", new BigDecimal("4200000"));

        Country country4 = new Country("China", new BigDecimal("20000000"));
        Country country5 = new Country("India", new BigDecimal("670000000"));
        Country country6 = new Country("Thailand", new BigDecimal("12348888"));

        Country country7 = new Country("Usa", new BigDecimal("5300000"));
        Country country8 = new Country("Canada", new BigDecimal("6700000"));
        Country country9 = new Country("Mexico", new BigDecimal("90000"));

        List<Country> countries = new LinkedList<>();
        countries.add(country1);
        countries.add(country2);
        countries.add(country3);

        List<Country> countries2 = new LinkedList<>();
        countries2.add(country4);
        countries2.add(country5);
        countries2.add(country6);

        List<Country> countries3 = new LinkedList<>();
        countries3.add(country7);
        countries3.add(country8);
        countries3.add(country9);

        Continent continent1 = new Continent(countries, "Europe");
        Continent continent2 = new Continent(countries, "Asia");
        Continent continent3 = new Continent(countries, "North America");

        List<Continent> continents = new LinkedList<>();
        continents.add(continent1);
        continents.add(continent2);
        continents.add(continent3);

        World world = new World(continents);

        BigDecimal result = world.getPeopleQuantity();

        assertEquals(new BigDecimal("11429400000"), result);

    }
}
