package com.kodilla.good.patterns.challenges.food2door_new;

import java.util.Arrays;

public class
Application {

    public static void main(String[] args) throws ShopNotFoundException {

        OrderService orderService = new OrderService();

        orderService.orderFromShop("ExtraFoodShop", Arrays.asList(new Product("Chocolate", 5, 10)));
        orderService.orderFromShop("GlutenFreeShop", Arrays.asList(new Product("Milk", 2, 12)));
        orderService.orderFromShop("HealthyShop", Arrays.asList(new Product("Orange", 12, 4)));

       // orderService.orderFromShop("SomeOtherShop", Arrays.asList(new Product("Chocolate", 5, 10)));
    }
}
