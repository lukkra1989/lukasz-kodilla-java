package com.kodilla.good.patterns.challenges.food2door2;

public class Application {
    public static void main(String[] args) {
        OrderService orderService=new OrderService();
        orderService.orderFromShop("ExtraFoodShop");
        orderService.orderFromShop("GlutenFreeShop");
        orderService.orderFromShop("HealthyShop");
    }
}
