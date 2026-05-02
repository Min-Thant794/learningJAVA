package ooExercises;

import java.util.Scanner;

public class EmployeeSalaryApp {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        EmployeeSalary e1 = new EmployeeSalary("Johnnathan", 2000);
        System.out.println(e1.employeeDetails());

        increaseSalary(e1);

        ManagerExtand m1 = new ManagerExtand("Mike", 3000, 500);
        increaseSalary(m1);
    }

    public static void increaseSalary(EmployeeSalary e) {
        int choice;
        do {
            System.out.println("[1: Increase salary, 2: Number of employees,3: Exit]");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                int percentage;
                do {
                    System.out.println("Enter increase salary amount (Percentage): ");
                    percentage = sc.nextInt();
                    if (percentage < 0) {
                        System.out.println("Percentage must be positive number");
                    } else {
                        e.increaseSalary(percentage);
                    }
                } while (percentage < 0);
            } else if (choice == 2) {
                System.out.println("Number of employee: " + EmployeeSalary.getEmployeeCount());
            } else if (choice == 3) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid selection!");
            }
        } while (choice != 3);
    }
}
