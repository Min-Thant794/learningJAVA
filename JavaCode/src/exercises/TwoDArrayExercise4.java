package exercises;

import java.util.Scanner;

public class TwoDArrayExercise4 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int row = getRows();
        int col = getColumns();
        int[][] arr = new int[row][col];

        setData(arr);
        maxEvenElement(arr);
        minEvenElement(arr);
    }

    public static int getRows() {
        int row;

        do {
            System.out.print("Enter number of row: ");
            row = sc.nextInt();
        } while (row < 1);

        return row;
    }

    public static int getColumns() {
        int col;

        do {
            System.out.print("Enter number of column: ");
            col = sc.nextInt();
        } while (col < 1);

        return col;
    }

    public static void setData(int[][] arr) {
        int r, c;

        for(r = 0; r < arr.length; r++) {
            for(c = 0; c < arr[r].length; c++) {
                System.out.print("Enter value for arr[" + r + "][" + c + "]: ");
                arr[r][c] = sc.nextInt();
            }
        }
    }

    public static void maxEvenElement(int[][] arr) {
        int maxElement = Integer.MIN_VALUE;
        
        boolean found = false;

        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if(arr[r][c] % 2 == 0) {
                    if(arr[r][c] > maxElement) {
                        maxElement = arr[r][c];
                        found = true;
                    }
                }
            }
        }

        if (found) {
            System.out.println("Max Even Element: " + maxElement);
        } else {
            System.out.println("No Even Number Found!");
        }
    }

    public static void minEvenElement(int[][] arr) {
        int minElement = Integer.MAX_VALUE;

        boolean found = false;

        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if (arr[r][c] % 2 == 0) {
                    if (arr[r][c] < minElement) {
                        minElement = arr[r][c];
                        found = true;
                    }
                }
            }
        }

        if (found) {
            System.out.println("Min Even Element: " + minElement);
        } else {
            System.out.println("No even number found!");
        }
    }
}
