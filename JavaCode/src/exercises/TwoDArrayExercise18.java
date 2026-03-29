package exercises;

public class TwoDArrayExercise18 {
    public static void main (String[] args)
    {
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

        lowerTriangular(arr);
    }

    public static void lowerTriangular(int[][] a) {

    }
}
