package exercises;

import java.util.Scanner;

public class Triangle {
    private double side1, side2, base, height;
    private String color;

    Scanner sc = new Scanner(System.in);

    public Triangle (double side1, double side2, double base, double height, String color) {
        this.side1 = side1;
        this.side2 = side2;
        this.base = base;
        this.height = height;
        this.color = color;
    }

    public void setHeight (double height) {
        this.height = height;
    }

    public void setHeight () {
        System.out.print("Enter height");
        this.height = sc.nextDouble();
    }

    public double area () {
        return 0.5 * base * height;
    }

    public double perimeter () {
        return side1 + side2 + base;
    }

    public double volume (double length) {
        return area() * length;
    }

    public void display () {
        System.out.println("Side1: " + side1);
        System.out.println("Side2: " + side2);
        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
        System.out.println("Color: " + color);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
        System.out.println("---------------------------");
    }

    public String toString() {
        return "Side1: " + side1 +
                ", Side2: " + side2 +
                ", Base: " + base +
                ", Height: " + height +
                ", Color: " + color +
                ", Area: " + area() +
                ", Perimeter: " + perimeter();
    }
}
