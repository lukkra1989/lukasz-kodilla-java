package com.kodilla.sudoku.game;

import java.util.Scanner;

public class GameFinish {
    private static final Scanner scanner = new Scanner(System.in);
    public boolean finishGame() {
        System.out.println("PLAY AGAIN ? : ENTER.\n"
                + "TO QUIT : 'Quit' and press ENTER.\n");
        String choice = scanner.nextLine();
        return choice.equals("Quit") || choice.equals("QUIT") || choice.equals("quit") || choice.equals("q") || choice.equals("Q");
    }
}
