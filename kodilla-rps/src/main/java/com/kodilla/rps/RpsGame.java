package com.kodilla.rps;

import java.util.Scanner;

public class RpsGame {

    private RpsRules rpsRules;
    private boolean end = false;
    private boolean newGame = false;
    private int actualRound = 1;
    private int playerScore = 0;
    private int computerScore = 0;
    private String winner = "none";
    private String playerChoice;

    public RpsGame(RpsRules rpsRules) {
        this.rpsRules = rpsRules;
    }

    public void showRules() {
        System.out.println("1  - play //STONE//");
        System.out.println("2 = play //PAPER//");
        System.out.println("3- play //SCISSORS//");
        System.out.println("X = Quit GAME");
        System.out.println("n = NEW GAME" + '\n');
    }

    public void getReady() {
        rpsRules.getInfo();
        showRules();
        actualRound = 1;
        playerScore = 0;
        computerScore = 0;
        newGame = false;
        winner = "none";
    }


    public void setComputerScore() {
        playerScore++;
        System.out.println(" *Score to the Computer");
    }

    public void setPlayerScore() {
        playerScore++;
        System.out.println(" *Score to the Player");
    }

    @Override
    public String toString() {
        return "RpsGame{" +
                "actualRound=" + actualRound +
                ", playerScore=" + playerScore +
                ", computerScore=" + computerScore +
                ", winner='" + winner + '\'' +
                '}';
    }

    public boolean endGame() {
        String quitGame;
        System.out.println("DO YOU REALLY WANT END THE GAME? Y-yes N-no");
        Scanner scanner = new Scanner(System.in);
        do {
            quitGame = scanner.next();
        } while ((!quitGame.equals("T")) && (!(quitGame.equals("N"))));
        return (quitGame.equals("T"));
    }

    public boolean exitToMenu() {
        String exitGame;
        Scanner scanner = new Scanner(System.in);
        do {
            exitGame = scanner.next();
        } while ((!exitGame.equals("X")) && (!(exitGame.equals("N"))));
        return (exitGame.equals("X"));
    }

    public void yourMove() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(rpsRules.getPlayerName() + " , Your Move: ");
            playerChoice = scanner.next();
            if (playerChoice.equals("1")) {
                playerChoice = "STONE";
            } else if (playerChoice.equals("2")) {
                playerChoice = "PAPER";
            } else if (playerChoice.equals("3")) {
                playerChoice = "SCISSORS";
            } else if (playerChoice.equals("X")) {
                end = endGame();
            } else if (playerChoice.equals("N")) {
                newGame = endGame();
            }
        } while (!(playerChoice.equals("STONE")) && !(playerChoice.equals("PAPER"))
                && !(playerChoice.equals("SCISSORS")) && !end && !newGame);
    }

    public void startNewGame() {

        int computerChoice;
        String figureChoosedByComp;
        RpsRandom rpsRandom = new RpsRandom();
        showRules();

        while (!end) {

            System.out.println("ROUND NR: " + actualRound);
            yourMove();

            computerChoice = rpsRandom.GetRandom();
            if (computerChoice == 1) {
                figureChoosedByComp = "STONE";
            } else if (computerChoice == 2) {
                figureChoosedByComp = "PAPER";
            } else figureChoosedByComp = "SCISSORS";

            if (!end && !newGame) {
                System.out.println("PLAYER: " + playerChoice + " COMPUTER: " + figureChoosedByComp);

                if (!playerChoice.equals(figureChoosedByComp)) {
                    if ((playerChoice.equals("STONE")) && (figureChoosedByComp.equals("PAPER"))) {
                        setComputerScore();
                    } else if ((playerChoice.equals("STONE")) && (figureChoosedByComp.equals("SCISSORS"))) {
                        setPlayerScore();
                    } else if ((playerChoice.equals("PAPER")) && (figureChoosedByComp.equals("STONE"))) {
                        setPlayerScore();
                    } else if ((playerChoice.equals("PAPER")) && (figureChoosedByComp.equals("SCISSORS"))) {
                        setComputerScore();
                    } else if ((playerChoice.equals("SCISSORS")) && (figureChoosedByComp.equals("STONE"))) {
                        setComputerScore();
                    } else if ((playerChoice.equals("SCISSORS")) && (figureChoosedByComp.equals("PAPER"))) {
                        setPlayerScore();
                    } else {
                        System.out.println(" TIE ");
                    }
                    System.out.println("PLAYER: " + playerScore + "COMPUTER" + computerScore + '\n');


                    if ((playerScore == rpsRules.getNumberOfWins()) || (computerScore == rpsRules.getNumberOfWins())) {
                        end = true;
                        if (playerScore > computerScore) {
                            winner = "PLAYER";
                        } else {
                            winner = "COMPUTER";
                        }
                    } else actualRound++;

                    if (newGame) {
                        getReady();
                    }
                }
            }
        }
    }
}