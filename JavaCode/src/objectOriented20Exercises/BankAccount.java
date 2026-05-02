package objectOriented20Exercises;

public class BankAccount {
    final private int accountNumber;
    private String owner;
    private double balance;
    private static int accountCount = 0;

    BankAccount(int accountNumber, String owner) {
        this(accountNumber, owner, 0.0);
    }

    BankAccount(int accountNumber, String owner, double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
        BankAccount.accountCount++;
    }

    private int getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    private double getBalance() {
        return balance;
    }

    public String getAccountDetails() {
        return "Account Details\n" +
                "Account Number: " + getAccountNumber() + "\n" +
                "Account Owner: " + getOwner() + "\n" +
                "Balance: " + getBalance();
    }

    public static int getAccountCount() {
        return accountCount;
    }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            return false;
        }

        this.balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount >= balance) {
            return false;
        }

        this.balance -= amount;
        return true;
    }
}
