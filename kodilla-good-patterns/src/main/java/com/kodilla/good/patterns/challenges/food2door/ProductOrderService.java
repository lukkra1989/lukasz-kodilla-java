package com.kodilla.good.patterns.challenges.food2door;

public class ProductOrderService {

    private Producers producers;
    private Product product;
    private User user;
    private OrderGenerator orderGenerator;
    private Order order;

    public ProductOrderService(final Producers producers,
                               final Product product,
                               final User user,
                               final OrderGenerator orderGenerator,
                               final Order order)
    {
        this.producers = producers;
        this.product = product;
        this.user = user;
        this.orderGenerator = orderGenerator;
    }

    public OrderDto process(final User user,final Producers producers, final Product product ){
        boolean isOrdered = orderGenerator(order).createOrder(user,producers,product);
        if(isOrdered) {
            Producers.process(user, product, order);

            //orderGenerator().createOrder();
        }
        else {
            return null;
        }
    }
    public static void main(String[] args) {
        ProductOrderService productOrderService = new ProductOrderService();
        productOrderService.process();

    }




}
