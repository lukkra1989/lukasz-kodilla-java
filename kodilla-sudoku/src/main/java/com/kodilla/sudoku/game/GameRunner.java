package com.kodilla.sudoku.game;

import com.kodilla.sudoku.board.BoardStack;
import com.kodilla.sudoku.board.SudokuBoard;
import com.kodilla.sudoku.logic.FirstEmptyFinder;
import com.kodilla.sudoku.logic.SudokuSolver;

public class GameRunner {

    private static final SudokuSolver solver = new SudokuSolver();
    private static final FirstEmptyFinder firstEmptyFinder = new FirstEmptyFinder();

    public BoardStack run(SudokuBoard board) {
        BoardStack solvedStack = new BoardStack();
        BoardStack tempBoardStack = new BoardStack();
        BoardStack backtrack = new BoardStack();
        if (solver.solve(board).isSolution()) {
            if (solver.solve(board).getCount() == 81) {
                solvedStack.addBoard(solver.solve(board).getBoard());
                return solvedStack;
            } else {
                board = solver.solve(board).getBoard();
                tempBoardStack.addBoard(board);

                do {
                    board = tempBoardStack.getBoardStack().pop();
                    int n = firstEmptyFinder.findRow(board);
                    int m = firstEmptyFinder.findColumn(board);
                    for (int i = 0; i < board.getBoard().get(n).getElement(m).getNumbers().size(); i++) {
                        backtrack.addBoard(board);
                    }
                    for (int i = 0; i < board.getBoard().get(n).getElement(m).getNumbers().size(); i++) {
                        board.getBoard().get(n).getElement(m).setNumber(board.getBoard().get(n).getElement(m).getNumbers().get(i));
                        if (solver.solve(board).isSolution()) {
                            solver.solve(board);
                            if (solver.solve(board).getCount() == 81) {
                                solvedStack.addBoard(board);
                                if (solvedStack.getBoardStack().size() > 1000) {
                                    return solvedStack;
                                }
                            } else {
                                tempBoardStack.addBoard(board);
                            }
                        }
                        board = backtrack.getBoardStack().pop();

                    }
                } while (tempBoardStack.getBoardStack().size() > 0);
            }
        } else {
            System.out.println("There is no correct solution.\n");
        }

        return solvedStack;
    }
}
