package com.kodilla.good.patterns.challenges.food2door2;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        OrderService orderService=new OrderService();
        orderService.orderFromShop("ExtraFoodShop", Arrays.asList(new Product("Chocolate", 5,10)));
        orderService.orderFromShop("GlutenFreeShop",Arrays.asList(new Product("Milk", 2,12)));
        orderService.orderFromShop("HealthyShop",Arrays.asList(new Product("Orange",12,4)));
    }
}
