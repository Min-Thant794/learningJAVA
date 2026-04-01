package exercises;

public class TicTacToeApp {
    public static void main (String[] args) {
        TwoDArrayExercise23.createArray();

        do {
            System.out.println("Player 1, your turn!");
            if (TwoDArrayExercise23.fill('X')) {
                System.out.println("Player 1, you win the game");
                break;
            }

            if (TwoDArrayExercise23.isGameOver()) {
                System.out.println("Game Over!");
                break;
            }

            System.out.println("Player 2, your turn!");
            if (TwoDArrayExercise23.fill('O')) {
                System.out.println("Player 2, you win the game");
                break;
            }

            if (TwoDArrayExercise23.isGameOver()) {
                System.out.println("Game Over!");
                break;
            }
        } while (true);
    }
}
