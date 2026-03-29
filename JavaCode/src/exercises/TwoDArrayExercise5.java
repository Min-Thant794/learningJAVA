package exercises;

import java.util.Scanner;

public class TwoDArrayExercise5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int row = getRows();
        int col = getColumns();
        int[][] arr = new int[row][col];

        setData(arr);
        int secondLargestElement = secondLargest(arr);

        System.out.println("Second largest element in two dimensional array: " + secondLargestElement);
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
                System.out.print("Enter element for arr[" + r + "][" + c + "]: ");
                a[r][c] = sc.nextInt();
            }
        }
    }

    public static int secondLargest(int[][] a) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int r = 0; r < a.length; r++) {
            for (int c = 0; c < a[r].length; c++) {
                if (a[r][c] > largest) {
                    largest = a[r][c];
                }
            }
        }

        for (int r = 0; r < a.length; r++) {
            for (int c = 0; c < a[r].length; c++) {
                if (a[r][c] > secondLargest && a[r][c] < largest) {
                    secondLargest = a[r][c];
                }
            }
        }

        return secondLargest;
    }
}
