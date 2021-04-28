package com.kodilla.sudoku.game;

import com.kodilla.sudoku.board.BoardStack;
import com.kodilla.sudoku.board.SudokuBoard;

import java.util.Deque;

public class GameResults {

    public void showResults(BoardStack boardStack) {
        Deque<SudokuBoard> result = boardStack.getBoardStack();

        if (result.size() == 1001) {
            System.out.println("Number of results is bigger than 1000.");
        } else {
            System.out.println("Number of possible results is: " + result.size());
        }

        if (result.size() > 1) {
            System.out.println("One of possible answers:\n" + result.pop() + "\n");
        } else {
            System.out.println("Answer:\n" + result.pop() + "\n");
        }
    }
}
