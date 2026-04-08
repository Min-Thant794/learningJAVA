package exercises;

public class Cube {
    private double side;

    public Cube () {
        side = 5;
    }

    public Cube (double side) {
        this.side = side;
    }

    public double surfaceArea () {
        return 6 * side * side;
    }

    public double volume () {
        return side * side * side;
    }

    public void display () {
        System.out.println("Side: " + side);
        System.out.println("Surface Area: " + surfaceArea());
        System.out.println("Volume: " + volume());
        System.out.println("=====================");
    }
}
