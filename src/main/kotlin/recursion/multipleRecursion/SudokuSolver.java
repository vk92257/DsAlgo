package main.kotlin.recursion.multipleRecursion;

// will solve this in future

public class SudokuSolver {

    public static void main(String[] args) {
        char[][] board = {
                { '8', '-', '-', '-', '-', '-', '-', '-', '-' },
                { '-', '-', '3', '6', '-', '-', '-', '-', '-' },
                { '-', '7', '-', '-', '9', '-', '2', '-', '-' },
                { '-', '5', '-', '-', '-', '7', '-', '-', '-' },
                { '-', '-', '-', '-', '4', '5', '7', '-', '-' },
                { '-', '-', '-', '1', '-', '-', '-', '3', '-' },
                { '-', '-', '1', '-', '-', '-', '-', '6', '8' },
                { '-', '-', '8', '5', '-', '-', '-', '1', '-' },
                { '-', '9', '-', '-', '-', '-', '4', '-', '-' }
        };

        sove(board);
        printBoard(board);

    }

    private static void printBoard(char board[][]) {
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board.length; column++) {
                System.out.print(board[row][column] + " ");
            }
            System.out.println();
        }
    }

    private static boolean sove(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '-') {
                    for (char c = 1; c <= 9; c++) {
                        board[i][j] = c;
                        if (isValid(board, i, j, c)) {
                            return true;
                        } else {
                            board[i][j] = 0;
                        }
                    }
                    return false;

                } else {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValid(char[][] sudokuBoard, int i, int j, int put) {

        for (int loopIndex = 0; loopIndex < 9; loopIndex++) {
            if (sudokuBoard[loopIndex][j] == put) {
                return false;
            }
            if (sudokuBoard[i][loopIndex] == put) {
                return false;
            }

            if (sudokuBoard[3 * (i / 3) + loopIndex / 3][3 * (j / 3) + loopIndex % 3] == put) {
                return false;
            }

        }
        return true;
    }

}
