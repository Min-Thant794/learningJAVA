package exercises;

import java.util.Scanner;

public class PhoneNumberApp {
    static Scanner sc = new Scanner(System.in);

    public static void main (String[] args) {
        PhoneNumber p1 = new PhoneNumber(65, 1, 12345678);

        System.out.println("Phone number: " + p1.toString());

        System.out.println("Enter region code: ");
        int regionCode = sc.nextInt();

        System.out.println("Enter country code: ");
        int countryCode = sc.nextInt();

        System.out.println("Enter number: ");
        int number = sc.nextInt();

        PhoneNumber p2 = new PhoneNumber(countryCode, regionCode, number);
        System.out.println("Phone number: " + p2.toString());
    }
}
