package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class FirstPizzaOrderDecorator extends AbstractPizzaOrderDecorator {
    public FirstPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(20));
    }


    @Override
    public String getIngredients() {
        return super.getIngredients() + "tomato, ham, corn";
    }
}
