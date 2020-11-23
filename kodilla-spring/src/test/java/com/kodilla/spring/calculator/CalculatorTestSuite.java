package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest

public class CalculatorTestSuite {

    @Autowired
    Calculator calculator;

    @Test
    void testCalculations() {

        assertEquals(6.0,calculator.add(3.0,3.0));
        assertEquals(0.0,calculator.sub(3.0,3.0));
        assertEquals(9.0,calculator.mul(3.0,3.0));
        assertEquals(1.0,calculator.div(3.0,3.0));
    }
}
