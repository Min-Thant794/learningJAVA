package exercises;
import static exercises.NestedLoopExercise1.getLines;

public class NestedLoopExercise18 {
    public static void main(String[] args)
    {
        int lines = getLines();
        display(lines);
    }

    public static void display(int num) {
        int mid = num / 2;

        for (int i = 0; i < num; i++) {
            int spaces, stars;

            if (i <= mid) {
                spaces = mid - i;
                stars = 2 * i + 1;
            } else {
                spaces = i - mid;
                stars = 2 * (num - i) - 1;
            }

            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
