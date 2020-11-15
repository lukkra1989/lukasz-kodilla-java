package com.kodilla.good.patterns.challenges.soliddry;

public class Application {

    public static void main(String[] args) {

        OrderRequest orderRequest = new OrderRequest(new User("John", "Snow", "bstr.nightw@tch"),
                new Item("Claw", 11, 90));
        ProductOrderService productOrderService = new ProductOrderService(
                new MailService(), new SaleServiceImpl(new ItemSaleRepository()));
        productOrderService.process(orderRequest);
        User user = new User("Bob", "Marley", "j@maica.com");
        productOrderService.createUserOrder(user, "Claw", 88);
        productOrderService.createUserOrder(user, "Claw", 88);
        System.out.println(productOrderService.getUserOrder(user));
    }
}
