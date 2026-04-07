package objectOriented;

public class ExpressCarGroup {
    private String type;
    private int carNo, numberOfPassengers;
    private static int totalCars = 0;

    public ExpressCarGroup(int carNo, String type, int numberOfPassengers) {
        this.carNo = carNo;
        this.type = type;
        this.numberOfPassengers = numberOfPassengers;
        totalCars++;
    }

    public String getType () {
        return type;
    }

    public void setType (String type) {
        this.type = type;
    }

    public int getCarNo () {
        return carNo;
    }

    public void setCarNo (int carNo) {
        this.carNo = carNo;
    }

    public int getNumberOfPassengers () {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers (int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public static int getTotalCars() {
        return totalCars;
    }

    public void display() {
        System.out.println(type + "\t" + carNo + "\t" + numberOfPassengers);
    }
}
