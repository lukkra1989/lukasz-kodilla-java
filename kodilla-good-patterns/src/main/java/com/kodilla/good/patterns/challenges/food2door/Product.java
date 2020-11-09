package com.kodilla.good.patterns.challenges.food2door;

public class Product implements Producers{

    String product;
    int vaule;

    public Product(String product, int vaule) {
        this.product = product;
        this.vaule = vaule;
    }

    public String getProduct() {
        return product;
    }

    public int getVaule() {
        return vaule;
    }

}
