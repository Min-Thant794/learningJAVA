package exercises;

import java.util.Scanner;

public class TwoDArrayExercise6 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int row = getRows();
        int col = getColumns();
        int[][] arr = new int[row][col];

        setData(arr);

        calculateTotal(arr);
    }

    public static int getRows() {
        int row;

        do{
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
                System.out.print("Enter value for arr[" + r + "][" + c + "]: ");
                a[r][c] = sc.nextInt();
            }
        }
    }

    public static void calculateTotal(int[][] a) {
        int totalForEven = 0;
        int totalForOdd = 0;

        for (int r = 0; r < a.length; r++) {
            for (int c = 0; c < a[r].length; c++) {
                if (a[r][c] % 2 == 0) {
                    totalForEven += a[r][c];
                } else {
                    totalForOdd += a[r][c];
                }
            }
        }

        System.out.println("Total numbers of even numbers: " + totalForEven);
        System.out.println("Total numbers of odd numbers: " + totalForOdd);
    }
}
