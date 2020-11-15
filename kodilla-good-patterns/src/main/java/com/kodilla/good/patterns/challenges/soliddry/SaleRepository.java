package com.kodilla.good.patterns.challenges.soliddry;

import java.util.List;

public interface SaleRepository {

    void createSale(User user, Item item);

    void createOrder(User user, String name, int quantity);

    List<Item> getUserItems(User user);
}

