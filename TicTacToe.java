/**
 * TicTacToe
 * UC5 validates whether a move is inside the board
 * and whether the selected cell is empty.
 */

public class TicTacToe {

    static char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
    };

    public static void main(String[] args) {

        System.out.println(isValidMove(1, 1));

    }

    static boolean isValidMove(int row, int col) {

        if (row < 0 || row > 2) {
            return false;
        }

        if (col < 0 || col > 2) {
            return false;
        }

        return board[row][col] == '-';

    }

}