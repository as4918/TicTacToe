/**
 * TicTacToe
 * UC8 demonstrates a continuous turn-based game loop.
 */

public class TicTacToe {

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    public static void main(String[] args) {

        while (!gameOver) {

            if (isHumanTurn) {

                System.out.println("Human Turn");

            } else {

                System.out.println("Computer Turn");

            }

            isHumanTurn = !isHumanTurn;

            // Temporary stop for UC8 demonstration
            gameOver = true;
        }

        System.out.println("Game Over");

    }

}