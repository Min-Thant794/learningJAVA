package ooExercises;

import java.util.Scanner;

public class Phone {
    public static Scanner sc = new Scanner(System.in);

    private String phNo, owner, type;
    private int bill;
    private boolean swe;
    private static int noOfPhone = 0;

    public Phone (String phNo, String owner, String type) {
        this(phNo, owner, type, 300, false);
    }

    public Phone (String phNo, String owner, String type, int bill, boolean swe) {
        this.phNo = phNo;
        this.owner = owner;
        this.type = type;
        this.bill = bill;
        this.swe = swe;
        Phone.noOfPhone++;
    }

    public String getPhNo() {
        return phNo;
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

    public int getBill() {
        return bill;
    }

    public int getNoOfPhone() {
        return noOfPhone;
    }

    public void changeOwner() {
        String answer;
        do {
            System.out.println("Change owner? YES | NO");
            answer = sc.next();
        } while (
                !answer.equalsIgnoreCase("no") && !answer.equalsIgnoreCase("yes")
        );

        if(answer.equalsIgnoreCase("yes")) {
            System.out.println("Enter new owner: ");
            String newOwner = sc.next();
            setOwner(newOwner);
        }
    }

    public void displayCustomer() {
        System.out.println("Phone number: " + getPhNo());
        System.out.println("Owner: " + getOwner());
        System.out.println("Sim card type: " + getType());
        System.out.println("Bill: " + getBill());
    }
}
