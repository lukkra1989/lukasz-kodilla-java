package com.kodilla.sudoku.data;

import com.kodilla.sudoku.logic.InputValidator;

import java.util.Scanner;

public class DataInput {

    private static final Scanner scanner = new Scanner(System.in);

    public String inputData() {
        boolean validator = false;
        String input = "";
        while (!validator) {
            System.out.print("TYPE YOUR NUMBERS \n"
                    + " (From 1 to 9) \n"
              );

            input = scanner.nextLine();
            InputValidator inputValidator = new InputValidator(input);
            validator = inputValidator.validateInput();
        }
        return input;
    }
}
