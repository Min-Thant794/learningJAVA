package exercises;

import static exercises.NestedLoopExercise1.getLines;

public class NestedLoopExercise13 {
    public static void main(String[] args)
    {
        int lines = getLines();
        display(lines);
    }

    public static void display(int num)
    {
        int mid = num /2;

        for (int i = 0; i < num; i++) {
            if(i <= mid) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int k = 0; k < num - i; k++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
