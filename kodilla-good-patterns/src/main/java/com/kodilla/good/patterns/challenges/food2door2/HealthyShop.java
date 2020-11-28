package com.kodilla.good.patterns.challenges.food2door2;

import java.util.List;

public class HealthyShop implements Producer {

    // List<Product> listOfProducts = new ArrayList<>();

    public void process(List<Product> products) {
        products.forEach(p-> System.out.println("Ordering product: " + p));
        System.out.println("Ordered from HealthyShop");
    }
}

