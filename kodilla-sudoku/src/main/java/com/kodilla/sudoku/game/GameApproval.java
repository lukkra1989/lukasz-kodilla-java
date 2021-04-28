package com.kodilla.sudoku.game;

import com.kodilla.sudoku.board.SudokuBoard;
import com.kodilla.sudoku.board.SudokuBuilder;
import com.kodilla.sudoku.data.DataInput;

import java.util.Scanner;

public class GameApproval {

    private static final DataInput dataInput = new DataInput();
    private static final Scanner scanner = new Scanner(System.in);
    private static final SudokuBuilder sudokuBoardBuilder = new SudokuBuilder();

    public SudokuBoard choose() {
        String choice;
        SudokuBoard board;
        do {
            board = sudokuBoardBuilder.build(dataInput.inputData());
            System.out.println("\nActual Sudoku: \n" + board + "\n");
            System.out.println("To enter data again press: 'ENTER'.\n"
                    + "To approve Sudoku, type 'SUDOKU' and press ENTER\n");
            choice = scanner.nextLine();

        } while (!choice.equals("SUDOKU") && !choice.equals("sudoku") && !choice.equals("Sudoku"));

        return board;
    }
}
