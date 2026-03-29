package exercises;

public class TwoDArrayExercise12 {

    public static void main(String[] args) {
        int row1 = TwoDArrayExercise10.getRows();
        int col1 = TwoDArrayExercise10.getColumns();
        int[][] arr1 = new int[row1][col1];

        TwoDArrayExercise10.setData(arr1);

        int row2 = TwoDArrayExercise10.getRows();
        int col2 = TwoDArrayExercise10.getColumns();
        int[][] arr2 = new int[row2][col2];

        TwoDArrayExercise10.setData(arr2);

        boolean isEqualMatrices = isEqual(arr1, arr2);

        if (isEqualMatrices) {
            System.out.println("This two matrices are equal");
        } else {
            System.out.println("This two matrices are not equal");
        }
    }

    public static boolean isEqual(int[][] a1, int[][] a2) {

        if(a1.length != a2.length || a1[0].length != a2[0].length) {
            return false;
        }

        for (int r = 0; r < a1.length; r++) {
            for (int c = 0; c < a1[r].length; c++) {
                if (a1[r][c] != a2[r][c]) {
                    return false;
                }
            }
        }

        return true;
    }
}
