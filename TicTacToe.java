/**
 * TicTacToe
 * UC9 checks whether a player has won the game.
 */

public class TicTacToe {

    static char[][] board = {
            {'X', 'X', 'X'},
            {'-', 'O', '-'},
            {'O', '-', '-'}
    };

    public static void main(String[] args) {

        if (hasWon('X')) {
            System.out.println("Player X Wins!");
        } else {
            System.out.println("Player X Has Not Won.");
        }

    }

    static boolean hasWon(char symbol) {

        // Check rows
        for (int i = 0; i < 3; i++) {

            if (board[i][0] == symbol &&
                board[i][1] == symbol &&
                board[i][2] == symbol) {

                return true;
            }

        }

        // Check columns
        for (int i = 0; i < 3; i++) {

            if (board[0][i] == symbol &&
                board[1][i] == symbol &&
                board[2][i] == symbol) {

                return true;
            }

        }

        // Main diagonal
        if (board[0][0] == symbol &&
            board[1][1] == symbol &&
            board[2][2] == symbol) {

            return true;
        }

        // Secondary diagonal
        if (board[0][2] == symbol &&
            board[1][1] == symbol &&
            board[2][0] == symbol) {

            return true;
        }

        return false;
    }

}