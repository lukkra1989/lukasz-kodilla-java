package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigMacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("with seasame")
                .burgers(2)
                .sauce("standard")
                .sauce("1000islands")
                .sauce("barbecue")
                .ingredient("salad")
                .ingredient("onion")
                .ingredient("bacon")
                .ingredient("cucumber")
                .ingredient("chilli")
                .ingredient("mushrooms")
                .ingredient("shrimps")
                .ingredient("chess")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        assertEquals(8, howManyIngredients);
    }
}
