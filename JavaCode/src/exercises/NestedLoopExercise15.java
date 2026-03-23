package exercises;
import static exercises.NestedLoopExercise1.getLines;

public class NestedLoopExercise15 {
    public static void main(String[] args) {
        int lines = getLines();
        display(lines);
    }

    public static void display(int num) {
        int mid = num / 2;

        for (int i = 0; i < num; i++) {

            if (i == 0 || i == num - 1) {
                // first and last row
                for (int j = 0; j < num; j++) {
                    System.out.print("*");
                }

            } else if (i <= mid) {
                // top half including middle

                // left stars
                for (int j = 0; j < mid - i + 1; j++) {
                    System.out.print("*");
                }

                // middle spaces
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }

                // right stars
                for (int j = 0; j < mid - i + 1; j++) {
                    System.out.print("*");
                }

            } else {
                // bottom half

                // left stars
                for (int j = 0; j < i - mid + 1; j++) {
                    System.out.print("*");
                }

                // middle spaces
                for (int j = 0; j < 2 * (num - i) - 3; j++) {
                    System.out.print(" ");
                }

                // right stars
                for (int j = 0; j < i - mid + 1; j++) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}
