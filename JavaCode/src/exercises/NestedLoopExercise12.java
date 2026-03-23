package exercises;

import static exercises.NestedLoopExercise1.getLines;

public class NestedLoopExercise12 {
    public static void main(String[] args) {
        int lines = getLines();
        display(lines);
    }

    public static void display(int num) {
        int mid = num/2;

        System.out.println("mid: " + mid);

        for (int i = 0; i < num; i++) {
            if (i <= mid) {
                for (int s = 0; s < i; s++) {
                    System.out.print(" ");
                }

                for (int j = 0; j < mid + 1 - i; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int k = 0; k < num - i - 1; k++) {
                    System.out.print(" ");
                }

                for (int l = 0; l < i - mid + 1; l++) {
                    System.out.print("* ");
                }
            }

            System.out.println();
        }
    }
}
