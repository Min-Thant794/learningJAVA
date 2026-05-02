package ooExercises;

public class BankAccountApp {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(1, "Michael");
        System.out.println(b1.getDetails());
        System.out.println("Balance: " + b1.getBalance());
        b1.action();

        int numberOfAccount = BankAccount.getNoOfBankAcc();
        System.out.println("Number of bank account: " + numberOfAccount);
    }
}
