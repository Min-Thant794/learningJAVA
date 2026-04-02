package exercises;

public class RecursionExercise1 {
    public static void main(String[] args) {
        happyNewYear(5);
    }

    public static void happyNewYear(int sec) {
        if (sec == 0) {
            System.out.println("Happy new year!");
            return;
        }

        System.out.println(sec);
        happyNewYear(sec - 1);
    }
}
