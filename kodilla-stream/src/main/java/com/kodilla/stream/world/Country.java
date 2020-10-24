package com.kodilla.stream.world;
import java.math.BigDecimal;

public final class Country {

//Country country=new Country("USA", "580000000");

    private final String countryName;
    private final BigDecimal peopleQuantity;

    public Country(String countryName, BigDecimal peopleQuantity) {
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }

//    public Country getCountry() {
//        return country;
//    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getPeopleQuantity(){
        return  peopleQuantity;
        //return country.stream()
              //  .map(Country::getCountryName)
              //  .sum;

        //return new BigDecimal(2.3);
    }

}
