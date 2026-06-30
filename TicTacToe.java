/**
 * TicTacToe
 * UC6 places a player's symbol on the board.
 */

public class TicTacToe {

    static char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
    };

    public static void main(String[] args) {

        placeMove(1, 1, 'X');

        printBoard();

    }

    static void placeMove(int row, int col, char symbol) {

        board[row][col] = symbol;

    }

    static void printBoard() {

        System.out.println("-------------");

        for (int row = 0; row < 3; row++) {

            System.out.print("| ");

            for (int col = 0; col < 3; col++) {

                System.out.print(board[row][col] + " | ");

            }

            System.out.println();
            System.out.println("-------------");

        }

    }

}