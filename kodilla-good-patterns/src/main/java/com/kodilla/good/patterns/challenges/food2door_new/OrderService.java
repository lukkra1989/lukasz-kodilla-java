package com.kodilla.good.patterns.challenges.food2door_new;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderService {

        final Map<String, Producer> producerMap = new HashMap<>();
        {
            producerMap.put("ExtraFoodShop", new ExtraFoodShop());
            producerMap.put("GlutenFreeShop", new GlutenFreeShop());
            producerMap.put("HealthyShop", new HealthyShop());
        }

    void checkingProducerMap()throws ShopNotFoundException{
        if (!producerMap.containsKey(("ExtraFoodShop"))) {
            throw new ShopNotFoundException();
        }
        if (!producerMap.containsKey(("GlutenFreeShop"))) {
            throw new ShopNotFoundException();
        }
        if (!producerMap.containsKey(("HealthyShop"))) {
            throw new ShopNotFoundException();
        }
    }

    void orderFromShop(String shopName, List<Product> products) {
        System.out.println("Start Ordering Products");
        producerMap.get(shopName).process(products);
        System.out.println("Finishing Ordering Products");
    }
}
