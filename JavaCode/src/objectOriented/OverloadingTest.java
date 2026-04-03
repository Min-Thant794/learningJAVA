package objectOriented;

public class OverloadingTest {

    public static void sum (int x, int y) {
        System.out.println("The sum of two integers is: " + (x + y));
    }

    public static void sum (double x, double z) {
        System.out.println("The sum of two doubles is: " + (x + z));
    }
    public static void main(String[] args) {
        sum(3, 4.0);
    }
}
