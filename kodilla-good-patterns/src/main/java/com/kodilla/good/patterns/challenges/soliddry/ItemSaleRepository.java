package com.kodilla.good.patterns.challenges.soliddry;

import java.util.*;

public class ItemSaleRepository implements SaleRepository {

    private final Map<User, List<Item>> assortment = new HashMap<>();
    private final Map<User, List<Item>> order = new HashMap<>();

    @Override
    public void createSale(User user, Item item) {
        if (assortment.containsKey(user)) {
            assortment.get(user).add(item);
        } else {
            List<Item> items = new ArrayList<>();
            items.add(item);
            assortment.put(user, items);
        }
    }

    @Override
    public void createOrder(User user, String name, int quantity) {
        if (order.containsKey(user)) {
            List<Item> userOrder = order.get(user);
            addOrderToMap(user, userOrder, name, quantity);
        } else {
            List<Item> userOrder = new ArrayList<>();
            addOrderToMap(user, userOrder, name, quantity);
        }
    }

    private void addOrderToMap(User user, List<Item> userOrder, String name, int quantity) {
        assortment.values().stream()
                .flatMap(Collection::stream)
                .filter(item -> item.getName().equals(name))
                .findFirst().ifPresent(item -> userOrder.add(new Item(name, item.getPrice(), quantity)));
        order.put(user, userOrder);
    }

    @Override
    public List<Item> getUserItems(User user) {
        return order.get(user);
    }
}
//lombok