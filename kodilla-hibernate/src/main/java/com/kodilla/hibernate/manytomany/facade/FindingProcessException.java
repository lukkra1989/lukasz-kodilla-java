package com.kodilla.hibernate.manytomany.facade;

public class FindingProcessException extends Exception {
    public static String ERR_NO_COM = "Company not found!";
    public static String ERR_NO_EMP = "Employee not found!";

    public FindingProcessException(String message) {
        super(message);
    }
}