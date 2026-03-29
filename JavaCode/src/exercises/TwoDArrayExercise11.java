package exercises;

import java.util.Scanner;

public class TwoDArrayExercise11 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int row1 = TwoDArrayExercise10.getRows();
        int col1 = TwoDArrayExercise10.getColumns();
        int[][] arr1 = new int[row1][col1];

        TwoDArrayExercise10.setData(arr1);

        int row2 = TwoDArrayExercise10.getRows();
        int col2 = TwoDArrayExercise10.getColumns();
        int[][] arr2 = new int[row2][col2];

        TwoDArrayExercise10.setData(arr2);

        int[][] result = multiplyTwoMatrices(arr1, arr2);
        for(int r = 0; r < result.length; r++) {
            for(int c = 0; c < result[r].length; c++) {
                System.out.print(result[r][c] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplyTwoMatrices(int[][] a1, int[][] a2) {

        if (a1[0].length != a2.length) {
            System.out.println("These two arrays cannot be multiplied");
            return null;
        }

        int[][] result = new int[a1.length][a2[0].length];

        for (int r = 0; r < a1.length; r++) {
            for (int c = 0; c < a2[0].length; c++) {
                for (int k = 0; k < a1[0].length; k++) {
                    result[r][c] += a1[r][k] * a2[k][c];
                }
            }
        }

        return result;
    }
}
