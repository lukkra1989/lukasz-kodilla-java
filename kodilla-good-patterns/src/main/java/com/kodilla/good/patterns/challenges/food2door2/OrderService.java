package com.kodilla.good.patterns.challenges.food2door2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderService {
    final Map<String,Producer>producerMap=new HashMap<>();
    {
        producerMap.put("ExtraFoodShop",new ExtraFoodShop());
        producerMap.put("GlutenFreeShop",new GlutenFreeShop());
        producerMap.put("HealthyShop",new HealthyShop());
    }
    void orderFromShop(String shopName, List<Product>products){
        System.out.println("Start Ordering Products");
        producerMap.get(shopName).process(products);
        System.out.println("Finishing Ordering Products");
    }
}
