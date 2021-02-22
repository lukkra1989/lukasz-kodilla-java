package com.kodilla.rps;

public class RpsRunner {

    public static void main(String[] args) {

        Boolean result;
        RpsRules rpsRules = new RpsRules();

        do {
            rpsRules.getInfo();
            RpsGame game = new RpsGame(rpsRules);
            game.startNewGame();
            System.out.println(game);
            System.out.println("X-END OF THE GAME N=NEW GAME");
            result = game.exitToMenu();
        } while (!result);
    }
}
