package exercises;
import java.util.*;

public class TwoDArrayExercise23 {
    static char arr[][];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static void createArray() {
        int dimension, row, col;

        do {
            System.out.print("Enter number of dimension: ");
            dimension = sc.nextInt();
        } while (dimension < 3);

        arr = new char[dimension][dimension];

        for (row = 0; row < dimension; row++) {
            for (col = 0; col < dimension; col++) {
                arr[row][col] = ' ';
            }
        }
    }

    public static boolean isGameOver() {
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if (arr[r][c] == ' ') {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isHWin(int r, char ch) {
        for (int c = 0; c < arr[r].length; c++) {
            if (arr[r][c] != ch) {
                return false;
            }
        }

        return true;
    }
}
