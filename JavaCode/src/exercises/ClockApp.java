package exercises;

public class ClockApp {

    public static void main(String[] args) {

        Clock c1 = new Clock(23, 45, 3);

        System.out.println("Mode 1:");
        c1.displayTime(1);

        System.out.println("Mode 2:");
        c1.displayTime(2);
    }
}