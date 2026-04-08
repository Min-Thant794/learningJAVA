package exercises;

import java.util.Scanner;

public class PhoneApp {
    static Scanner sc = new Scanner(System.in);

    public static void main (String[] args) {
        Phone p1 = new Phone("09785809883", "Min Thant Tun", "GSM");
        Phone p2 = new Phone("85025446", "Timmy", "CDMA");

        int second;
        System.out.print("Enter second: ");
        second = sc.nextInt();
        p1.phoneCall(second);

        p1.display();
        p2.display();

        System.out.println("Number of phone numbers: " + Phone.getNoOfPhone());
    }
}
