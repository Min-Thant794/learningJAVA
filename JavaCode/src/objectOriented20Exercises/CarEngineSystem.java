package objectOriented20Exercises;

public class CarEngineSystem {
    final private String brand;
    private double speed;
    private boolean isEngineOn;

    CarEngineSystem(String brand) {
        this.brand = brand;
        this.speed = 0.0;
        this.isEngineOn = false;
    }

    public void startEngine() {
        if (!isEngineOn) {
            isEngineOn = true;
            System.out.println("Engine started");
        } else {
            System.out.println("Engine is already ON");
        }
    }

    public void stopEngine() {
        if (isEngineOn) {
            isEngineOn = false;
            speed = 0;
            System.out.println("Engine stopped");
        } else {
            System.out.println("Engine is already OFF");
        }
    }

    public void accelerate(double value) {
        if (!isEngineOn) {
            System.out.println("Start engine first!");
        } else {
            speed += value;
            System.out.println("Current speed: " + speed);
        }
    }

    public String carDetails() {
        return "Car Details\n" +
                "Brand: " + brand + "\n" +
                "Speed: " + speed + "\n" +
                "Engine: " + (isEngineOn ? "ON" : "OFF");
    }
}