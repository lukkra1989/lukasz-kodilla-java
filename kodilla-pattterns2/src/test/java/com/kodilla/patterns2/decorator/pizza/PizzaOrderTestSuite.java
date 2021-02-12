package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testFirstPizzaGetCost() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new FirstPizzaOrderDecorator(thePizza);
        //When
        BigDecimal theCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal(35), theCost);
    }

    @Test
    public void testFirstPizzaGetIngredients() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new FirstPizzaOrderDecorator(thePizza);
        thePizza=new ExtraCheeseDecorator(thePizza);
        //When
        String ingredients = thePizza.getIngredients();
        //Then
        assertEquals("Preparing delicious Pizza with: tomato, ham, corn + extra cheese", ingredients);
    }

    @Test
    public void testHawaiiPizzaGetCost() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new HawaiianPizzaOrderDecorator(thePizza);
        //When
        BigDecimal theCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal(30), theCost);
    }

    @Test
    public void testHawaiiPizzaGetIngredients() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new HawaiianPizzaOrderDecorator(thePizza);
        //When
        String ingredients = thePizza.getIngredients();
        //Then
        assertEquals("Preparing delicious Pizza with: pineapple", ingredients);
    }

    @Test
    public void testFarmerPizzaGetCost() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new FarmerPizzaOrderDecoration(thePizza);
        thePizza=new ExtraCheeseDecorator(thePizza);
        //When
        BigDecimal theCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal(28), theCost);
    }

    @Test
    public void testFarmerGetIngredients() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new FarmerPizzaOrderDecoration(thePizza);
        thePizza=new ExtraCheeseDecorator(thePizza);
        //When
        String ingredients = thePizza.getIngredients();
        //Then
        assertEquals("Preparing delicious Pizza with: tomato, bacon, ham, corn, cucumber + extra cheese", ingredients);
    }
}
