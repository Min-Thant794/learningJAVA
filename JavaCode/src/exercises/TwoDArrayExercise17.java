package exercises;

public class TwoDArrayExercise17 {
    public static void main (String[] args) {
        int row, col;

        do {
            row = TwoDArrayExercise10.getRows();
            col = TwoDArrayExercise10.getColumns();

            if (row != col) {
                System.out.println("Length of row and column must be the same");
            }
        } while (row != col);

        int[][] arr = new int[row][col];

        TwoDArrayExercise10.setData(arr);

        System.out.println("Original array: ");
        for (int[] r : arr) {
            for (int c : r) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

        upperTriangular(arr);
    }

    public static void upperTriangular(int[][] a) {
        for (int r = 0; r < a.length; r++) {
            for (int c = 0; c < a[r].length; c++) {
                if ( c > r) {
                    System.out.print(a[r][c] + " ");
                }
            }
            System.out.println();
        }
    }
}
