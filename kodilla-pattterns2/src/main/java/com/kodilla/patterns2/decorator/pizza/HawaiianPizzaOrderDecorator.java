package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class HawaiianPizzaOrderDecorator extends AbstractPizzaOrderDecorator {
    public HawaiianPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(15));
    }


    @Override
    public String getIngredients() {
        return super.getIngredients() + "pineapple";
    }
}
