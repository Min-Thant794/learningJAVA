package objectOriented20Exercises;

import java.util.Scanner;

public class CarEngineSystemApp {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        CarEngineSystem car = new CarEngineSystem("Toyota");
        manageCar(car);
    }

    public static void manageCar(CarEngineSystem car) {
        int choice;

        do {
            System.out.println("\n[1: Details, 2: Start Engine, 3: Stop Engine, 4: Accelerate, 5: Exit]");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(car.carDetails());
                    break;

                case 2:
                    car.startEngine();
                    break;

                case 3:
                    car.stopEngine();
                    break;

                case 4:
                    System.out.print("Enter speed to increase: ");
                    double speed = sc.nextDouble();
                    car.accelerate(speed);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);
    }
}