package exercises;

public class TwoDArrayExercise19 {
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

        System.out.println("Original array: ");

        for (int[] r : arr) {
            for (int c : r) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

        int sum = sumOfUpperTriangularArray(arr);
        System.out.println("Sum: " + sum);
    }

    public static int sumOfUpperTriangularArray(int[][] a) {
        int sum = 0;

        for (int r = 0; r < a.length; r++) {
            for (int c = 0; c < a[r].length; c++) {
                if (c > r) {
                    sum += a[r][c];
                }
            }
        }

        return sum;
    }
}
