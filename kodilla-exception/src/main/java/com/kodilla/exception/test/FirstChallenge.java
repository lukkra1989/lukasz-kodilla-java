package com.kodilla.exception.test;

import java.nio.file.Files;
import java.util.stream.Stream;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException{
        try {
            divide(3,0);
        }
        catch (ArithmeticException e) {
            System.out.println("Błąd dzielenia przez 0 !!!");
    }finally{ return  a/b;
        }
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void  main (String[]args){
        FirstChallenge firstChallenge=new FirstChallenge();

        double result = firstChallenge.divide(3,0);

        System.out.println(result);
    }
}
