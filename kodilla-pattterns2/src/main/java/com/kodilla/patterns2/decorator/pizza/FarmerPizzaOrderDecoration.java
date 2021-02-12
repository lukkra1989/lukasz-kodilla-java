package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class FarmerPizzaOrderDecoration extends AbstractPizzaOrderDecorator {
    public FarmerPizzaOrderDecoration(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(10));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + "tomato, bacon, ham, corn, cucumber";
    }
}
