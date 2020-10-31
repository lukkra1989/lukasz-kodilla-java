package com.kodilla.exception.test;

public class ExceptionHandling {

    public static  void main(String []args)throws Exception{

        SecondChallenge secondChallenge=new SecondChallenge();
        try{
            secondChallenge.probablyIWillThrowException(1.5,2.0);
        }catch (Exception exception){
            throw new Exception();
        }finally{
            System.out.println("Finally Here!");}
    }
}
