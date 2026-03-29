package exercises;

public class TwoDArrayExercise16 {
    public static void main(String[] args) {
        int row, col;

        do {
            row = TwoDArrayExercise10.getRows();
            col = TwoDArrayExercise10.getColumns();

            if(row != col) {
                System.out.println("Length of row and column must be the same");
            }
        } while (row != col);

        int[][] arr = new int[row][col];

        TwoDArrayExercise10.setData(arr);

        System.out.println("Original Array: ");
        for (int[] r : arr) {
            for (int c : r) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

        diagonalInterchangedArr(arr);
        System.out.println("\tDiagonal interchanged array: ");
        for (int [] r : arr) {
            for (int c : r) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public static void diagonalInterchangedArr(int[][] a) {
        int n = a.length;

        for (int i = 0; i < n; i++) {
            int temp = a[i][i];
            a[i][i] = a[i][n - i - 1];
            a[i][n - i - 1] = temp;
        }
    }
}