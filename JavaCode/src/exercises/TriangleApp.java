package exercises;

public class TriangleApp {
    public static void main (String[] args) {
        Triangle[] triangles = new Triangle[5];

        triangles[0] = new Triangle(3,4,5,6,"Red");
        triangles[1] = new Triangle(5,6,7,8,"Blue");
        triangles[2] = new Triangle(6,7,8,9,"Green");
        triangles[3] = new Triangle(4,5,6,7,"Yellow");
        triangles[4] = new Triangle(7,8,9,10,"Black");
        for (int i = 0; i < triangles.length; i++) {
            System.out.println("Triangle " + (i + 1));
            triangles[i].display();
        }
    }
}
