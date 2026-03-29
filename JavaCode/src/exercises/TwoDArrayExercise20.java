package exercises;

public class TwoDArrayExercise20 {
    public static void main(String[] args) {
        int row = TwoDArrayExercise10.getRows();
        int col = TwoDArrayExercise10.getColumns();
        int[][] arr = new int[row][col];
        TwoDArrayExercise10.setData(arr);

        System.out.println("Original array: ");
        for (int[] r : arr) {
            for (int c : r) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

        int[][] transposedMatrix = transposeOfMatrix(arr);

        System.out.println("Transpose of matrix: ");
        for (int[] r : transposedMatrix) {
            for (int c : r) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transposeOfMatrix(int[][] a) {
        int[][] newArr = new int[a[0].length][a.length];

        for (int r = 0; r < a.length; r++) {
            for (int c = 0; c < a[r].length; c++) {
                newArr[c][r] = a[r][c];
            }
        }

        return newArr;
    }
}
