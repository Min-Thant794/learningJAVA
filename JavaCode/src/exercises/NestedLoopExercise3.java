package exercises;
import static exercises.NestedLoopExercise1.getLines;

public class NestedLoopExercise3 {
    public static void main(String[] args) {
        int lines = getLines();
        display(lines);
    }

    public static void display(int num) {
        for(int i = 0; i < num; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print((i+1) + " ");
            }
            System.out.println();
        }
    }
}
