package ooExercises;

public class Student {
    final private int id;
    final private String name;
    private double gpa;
    private static int noOfStudent = 0;

    Student(int id, String name) {
        this(id, name, 0.0);
    }

    Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        setGpa(gpa);
        Student.noOfStudent++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public static int getNoOfStudent() {
        return noOfStudent;
    }

    public void setGpa(double gpa) {
        if (gpa < 0.0) {
            System.out.println("GPA must be higher than 0");
        } else if (gpa > 4.0) {
            System.out.println("GPA must be lower than 4.0");
        } else {
            this.gpa = gpa;
        }
    }

    public String getDetails() {
        return "Student details:\n" +
                "Student ID: " + id + "\n" +
                "Name: " + name + "\n" +
                "GPA: " + gpa + "\n";
    }
}
