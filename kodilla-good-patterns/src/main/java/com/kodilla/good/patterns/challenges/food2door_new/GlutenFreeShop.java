package com.kodilla.good.patterns.challenges.food2door_new;

import java.util.List;

public class GlutenFreeShop implements Producer {


    public void process(List<Product> products) {
        products.forEach(p -> System.out.println("Ordering product: " + p));
        System.out.println("Ordered from GlutenFreeShop ");
    }


}
