package exercises;
import static exercises.NestedLoopExercise1.getLines;

public class NestedLoopExercise14 {
    public static void main(String[] args)
    {
        int lines = getLines();
        display(lines);
    }

    public static void display(int num) {
        int mid = num / 2;

        for (int i = 0; i < num; i++) {

            if(i < mid) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }

                for(int k = 0; k < num - 2*(i + 1); k++) {
                    System.out.print(" ");
                }

                for (int l = 0; l <= i; l++) {
                    System.out.print("*");
                }
            } else if (i == mid) {
                for (int m = 0; m < num; m++) {
                    System.out.print("*");
                }
            } else {
                for(int j = 0; j < num - i; j++) {
                    System.out.print("*");
                }
                for(int s = 0; s < 2*(i - mid) - 1; s++) {
                    System.out.print(" ");
                }
                for(int j = 0; j < num - i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
