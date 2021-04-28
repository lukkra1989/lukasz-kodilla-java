package com.kodilla.sudoku.game;

import java.util.Scanner;

public class GameFinish {
    private static final Scanner scanner = new Scanner(System.in);

    public boolean finishGame() {
        System.out.println("To Play Again type: ENTER.\n"
                + "To quit type: 'Quit' and press ENTER.\n");
        String choice = scanner.nextLine();
        return choice.equals("Quit") || choice.equals("QUIT") || choice.equals("quit") || choice.equals("q") || choice.equals("Q");
    }
}
