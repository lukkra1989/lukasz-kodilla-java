package com.kodilla.good.patterns.challenges.soliddry;

import java.util.List;

public class SaleServiceImpl implements SaleService {
    private final SaleRepository saleRepository;

    public SaleServiceImpl(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }

    @Override
    public void createSell(User user, Item item) {
        saleRepository.createSale(user, item);
    }

//    @Override
//    public void createUserOrder(User user, String name, int quantity) {
//        saleRepository.createOrder(user, name, quantity);
//    }

//    @Override
//    public List<Item> userOrders(User user) {
//        return saleRepository.getUserItems(user);
//    }
}
