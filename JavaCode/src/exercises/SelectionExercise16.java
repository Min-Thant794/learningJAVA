package exercises;
import java.util.*;

public class SelectionExercise16 {
    public static void main(String args[]) {

        double x1, y1, r1, x2, y2, r2;
        double distance;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter circle1's center x-, y-coordinates, and radius:");
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        r1 = sc.nextDouble();

        System.out.println("Enter circle2's center x-, y-coordinates, and radius:");
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        r2 = sc.nextDouble();

        distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        if (distance + r2 <= r1) {
            System.out.println("circle2 is inside circle1");
        }
        else if (distance < r1 + r2) {
            System.out.println("circle2 overlaps circle1");
        }
        else {
            System.out.println("circle2 does not overlap circle1");
        }
    }
}
