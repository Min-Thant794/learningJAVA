package exercises;

public class TwoDArrayExercise3 {
    public static void main(String[] args) {
        int row = TwoDArrayExercise1.getRows();
        int col = TwoDArrayExercise1.getColumns();
        int[][] arr = new int[row][col];

        TwoDArrayExercise1.setData(arr);

        int maxElement = maximumElement(arr);
        int minElement = minimumElement(arr);

        System.out.println("Maximum Element: " + maxElement);
        System.out.println("Minimum Element: " + minElement);
    }

    public static int maximumElement(int[][] a) {
        int max = a[0][0];

        for(int[] r : a) {
            for(int c : r) {
                if(max < c) {
                    max = c;
                }
            }
        }

        return max;
    }

    public static int minimumElement(int[][] a) {
        int min = a[0][0];

        for(int[] r : a) {
            for(int c : r) {
                if(min > c) {
                    min = c;
                }
            }
        }

        return min;
    }
}
