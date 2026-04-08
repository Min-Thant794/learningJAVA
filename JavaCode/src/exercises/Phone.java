package exercises;

public class Phone {
    private String phoneNumber, owner, type;
    private double bill;
    private boolean swe;
    private static int noOfPhone;

    public Phone(String phoneNumber, String owner, String type) {
        this(phoneNumber, owner, type, 300, false);
    }

    public Phone(String phoneNumber, String owner, String type, double bill, boolean swe) {
        this.phoneNumber = phoneNumber;
        this.owner = owner;
        this.type = type;
        this.bill = bill;
        this.swe = swe;
        noOfPhone++;
    }

    public void sweOn() {
        this.swe = true;
    }

    public void sweOff() {
        this.swe = false;
    }

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public static int getNoOfPhone() {
        return noOfPhone;
    }

    public void phoneCall(int second) {
        double min = second / 60.0;
        double cost;

        if (swe) {
            cost = min * 13;
        } else {
            cost = min * 25;
        }

        bill -= cost;

        System.out.println("Call duration: " + min + " minutes");
        System.out.println("Call cost: " + cost);
        System.out.println("Remaining balance: " + bill);
    }

    public void display() {
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Owner: " + getOwner());
        System.out.println("Type: " + getType());
        System.out.println("Bill: " + getBill());
        System.out.println(swe ? "SWE Plan ON" : "SWE Plan OFF");
    }
}