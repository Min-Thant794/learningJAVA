package exercises;

public class TwoDArrayExercise22 {
    public static void main(String[] args) {
        int row, col;

        do {
            row = TwoDArrayExercise10.getRows();
            col = TwoDArrayExercise10.getColumns();

            if(row != col) {
                System.out.println("Length of row and column must be equal");
            }
        } while (row != col);

        int[][] arr = new int[row][col];
        TwoDArrayExercise10.setData(arr);

        System.out.println("Two dimensional array: ");
        for (int[] r : arr) {
            for (int c : r) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

        boolean symmetric = isSymmetric(arr);

        System.out.println(symmetric ? "This two dimensional array is symmetric" : "This two dimensional array is not symmetric");
    }

    public static boolean isSymmetric(int[][] a) {
        for (int r = 0; r < a.length; r++) {
            for (int c = r + 1; c < a.length; c++) {

                if (a[r][c] != a[c][r]) {
                    return false;
                }
            }
        }

        return true;
    }
}
