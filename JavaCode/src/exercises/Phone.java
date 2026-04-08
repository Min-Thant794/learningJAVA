package exercises;

import java.util.Scanner;

public class Phone {
    static Scanner sc = new Scanner(System.in);

    private final String phoneNumber;
    private String type, owner;
    private int bill;
    boolean swe;
    private static int noOfPhones =  0;

    //GSM bills
    private static String[] gsm1000 = {"2683785116287193", "8758271780427869", "7050169135639284", "4431707610309451", "4212818064204385", "3721226086003218", "4196319409286712"};
    private static String[] gsm3000 = {"9600895257933996", "4387895654426451", "4196319409286712", "3721226086003218", "4212818064204385", "4431707610309451", "7050169135639284"};
    private static String[] gsm5000 = {"1801179820785625", "2649972124945505", "8491896852396055", "4135304223300939", "9520102591245988", "7758865335647095", "6426882267730845"};
    private static String[] gsm10000 = {"4128814044993459", "1801179820785625", "8686810510767749", "6846203725338952", "3494599706094047", "6931110872610416", "1544458866655337"};

    //CDMA bills
    private static String[] cdma1000 = {"2683785116287193", "8758271780427869", "7050169135639284", "4431707610309451", "4212818064204385", "3721226086003218", "4196319409286712"};
    private static String[] cdma3000 = {"9600895257933996", "4387895654426451", "4196319409286712", "3721226086003218", "4212818064204385", "4431707610309451", "7050169135639284"};
    private static String[] cdma5000 = {"1801179820785625", "2649972124945505", "8491896852396055", "4135304223300939", "9520102591245988", "7758865335647095", "6426882267730845"};
    private static String[] cdma10000 = {"4128814044993459", "1801179820785625", "8686810510767749", "6846203725338952", "3494599706094047", "6931110872610416", "1544458866655337"};

    //WCDMA bills
    private static String[] wcdma1000 = {"2683785116287193", "8758271780427869", "7050169135639284", "4431707610309451", "4212818064204385", "3721226086003218", "4196319409286712"};
    private static String[] wcdma3000 = {"9600895257933996", "4387895654426451", "4196319409286712", "3721226086003218", "4212818064204385", "4431707610309451", "7050169135639284"};
    private static String[] wcdma5000 = {"1801179820785625", "2649972124945505", "8491896852396055", "4135304223300939", "9520102591245988", "7758865335647095", "6426882267730845"};
    private static String[] wcdma10000 = {"4128814044993459", "1801179820785625", "8686810510767749", "6846203725338952", "3494599706094047", "6931110872610416", "1544458866655337"};

    Phone (String phoneNumber, String owner, String type) {
        this (phoneNumber, owner, type, 300, false);
    }

    Phone (String phoneNumber, String owner, String type, int bill, boolean swe) {
        this.phoneNumber = phoneNumber;
        this.owner = owner;
        this.type = type;
        this.bill = bill;
        this.swe = swe;
        noOfPhones++;
    }

    public String getPhoneNumber () {
        return phoneNumber;
    }

    public String getOwner () {
        return owner;
    }

    public void setOwner (String owner) {
        this.owner = owner;
    }

    public String getType () {
        return type;
    }

    public void setType (String type) {
        this.type = type;
    }

    public int getBill () {
        return bill;
    }

    public void sweOn (boolean swe) {
        this.swe = true;
    }

    public void sweOff (boolean swe) {
        this.swe = false;
    }

    public static int getNoOfPhone () {
        return noOfPhones;
    }

    public int userInput () {
        return sc.nextInt();
    }

    public int fillBill () {
        int pin = userInput();
        int bill;

    }

    public void phoneCall (int second) {
        double minute = second / 60.0;
        double cost;

        if (swe) {
            cost = minute * 13;
        } else {
            cost = minute * 25;
        }

        if (bill < cost) {
            System.out.println("You don't have enough balance");
            System.out.println("Enter pin: " + userInput());
        } else {
            bill -= (int) cost;

            System.out.println("Call Duration: " + minute);
            System.out.println("Cost: " + cost);
            System.out.println("Remaining Balance: " + getBill());
        }
    }

    public void display () {
        System.out.println("Phone number: " + getPhoneNumber());
        System.out.println("Owner: " + getOwner());
        System.out.println("Sim card type: " + getType());
        System.out.println("Remaining balance: " + getBill());
        System.out.println(swe ? "SWE Plan ON" : "SWE Plan OFF");
    }
}