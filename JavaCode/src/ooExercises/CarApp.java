package ooExercises;

import java.util.Scanner;

public class CarApp {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number of cars: ");
        int noOfCars = sc.nextInt();
        sc.nextLine();

        Car[] cars = new Car[noOfCars];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = inputCarDetails();
        }

        for (Car c : cars) {
            System.out.println(c.getCarDetails());
        }
    }

    public static Car inputCarDetails() {
        System.out.println("Car Details Form");
        String[] labels = {"Car Name: ", "Brand: "};
        String[] values = new String[labels.length];

        for (int i = 0; i < labels.length; i++) {
            System.out.print("Enter " + labels[i] + ": ");
            values[i] = sc.nextLine();
        }

        return new Car(values[0], values[1]);
    }
}
