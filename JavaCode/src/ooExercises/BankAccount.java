package ooExercises;

import java.util.Scanner;

public class BankAccount {
    public static Scanner sc = new Scanner(System.in);

    final private int accountNumber;
    final private String owner;
    private double balance;
    public static int noOfBankAcc = 0;

    BankAccount(int accountNumber, String owner) {
        this(accountNumber, owner, 0.0);
    }

    BankAccount(int accountNumber, String owner, double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
        BankAccount.noOfBankAcc++;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public String getDetails () {
        return "Account Details: " + "\n" +
                "Account Number: " + accountNumber + "\n" +
                "Account Owner: " + owner + "\n" +
                "Balance: " + balance;
    }

    public void action() {
        int actionNumber;
        do {
            System.out.println("Choose Action: [1: Deposit, 2: Withdraw, 3: Check current balance, 4: Exit]");
            actionNumber = sc.nextInt();
            if(actionNumber == 1) {
                System.out.println("Enter deposit amount: ");
                double amount = sc.nextDouble();
                deposit(amount);
            } else if (actionNumber == 2) {
                System.out.println("Enter withdraw amount: ");
                double amount = sc.nextDouble();
                withdraw(amount);
            } else if (actionNumber == 3) {
                double currentBalance = getBalance();
                System.out.println("Current balance: " + currentBalance);
            } else if (actionNumber == 4) {
                System.out.println("Existing...");
            } else {
                System.out.println("Invalid choice. Try again");
            }
        } while (actionNumber != 4);
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Deposit amount must be greater than 0");
        } else {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount < 0 || amount > balance) {
            System.out.println("Withdraw amount must between 0 and current balance");
        } else {
            this.balance -= amount;
        }
    }

    public static int getNoOfBankAcc() {
        return noOfBankAcc;
    }
}
