package com.kodilla.good.patterns.challenges.soliddry;

//nakoniec
public class Application {

    public static void main(String[] args) {

        SaleRequestRetriever saleRequestRetriever=new SaleRequestRetriever();
        OrderRequest orderRequest = saleRequestRetriever.retrive();
        ProductOrderService productOrderService=new ProductOrderService(
                new MailService(), new SaleServiceImpl(new ItemSaleRepository()), new ItemSaleRepository());
        productOrderService.process(orderRequest);
    }
}
