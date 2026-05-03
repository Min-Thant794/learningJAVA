package objectOriented20Exercises;

import java.util.Scanner;

public class CompanyApp {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        EmployeeSalary e1 = new EmployeeSalary("Jack", 1000.0);
        manageDetails(e1);

        Manager m1 = new Manager("YeeHa!", 1200.0, 0.0);
        manageDetails(m1);
    }

    public static void manageDetails(EmployeeSalary e) {
        System.out.println("Welcome " + e.getName() + "!");
        int choice;

        do {
            System.out.println("[1: User Details, 2: Increase Salary, 3: Exit]");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                int c;
                do {
                    System.out.println("[1: Full Details, 2: Name, 3: Current Salary, 4: Back]");
                    c = sc.nextInt();
                    sc.nextLine();

                    if (c == 1) {
                        System.out.println(e.getDetails());
                    } else if (c == 2) {
                        System.out.println("Name: " + e.getName());
                    } else if (c == 3) {
                        System.out.println("Current Salary: " + e.getSalary());
                    } else if (c == 4) {
                        System.out.println("Back to main page...");
                    } else {
                        System.out.println("Invalid input. Try again...");
                    }
                } while (c != 4);
            } else if (choice == 2) {
                int c;
                double percent;
                do {
                    System.out.println("[1: Increase Salary (Percent), 2: Give Bonus, 3: Cancel]");
                    c = sc.nextInt();
                    sc.nextLine();

                    if (c == 1) {
                        System.out.println("Input increase salary");
                        percent = sc.nextDouble();
                        if (percent <= 0) {
                            System.out.println("Input value should be greater than 0.");
                        } else {
                            e.increaseSalary(percent);
                        }
                    } else if (c == 2) {
                        double amount;
                        if (e instanceof Manager m) {
                            System.out.println("Bonus amount: ");
                            amount = sc.nextDouble();
                            m.setBonus(amount);
                        } else {
                            System.out.println("Only managers can receive bonus.");
                        }
                    } else if (c == 3) {
                        System.out.println("Back to main page...");
                } else {
                        System.out.println("Invalid input. Try again...");
                    }
                } while (c != 3);
            } else if (choice == 3) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid input. Try again...");
            }
        } while (choice != 3);
    }
}
