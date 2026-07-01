import java.util.Random;

/**
 * TicTacToe
 * UC7 allows the computer to make a random valid move.
 */

public class TicTacToe {

    static char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
    };

    static char computerSymbol = 'O';

    static Random random = new Random();

    public static void main(String[] args) {

        computerMove();

        printBoard();

    }

    static void computerMove() {

        while (true) {

            int slot = random.nextInt(9) + 1;

            int row = (slot - 1) / 3;
            int col = (slot - 1) % 3;

            if (board[row][col] == '-') {

                board[row][col] = computerSymbol;

                System.out.println("Computer selected slot: " + slot);

                break;

            }

        }

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