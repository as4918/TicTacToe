/**
 * TicTacToe
 * UC10 checks whether the game has ended in a draw.
 */

public class TicTacToe {

    static char[][] board = {
            {'X', 'O', 'X'},
            {'X', 'O', 'O'},
            {'O', 'X', 'X'}
    };

    public static void main(String[] args) {

        if (isDraw()) {
            System.out.println("Game is a Draw!");
        } else {
            System.out.println("Game is Not a Draw.");
        }

    }

    static boolean isDraw() {

        for (int row = 0; row < 3; row++) {

            for (int col = 0; col < 3; col++) {

                if (board[row][col] == '-') {
                    return false;
                }

            }

        }

        return true;
    }

}