package exercises;
import static exercises.NestedLoopExercise1.getLines;

public class NestedLoopExercise16 {
    public static void main(String[] args) {
        int lines = getLines();
        display(lines);
    }

    public static void display(int num) {
        for(int i = 0; i < num; i++) {

            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            int start = num - i - 1;

            for(int k = start; k >= 1; k--) {
                System.out.print(k + " ");
            }

            for(int k = 1; k <= start; k++) {
                System.out.print(k + " ");
            }

            System.out.println();
        }
    }
}
