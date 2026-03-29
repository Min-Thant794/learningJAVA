package exercises;

public class TwoDArrayExercise15 {
    public static void main(String[] args) {
        int row = TwoDArrayExercise10.getRows();
        int col = TwoDArrayExercise10.getColumns();
        int[][] arr = new int[row][col];

        TwoDArrayExercise10.setData(arr);

        sumOfRow(arr);
        sumOfCol(arr);
    }

    public static void sumOfRow(int[][] a) {
        for (int r = 0; r < a.length; r++) {
            int total = 0;
            for (int c = 0; c < a[r].length; c++) {
                total += a[r][c];
            }
            System.out.println("Sum of row " + r + " = " + total);
        }
    }

    public static void sumOfCol(int[][] a) {
        for (int c = 0; c < a[0].length; c++) {
            int total = 0;
            for (int[] ints : a) {
                total += ints[c];
            }

            System.out.println("Sum of column " + c + " = " + total);
        }
    }
}
