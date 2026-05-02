package ooExercises;

public class Car {
    private String carName, brand;
    private boolean isEngineOn;
    private double speed;
    private static int noOfCars = 0;

    Car(String carName, String brand) {
        this(carName, brand, false, 0.0);
    }

    Car(String carName, String brand, boolean isEngineOn, double speed) {
        this.carName = carName;
        this.brand = brand;
        this.isEngineOn = isEngineOn;
        this.speed = speed;
        Car.noOfCars++;
    }

    //GETTERS
    public String getCarName() {
        return carName;
    }

    public String getBrand() {
        return brand;
    }

    //SETTERS
    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    //Methods

    public boolean startEngine() {
        return this.isEngineOn = true;
    }

    public boolean stopEngine() {
        return this.isEngineOn = false;
    }

    public String getCarDetails() {
        return "Car Name: " + carName + "\n" +
                "Brand: " + brand + "\n" +
                "isEngineOn: " + isEngineOn + "\n" +
                "Speed" + speed;
    }
}
