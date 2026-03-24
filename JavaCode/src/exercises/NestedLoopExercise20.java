package exercises;
import static exercises.NestedLoopExercise1.getLines;

public class NestedLoopExercise20 {
    public static void main(String[] args) {
        int lines = getLines();
        display(lines);
    }

    public static void display(int num) {

        for(int i = 0; i < num; i++) {

            for(int s = 0; s < num - i - 1; s++) {
                System.out.print("  ");
            }

            int value = 1;

            for(int j = 0; j <= i; j++) {
                System.out.print(value + "  ");
                value = value * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}
