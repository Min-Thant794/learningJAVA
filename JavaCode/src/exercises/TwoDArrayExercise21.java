package exercises;

public class TwoDArrayExercise21 {
    public static void main(String[] args) {
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

        System.out.println("Two dimensional array: ");
        for (int[] r : arr) {
            for (int c : r) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

        boolean isIdentity = identityMatrix(arr);

        if (isIdentity) {
            System.out.println("This two dimensional array is an identity matrix");
        } else {
            System.out.println("This two dimensional array is not an identity matrix");
        }
    }

    public static boolean identityMatrix(int[][] a) {
        for (int r = 0; r < a.length; r++) {
            for (int c = 0; c < a[r].length; c++) {

                if (r == c) {
                    if (a[r][c] != 1) {
                        return false;
                    }
                } else {
                    if (a[r][c] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}