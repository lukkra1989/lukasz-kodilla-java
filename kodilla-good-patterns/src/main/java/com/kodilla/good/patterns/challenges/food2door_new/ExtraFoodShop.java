package com.kodilla.good.patterns.challenges.food2door_new;

import java.util.List;

public class ExtraFoodShop implements Producer {

    public void process(List<Product> products) {
        products.forEach(p -> System.out.println("Ordering product" + p));
        System.out.println("Ordered from ExtraShop ");
    }
}
