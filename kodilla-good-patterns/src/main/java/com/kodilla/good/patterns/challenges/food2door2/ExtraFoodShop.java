package com.kodilla.good.patterns.challenges.food2door2;

import java.util.List;

public class ExtraFoodShop implements Producer {
    // List<Product> listOfProducts = new ArrayList<>();
    //wprocess ilosc i produkty
    public void process(List<Product> products) {
        products.forEach(p -> System.out.println("Ordering product" + p));
        System.out.println("Ordered from ExtraShop ");
    }
}
