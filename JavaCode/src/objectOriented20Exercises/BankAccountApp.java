package objectOriented20Exercises;

import java.util.Scanner;

public class BankAccountApp {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        BankAccount owner1 = new BankAccount(1, "Owner 1");
        BankAccount owner2 = new BankAccount(2, "Owner 2", 1000);

        manageAccount(owner1);
        manageAccount(owner2);
    }

    public static void manageAccount(BankAccount bank) {
        int choice;
        System.out.println("Total Bank Account: " + BankAccount.getAccountCount());
        System.out.println("Welcome: " + bank.getOwner() + "!");
        do {
            System.out.println("[1: Account Details, 2: Deposit, 3: Withdraw, 4: Exit]");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.println(bank.getAccountDetails());
            } else if (choice == 2) {
                double amount;
                System.out.println("Enter deposit amount: ");
                amount = sc.nextDouble();
                boolean depositSuccess = bank.deposit(amount);


                System.out.println(depositSuccess ? "Successfully deposit!" : "Deposit amount must be greater than zero!");
            } else if (choice == 3) {
                double amount;
                System.out.println("Enter withdraw amount: ");
                amount = sc.nextDouble();
                boolean withdrawSuccess = bank.withdraw(amount);

                System.out.println(withdrawSuccess ? "Successfully withdraw!" : "Withdraw amount does not exceed current balance!");
            } else if (choice == 4) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid input");
            }
        } while (choice != 4);
    }
}
