package exercises;

import java.util.Objects;
import java.util.Scanner;

public class Phone {
    static Scanner sc = new Scanner(System.in);

    private final String phoneNumber;
    private String type, owner;
    private double bill;
    private boolean swe;
    private static int noOfPhones = 0;

    // GSM bills
    private static String[] gsm1000 = {"2683785116287193", "8758271780427869", "7050169135639284", "4431707610309451", "4212818064204385", "3721226086003218", "4196319409286712"};
    private static String[] gsm3000 = {"9600895257933996", "4387895654426451", "4196319409286712", "3721226086003218", "4212818064204385", "4431707610309451", "7050169135639284"};
    private static String[] gsm5000 = {"1801179820785625", "2649972124945505", "8491896852396055", "4135304223300939", "9520102591245988", "7758865335647095", "6426882267730845"};
    private static String[] gsm10000 = {"4128814044993459", "1801179820785625", "8686810510767749", "6846203725338952", "3494599706094047", "6931110872610416", "1544458866655337"};

    // CDMA bills
    private static String[] cdma1000 = {"2683785116287193", "8758271780427869", "7050169135639284", "4431707610309451", "4212818064204385", "3721226086003218", "4196319409286712"};
    private static String[] cdma3000 = {"9600895257933996", "4387895654426451", "4196319409286712", "3721226086003218", "4212818064204385", "4431707610309451", "7050169135639284"};
    private static String[] cdma5000 = {"1801179820785625", "2649972124945505", "8491896852396055", "4135304223300939", "9520102591245988", "7758865335647095", "6426882267730845"};
    private static String[] cdma10000 = {"4128814044993459", "1801179820785625", "8686810510767749", "6846203725338952", "3494599706094047", "6931110872610416", "1544458866655337"};

    // WCDMA bills
    private static String[] wcdma1000 = {"2683785116287193", "8758271780427869", "7050169135639284", "4431707610309451", "4212818064204385", "3721226086003218", "4196319409286712"};
    private static String[] wcdma3000 = {"9600895257933996", "4387895654426451", "4196319409286712", "3721226086003218", "4212818064204385", "4431707610309451", "7050169135639284"};
    private static String[] wcdma5000 = {"1801179820785625", "2649972124945505", "8491896852396055", "4135304223300939", "9520102591245988", "7758865335647095", "6426882267730845"};
    private static String[] wcdma10000 = {"4128814044993459", "1801179820785625", "8686810510767749", "6846203725338952", "3494599706094047", "6931110872610416", "1544458866655337"};

    Phone(String phoneNumber, String owner, String type) {
        this(phoneNumber, owner, type, 300, false);
    }

    Phone(String phoneNumber, String owner, String type, double bill, boolean swe) {
        this.phoneNumber = phoneNumber;
        this.owner = owner;
        this.type = type;
        this.bill = bill;
        this.swe = swe;
        noOfPhones++;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public void sweOn() {
        this.swe = true;
    }

    public void sweOff() {
        this.swe = false;
    }

    public static int getNoOfPhone() {
        return noOfPhones;
    }

    public String userInput() {
        System.out.print("Enter pin number: ");
        return sc.next();
    }

    private boolean applyTopUp(String pin, String[] pins, int amount) {
        for (int i = 0; i < pins.length; i++) {
            if (Objects.equals(pin, pins[i])) {
                bill += amount;
                pins[i] = "";
                return true;
            }
        }
        return false;
    }

    public void topUp() {
        String answer;

        do {
            System.out.print("Top up balance? (YES | NO): ");
            answer = sc.next();

            if (answer.equalsIgnoreCase("no")) {
                break;
            }

            String simCardType;
            do {
                System.out.print("Choose sim card type (GSM | CDMA | WCDMA): ");
                simCardType = sc.next();

                if (!simCardType.equalsIgnoreCase("gsm")
                        && !simCardType.equalsIgnoreCase("cdma")
                        && !simCardType.equalsIgnoreCase("wcdma")) {
                    System.out.println("Invalid sim card type.");
                }
            } while (!simCardType.equalsIgnoreCase("gsm")
                    && !simCardType.equalsIgnoreCase("cdma")
                    && !simCardType.equalsIgnoreCase("wcdma"));

            int amount;
            do {
                System.out.print("Select amount (1000 | 3000 | 5000 | 10000): ");
                amount = sc.nextInt();

                if (amount != 1000 && amount != 3000 && amount != 5000 && amount != 10000) {
                    System.out.println("Invalid amount.");
                }
            } while (amount != 1000 && amount != 3000 && amount != 5000 && amount != 10000);

            String pin = userInput();
            boolean success = false;

            if (simCardType.equalsIgnoreCase("gsm")) {
                if (amount == 1000) success = applyTopUp(pin, gsm1000, 1000);
                else if (amount == 3000) success = applyTopUp(pin, gsm3000, 3000);
                else if (amount == 5000) success = applyTopUp(pin, gsm5000, 5000);
                else if (amount == 10000) success = applyTopUp(pin, gsm10000, 10000);
            } else if (simCardType.equalsIgnoreCase("cdma")) {
                if (amount == 1000) success = applyTopUp(pin, cdma1000, 1000);
                else if (amount == 3000) success = applyTopUp(pin, cdma3000, 3000);
                else if (amount == 5000) success = applyTopUp(pin, cdma5000, 5000);
                else if (amount == 10000) success = applyTopUp(pin, cdma10000, 10000);
            } else if (simCardType.equalsIgnoreCase("wcdma")) {
                if (amount == 1000) success = applyTopUp(pin, wcdma1000, 1000);
                else if (amount == 3000) success = applyTopUp(pin, wcdma3000, 3000);
                else if (amount == 5000) success = applyTopUp(pin, wcdma5000, 5000);
                else if (amount == 10000) success = applyTopUp(pin, wcdma10000, 10000);
            }

            if (success) {
                System.out.println("Top up successful.");
                System.out.println("New balance: " + bill);
            } else {
                System.out.println("Invalid or already used pin number.");
            }

        } while (answer.equalsIgnoreCase("yes"));
    }

    public void phoneCall(int second) {
        double minute = second / 60.0;
        double cost;

        if (swe) {
            cost = minute * 13;
        } else {
            cost = minute * 25;
        }

        if (bill < cost) {
            System.out.println("You don't have enough balance.");
            System.out.println("Please top up first.");
            topUp();
        } else {
            bill -= cost;
            System.out.println("Call Duration: " + minute + " minute(s)");
            System.out.println("Cost: " + cost);
            System.out.println("Remaining Balance: " + bill);
        }
    }

    public void display() {
        System.out.println("Phone number: " + getPhoneNumber());
        System.out.println("Owner: " + getOwner());
        System.out.println("Sim card type: " + getType());
        System.out.println("Remaining balance: " + getBill());
        System.out.println(swe ? "SWE Plan ON" : "SWE Plan OFF");
    }
}