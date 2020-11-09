package com.kodilla.good.patterns.challenges.food2door;

public class Order {
    String orderName;
    int orderAmmount;

    public Order(String orderName, int orderAmmount) {
        this.orderName = orderName;
        this.orderAmmount = orderAmmount;
    }

    public String getOrderName() {
        return orderName;
    }

    public int getOrderAmmount() {
        return orderAmmount;
    }
}
