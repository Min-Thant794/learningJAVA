package exercises;

public class TwoDArrayExercise2 {
    public static void main(String[] args) {
        int row = TwoDArrayExercise1.getRows();
        int col = TwoDArrayExercise1.getColumns();

        int[][] arr = new int[row][col];
        TwoDArrayExercise1.setData(arr);

        int sum = sum(arr);
        int negativeCount = negativeCount(arr);
        int positiveCount = positiveCount(arr);
        float average = calculateAverage(arr);

        System.out.println("Sum of two dimensional array is " + sum);
        System.out.println("Negative count: " + negativeCount);
        System.out.println("Positive count: " + positiveCount);
        System.out.println("Average: " + average);
    }

    public static int sum(int[][] a) {
        int r, c;
        int sum = 0;

        for(r = 0; r < a.length; r++) {
            for(c = 0; c < a[r].length; c++) {
                sum += a[r][c];
            }
        }

        return sum;
    }

    public static int negativeCount(int[][] a) {
        int r, c;
        int count = 0;

        for(r = 0; r < a.length; r++) {
            for(c = 0; c < a[r].length; c++) {
                if(a[r][c] < 0) {
                    count++;
                }
            }
        }

        return count;
    }

    public static int positiveCount(int[][] a) {
        int r, c;
        int count = 0;

        for (r = 0; r < a.length; r++) {
            for(c = 0; c < a[r].length; c++) {
                if(a[r][c] > 0) {
                    count++;
                }
            }
        }

        return count;
    }

    public static float calculateAverage(int[][] a) {
        int total = sum(a);
        int positiveCount = positiveCount(a);
        int negativeCount = negativeCount(a);
        float avg;
        int zeroCount = 0;

        for(int[] r : a) {
            for(int c : r) {
                if(c == 0) {
                    zeroCount += 1;
                }
            }
        }

        avg = (float) total / (positiveCount + negativeCount + zeroCount);

        return avg;
    }
}
