/*
* Runs the Rock Paper Scissors game
*/

import java.util.Scanner;

/**
* Class RockPaperScissor.
*/

final class RockPaperScissor {

    /**
    * Constant for rock.
    */
    public static final int ROCK = 1;

    /**
    * Constant for paper.
    */
    public static final int PAPER = 2;

    /**
    * Constant for Scissors.
    */
    public static final int SCISSORS = 3;

    /**
    * Constant for magic number 0.
    */

    public static final int MAGIC_0 = 0;
    /**
    * Constant for magic number 1.
    */
    public static final int MAGIC_1 = 1;
    /**
    * Constant for magic number 2.
    */
    public static final int MAGIC_2 = 2;

    /**
    * Constant for magic number 3.
    */
    public static final int MAGIC_3 = 3;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private RockPaperScissor() {
        throw new IllegalStateException("Cannot be instantiated");
    }
    /**
    * Generates cpu's random move.
    *
    * @return cpu's move
    */

    public static int cpuMove() {
        // Process
        final int max = MAGIC_3;
        final int min = MAGIC_1;
        final int cpuMove = (int) Math.floor(Math.random() * (
            max - min + MAGIC_1) + min);
        return cpuMove;
    }
    /**
    * Function for game logic or win conditions.
    *
    * @param userMove the move the user chose
    * @param cpuMove the move the cpu chose
    *
    * @return the game outcome
    */

    public static String gameLogic(final int userMove, final int cpuMove) {
        // Process
        int gameOutcome = MAGIC_0;
        String gameOutcomeString = null;
        if (userMove == cpuMove) {
            gameOutcome = MAGIC_3;
        } else if ((userMove == ROCK) & (cpuMove == PAPER)) {
            gameOutcome = MAGIC_2;
        } else if ((userMove == ROCK) & (cpuMove == SCISSORS)) {
            gameOutcome = MAGIC_1;
        } else if ((userMove == PAPER) & (cpuMove == ROCK)) {
            gameOutcome = MAGIC_1;
        } else if ((userMove == PAPER) & (cpuMove == SCISSORS)) {
            gameOutcome = MAGIC_2;
        } else if ((userMove == SCISSORS) & (cpuMove == ROCK)) {
            gameOutcome = MAGIC_2;
        } else {
            gameOutcome = MAGIC_1;
        }
        if (gameOutcome == MAGIC_1) {
            gameOutcomeString = "User Wins!";
        } else if (gameOutcome == MAGIC_2) {
            gameOutcomeString = "Cpu Wins!";
        } else {
            gameOutcomeString = "Tie!";
        }
        return gameOutcomeString;
    }
    /**
    * The Starting main() function.
    *
    * @param args Not used.
    * @throws InputMismatchException If user input is invalid
    */

    public static void main(final String[] args) {
        // Input and scanner
        final Scanner myObj = new Scanner(System.in);
        try {
            System.out.println("Rock (1)");
            System.out.println("Paper (2)");
            System.out.println("Scissors (3)");
            System.out.println("Shoot!");
            System.out.println(
                "Input the corresponding number with your move: ");
            final int userMove = myObj.nextInt();
            final int computerMove = cpuMove();
            if (computerMove == ROCK) {
                System.out.println("The cpu chose rock");
            } else if (computerMove == PAPER) {
                System.out.println("The cpu chose paper");
            } else {
                System.out.println("The cpu chose scissors");
            }
            final String gameOutcome = gameLogic(userMove, computerMove);
            // Output
            System.out.println(gameOutcome);
        } catch (java.util.InputMismatchException error) {
            System.out.println(
                    "Invalid input, must use the corresponding number");
        } finally {
            System.out.println("Done.");
        }
    }
}

