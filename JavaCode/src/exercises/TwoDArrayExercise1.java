package exercises;

import java.util.Scanner;

public class TwoDArrayExercise1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int row = getRows();
        int col = getColumns();
        int[][] arr = new int[row][col];
        setData(arr);
        printNegativeElements(arr);
    }

    public static int getRows() {
        int row;
        do{
            System.out.print("Enter numbers of row: ");
            row = sc.nextInt();
        } while (row < 1);

        return row;
    }

    public static int getColumns() {
        int col;
        do {
            System.out.print("Enter numbers of columns: ");
            col = sc.nextInt();
        } while (col < 1);

        return col;
    }

    public static void setData(int[][] a) {
        int r, c;

        for(r = 0; r < a.length; r++) {
            for(c = 0; c < a[r].length; c++) {
                System.out.print("Enter value for arr[" + r + "][" + c + "]: ");
                a[r][c] = sc.nextInt();
            }
        }
    }

    public static void printNegativeElements(int[][] a) {
        int r, c;

        System.out.print("Negative elements are: ");
        for(r = 0; r < a.length; r++) {
            for(c = 0; c < a[r].length; c++) {
                if(a[r][c] < 0) {
                    System.out.print(a[r][c] + " ");
                }
            }
        }
    }
}
