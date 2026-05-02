package objectOriented20Exercises;

public class StudentClass {
    private int id;
    private String name;
    private double gpa;

    StudentClass(int id, String name) {
        this(id, name, 0);
    }

    StudentClass(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        setGpa(gpa);
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setGpa(double gpa) {
        if (gpa < 0 || gpa > 4.0) {
            System.out.println("GPA must between 0 and 4.0");
        } else {
            this.gpa = gpa;
        }
    }

    //getters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public String getDetails() {
        return "Student Details\n" +
                "Student ID: " + getId() + "\n" +
                "Student name: " + getName() + "\n" +
                "Student GPA: " + getGpa();
    }
}
