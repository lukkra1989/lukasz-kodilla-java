package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class SecondChallangeTestSuite {
    @Test
    void probablyIWillThrowException() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When &Then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(2.0, 1.5));
    }
}
