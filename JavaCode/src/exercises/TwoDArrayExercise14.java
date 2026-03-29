package exercises;

public class TwoDArrayExercise14 {
    public static void main(String[] args) {
        int row, col;

        do {
            row = TwoDArrayExercise10.getRows();
            col = TwoDArrayExercise10.getColumns();

            if(row != col) {
                System.out.println("The length of rows and columns must be the same");
            }
        } while (row != col);

        int[][] arr = new int[row][col];

        TwoDArrayExercise10.setData(arr);

        int sum = minorDiagonal(arr);

        System.out.println("Sum of minor diagonal: " + sum);
    }

    public static int minorDiagonal(int[][] a) {
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i][a.length - i -1];
        }

        return sum;
    }
}
