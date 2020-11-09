package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop implements Producers{
    List<Product> listOfProducts = new ArrayList<>();


    public void setListOfProducts(List<Product> listOfProducts) {
        this.listOfProducts = listOfProducts;
    }

    public List<Product> getListOfProducts() {
        return listOfProducts;
    }

    public void process() {
        System.out.println("Your Products: " + listOfProducts);
    }

    private final String location = "Katowice";

    public String getLocation() {
        return location;
    }
}
