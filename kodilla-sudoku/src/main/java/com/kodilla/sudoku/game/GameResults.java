package com.kodilla.sudoku.game;

import com.kodilla.sudoku.board.BoardStack;
import com.kodilla.sudoku.board.SudokuBoard;

import java.util.Deque;

public class GameResults {

    public void showResults(BoardStack boardStack) {
        Deque<SudokuBoard> result = boardStack.getBoardStack();

        if (result.size() == 1001) {
            System.out.println("MORE THAN 1000 RESULTS.");
        } else {
            System.out.println("NUMBER OF RESULTS : " + result.size());
        }

        if (result.size() > 1) {
            System.out.println("ONE OF ANSWER :\n" + result.pop() + "\n");
        } else {
            System.out.println("ANSWER\n" + result.pop() + "\n");
        }
    }
}
