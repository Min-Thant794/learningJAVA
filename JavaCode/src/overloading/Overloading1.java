package overloading;

public class Overloading1 {
    public static void add(int n1, int n2) {
        System.out.println("The sum of two integers is " +(n1 + n2));
    }

    public static void add(int n1, int n2, int n3) {
        System.out.println("The sum of three integers is " +(n1 + n2 + n3));
    }

    public static void add(double n1, double n2) {
        System.out.println("The sum of two double is " + (n1 + n2));
    }

    public static void main(String[] args) {
        add(1, 2);
        add(1, 2, 3);
        add(1, 2.2);
    }
}
