package exercises;

public class RecursionExercise2 {
    public static void main(String[] args) {
        int powerFunction = power(2, 5);

        System.out.println("Result: " + powerFunction);
    }

    public static int power(int b, int p) {
        if (p == 0) {
            return 1;
        }

        return b * power(b, p-1);
    }
}
