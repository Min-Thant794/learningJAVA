package objectOriented;

public class ExpressCarGroupApp {
    public static void main (String[] args) {
        ExpressCarGroup car1 = new ExpressCarGroup(1, "Express", 40);
        car1.display();

        ExpressCarGroup car2 = new ExpressCarGroup(2, "Luxury", 20);
        car2.display();

        System.out.println("Total cars: " + ExpressCarGroup.getTotalCars());
    }
}
