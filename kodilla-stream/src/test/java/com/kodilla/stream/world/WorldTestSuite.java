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


        Country poland = new Country("Poland", new BigDecimal("3800000000"));
        Country germany = new Country("Germany", new BigDecimal("5600000"));
        Country spain = new Country("Spain", new BigDecimal("4200000"));

        Country china = new Country("China", new BigDecimal("20000000"));
        Country india = new Country("India", new BigDecimal("670000000"));
        Country thailand = new Country("Thailand", new BigDecimal("12348888"));

        Country usa = new Country("Usa", new BigDecimal("5300000"));
        Country canada = new Country("Canada", new BigDecimal("6700000"));
        Country mexico = new Country("Mexico", new BigDecimal("90000"));

        List<Country> countriesOfEurope = new LinkedList<>();
        countriesOfEurope.add(poland);
        countriesOfEurope.add(germany);
        countriesOfEurope.add(spain);

        List<Country> countriesOfAsia = new LinkedList<>();
        countriesOfAsia.add(china);
        countriesOfAsia.add(india);
        countriesOfAsia.add(thailand);


        List<Country> countriesOfNorthAmerica = new LinkedList<>();
        countriesOfNorthAmerica.add(usa);
        countriesOfNorthAmerica.add(canada);
        countriesOfNorthAmerica.add(mexico);

        Continent europe = new Continent(countriesOfEurope, "Europe");
        Continent asia = new Continent(countriesOfEurope, "Asia");
        Continent northAmerica = new Continent(countriesOfEurope, "North America");

        List<Continent> continents = new LinkedList<>();
        continents.add(europe);
        continents.add(asia);
        continents.add(northAmerica);

        World world = new World(continents);

        BigDecimal result = world.getPeopleQuantity();

        assertEquals(new BigDecimal("11429400000"), result);

    }
}
