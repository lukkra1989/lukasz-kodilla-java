package com.kodilla.good.patterns.challenges.food2door2;

import com.kodilla.good.patterns.challenges.food2door.Producers;

import java.util.List;

public class GlutenFreeShop implements Producer {
    //List<Product> listOfProducts = new ArrayList<>();

    public void process(List<Product> products) {
        products.forEach(p -> System.out.println("Ordering product: "+p ));
        System.out.println("Ordered from GlutenFreeShop ");
    }


}
