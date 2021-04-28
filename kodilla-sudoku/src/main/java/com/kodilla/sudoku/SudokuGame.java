package com.kodilla.sudoku;

import com.kodilla.sudoku.game.GameApproval;
import com.kodilla.sudoku.game.GameFinish;
import com.kodilla.sudoku.game.GameResults;
import com.kodilla.sudoku.game.GameRunner;

public class SudokuGame {
    GameApproval approval = new GameApproval();
    GameRunner runner = new GameRunner();
    GameResults results = new GameResults();
    GameFinish finish = new GameFinish();

    public static void main(String[] args) {
        SudokuGame sudokuGame = new SudokuGame();
        sudokuGame.sudokuRunner();
    }

    public void sudokuRunner() {
        boolean gameFinished = false;
        while (!gameFinished) {
            results.showResults(runner.run(approval.choose()));
            gameFinished = finish.finishGame();
        }
    }
}
