import java.util.Random;

/**
 * TicTacToe
 * UC2 performs a random toss to decide who plays first
 * and assigns symbols (X or O).
 */

public class TicTacToe {

    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    public static void main(String[] args) {

        tossAndAssignSymbols();
        displayTossResult();

    }

    static void tossAndAssignSymbols() {

        Random random = new Random();

        if (random.nextBoolean()) {

            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';

        } else {

            isHumanTurn = false;
            humanSymbol = 'O';
            computerSymbol = 'X';

        }

    }

    static void displayTossResult() {

        if (isHumanTurn) {

            System.out.println("🎉 Human won the toss!");
            System.out.println("Human Symbol: " + humanSymbol);
            System.out.println("Computer Symbol: " + computerSymbol);

        } else {

            System.out.println("🤖 Computer won the toss!");
            System.out.println("Human Symbol: " + humanSymbol);
            System.out.println("Computer Symbol: " + computerSymbol);

        }

    }

}