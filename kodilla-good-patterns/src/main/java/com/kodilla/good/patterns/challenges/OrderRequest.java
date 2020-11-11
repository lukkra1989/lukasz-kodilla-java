package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.food2door.Producers;
import com.kodilla.good.patterns.challenges.food2door.Product;

public class OrderRequest {

    private User user;
    private Product product;
    private Producers producers;

    public OrderRequest(User user, Product product, Producers producers) {
        this.user = user;
        this.product = product;
        this.producers = producers;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public Producers getProducers() {
        return producers;
    }
}
