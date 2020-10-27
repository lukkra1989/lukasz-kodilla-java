package com.kodilla.stream.array;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite implements ArrayOperations {

    @Test
    public void testGetAverage() {
        int[] figures = new int[]{
                1, 2, 3, 4, 5, 7, 88, 99, 1102, 11, 55, 22, 78, 90, 34, 879, 9, 5, 1
        };
        final double result = ArrayOperations.getAverage(figures);
        assertEquals(131.31578947368422, result);
    }

}
