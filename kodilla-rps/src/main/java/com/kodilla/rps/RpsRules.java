package com.kodilla.rps;

import java.util.Scanner;

public class RpsRules {

    private String playerName;
    private int numberOfWins;

    public void getInfo() {
        Scanner scanner = new Scanner(System.in);
        String name;
        int wins;
        System.out.println("Type Your Name: ");
        name = scanner.nextLine();
        do {
            System.out.println("Play to How Many Wins: ");
            wins = convert(scanner.nextLine());
        } while (wins < 1);
        setPlayerName(name);
        setNumberOfWins(wins);
    }

    public int convert(String wins) {
        int result = 0;
        try {
            result = Integer.parseInt(wins);
        } catch (NumberFormatException e) {
            System.out.println("Type a correct integer");
        }
        return result;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getNumberOfWins() {
        return numberOfWins;
    }

    public void setNumberOfWins(int numberOfWins) {
        this.numberOfWins = numberOfWins;
    }
}
