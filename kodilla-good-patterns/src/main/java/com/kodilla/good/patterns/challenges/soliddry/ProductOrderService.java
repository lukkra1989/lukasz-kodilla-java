package com.kodilla.good.patterns.challenges.soliddry;

import java.util.List;

public class ProductOrderService {

    private final InformationService informationService;
    private final SaleService saleService;


    public ProductOrderService(InformationService informationService,
                               SaleService saleService) {
        this.informationService = informationService;
        this.saleService = saleService;
        ;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        saleService.createSell(orderRequest.getUser(), orderRequest.getItem());
        informationService.inform(orderRequest.getUser(), orderRequest.getItem());
        return new OrderDto(orderRequest.getUser(), true);
    }

    public void createUserOrder(User user, String name, int quantity) {
        saleService.createUserOrder(user, name, quantity);
        informationService.informAboutOrder(user, name, quantity);
    }

    public List<Item> getUserOrder(User user) {
        return saleService.userOrders(user);
    }
}
