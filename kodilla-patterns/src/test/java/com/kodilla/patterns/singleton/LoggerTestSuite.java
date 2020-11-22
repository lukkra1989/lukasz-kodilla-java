package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LoggerTestSuite {

    @Test
    void shouldGetLastLog(){
        Logger logger=Logger.getInstance();
        logger.log("Example Text");

        String result = logger.getLastLog();

        assertEquals(result,"Example Text");
    }
}
