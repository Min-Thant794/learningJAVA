package exercises;

public class NestedLoopExercise21 {
    public static void main(String[] args) {
        display();
    }

    public static void display() {

        // top half of heart
        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= 3 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // bottom half
        for (int i = 5; i >= 1; i--) {

            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
