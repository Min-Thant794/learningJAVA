package exercises;

public class TwoDArrayExercise13 {
    public static void main(String[] args) {

        int row, col;

        do {
            row = TwoDArrayExercise10.getRows();
            col = TwoDArrayExercise10.getColumns();

            if (row != col) {
                System.out.println("The number of rows and columns must be the same");
            }
        } while (row != col);

        int[][] arr = new int[row][col];

        TwoDArrayExercise10.setData(arr);

        int sum = sumOfDiagonalElement(arr);

        System.out.println("The sum of main diagonal elements: " + sum);
    }

    public static int sumOfDiagonalElement(int[][] a) {
        int sum = 0;
        for (int r = 0; r < a.length; r++) {
            sum += a[r][r];
        }

        return sum;
    }
}
