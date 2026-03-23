package exercises;
import static exercises.NestedLoopExercise1.getLines;

public class NestedLoopExercise11 {
    public static void main(String[] args) {
        int lines = getLines();
        display(lines);
    }

    public static void display(int num) {
        for (int i = 0; i < num; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < num - i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
