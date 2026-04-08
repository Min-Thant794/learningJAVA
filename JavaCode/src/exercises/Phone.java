package exercises;

public class Phone {
    private final String phoneNumber;
    private String type, owner;
    private int bill;
    boolean swe;
    private static int noOfPhones =  0;

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

    public void phoneCall (int second) {
        double minute = second / 60.0;
        double cost;

        if (swe) {
            cost = minute * 13;
        } else {
            cost = minute * 25;
        }

        bill -= (int) cost;

        System.out.println("Call Duration: " + minute);
        System.out.println("Cost: " + cost);
        System.out.println("Remaining Balance: " + getBill());
    }

    public void display () {
        System.out.println("Phone number: " + getPhoneNumber());
        System.out.println("Owner: " + getOwner());
        System.out.println("Remaining balance: " + getBill());
        System.out.println(swe ? "SWE Plan ON" : "SWE Plan OFF");
    }
}