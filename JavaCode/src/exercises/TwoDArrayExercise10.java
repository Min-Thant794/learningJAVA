package exercises;

import java.util.Scanner;

public class TwoDArrayExercise10 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int row1 = getRows();
        int col1 = getColumns();

        int[][] arr1 = new int[row1][col1];
        setData(arr1);

        int row2 = getRows();
        int col2 = getColumns();

        int[][] arr2 = new int[row2][col2];
        setData(arr2);

        int[][] result = subtractTwoMatrics(arr1, arr2);

        if(result != null) {
            System.out.print("Result: ");
            for (int[] r : result) {
                for (int c : r) {
                    System.out.print(c + " ");
                }
                System.out.println();
            }
        }
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
                System.out.print("Enter element for array[" + r + "][" + c + "]: ");
                a[r][c] = sc.nextInt();
            }
        }
    }

    public static int[][] subtractTwoMatrics(int[][] a1, int[][] a2) {
        if(a1.length != a2.length || a1[0].length != a2[0].length) {
            System.out.println("This two arrays cannot be substracted because their lengths are different");
            return null;
        }

        int[][] result = new int[a1.length][a1[0].length];

        for (int r = 0; r < a1.length; r++) {
            for (int c = 0; c < a1[r].length; c++) {
                result[r][c] = a1[r][c] - a2[r][c];
            }
        }

        return result;
    }
}
