package exercises;
import static exercises.NestedLoopExercise1.getLines;

public class NestedLoopExercise19 {
    public static void main(String[] args) {
        int lines = getLines();
        display(lines);
    }

    public static void display(int num) {

        for(int i = 0; i < num; i++) {

            int value = 1;

            for(int j = 0; j <= i; j++) {
                System.out.print(value + "  ");

                value = value * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}
