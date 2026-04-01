package exercises;
import java.util.*;

public class TwoDArrayExercise23 {
    static char arr[][];
    static Scanner sc = new Scanner(System.in);

    public static void createArray() {
        int dimension, row, col;

        do {
            System.out.print("Enter number of dimension (>= 3): ");
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

    public static boolean isVWin(int c, char ch) {
        for (int r = 0; r < arr.length; r++) {
            if (arr[r][c] != ch) {
                return false;
            }
        }

        return true;
    }

    public static boolean isMDWin(int r, int c, char ch) {
        if(r != c) {
            return false;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i][i] != ch) {
                return false;
            }
        }

        return true;
    }

    public static boolean isODWin(int r, int c, char ch) {
        int size = arr.length;

        if (size - 1 - r != c) {
            return false;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i][size - 1 - i] != ch) {
                return false;
            }
        }

        return true;
    }

    public static boolean isWin(int r, int c, char ch) {
        return isHWin(r, ch) || isVWin(c, ch) || isMDWin(r, c, ch) || isODWin(r, c, ch);
    }

    public static void display() {
        System.out.println("The current board is: ");
        for (int r = 0; r < arr.length; r++) {
            System.out.print(" | ");
            for (int c = 0; c < arr[r].length; c++) {
                System.out.print(arr[r][c] + " | ");
            }
            System.out.println();
        }
    }

    public static boolean fill(char ch) {
        display();
        int r, c;

        do {
            System.out.println("Enter row and column to fill: ");
            r = sc.nextInt();
            c = sc.nextInt();
        } while (arr[r][c] != ' ');

        arr[r][c] = ch;
        return isWin(r, c, ch);
    }
}
