package exercises;

public class Phone {
    private String phoneNumber, owner, type;
    private int bill;
    private boolean swe;
    private static int noOfPhone;

    public Phone (String phoneNumber, String owner, String type) {
        this(phoneNumber, owner, type, 300, false);
    }

    public Phone (String phoneNumber, String owner, String type, int bill, boolean swe) {
        this.phoneNumber = phoneNumber;
        this.owner = owner;
        this.type = type;
        this.bill = bill;
        this.swe = swe;
        noOfPhone++;
    }

    public void sweOn(boolean swe) {
        this.swe = swe;
    }

    public void sweOff(boolean swe) {
        this.swe = swe;
    }

    public int getBill() {
        return bill;
    }

    public void setBill (int bill) {
        this.bill = bill;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber (String PhoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public static int getNoOfPhone () {
        return noOfPhone;
    }

    public void phoneCall (int second) {
        double min = second / 60.0;
        double balance;

        if (swe) {
            balance = min / 13;
            System.out.println("You have " + min + " minutes left and your remaining balance is: " + (getBill() - balance));
        } else {
            balance = min / 25;
            System.out.println("You have " + min + " minutes left and your remaining balance is: " + (getBill() - balance));
        }
    }

    public void display () {
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Owner: " + getOwner());
        System.out.println("Type: " + getType());
        System.out.println("Bill: " + getBill());
        if (swe) {
            System.out.println("SWE Plan ON");
        } else {
            System.out.println("SWE Plan OFF");
        }
    }
}
