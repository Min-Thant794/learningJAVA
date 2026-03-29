package exercises;

import java.util.Scanner;

public class TwoDArrayExercise7 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int row = getRows();
        int col = getColumns();
        int[][] arr = new int[row][col];

        setData(arr);

        negativeElements(arr);
    }

    public static int getRows() {
        int row;

        do {
            System.out.print("Enter number of rows: ");
            row = sc.nextInt();
        } while (row < 1);

        return row;
    }

    public static int getColumns() {
        int col;

        do {
            System.out.print("Enter number of columns: ");
            col = sc.nextInt();
        } while (col < 1);

        return col;
    }

    public static void setData(int[][] a) {
        for (int r = 0; r < a.length; r++) {
            for (int c = 0; c < a[r].length; c++) {
                System.out.print("Enter value for arr[" + r +"][" + c + "]: ");
                a[r][c] = sc.nextInt();
            }
        }
    }

    public static void negativeElements(int[][] a) {
        int total = 0;
        int count = 0;
        double average = 0;

        for (int r = 0; r < a.length; r++) {
            for (int c = 0; c < a[r].length; c++) {
                if (a[r][c] < 0) {
                    total += a[r][c];
                    count++;
                }
            }
        }

        average = (double) total / count;

        System.out.println("Total number of negative elements: " + total);
        System.out.println("Numbers of element: " + count);
        System.out.println("Average of negative elements: " + average);
    }
}
