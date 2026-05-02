package ooExercises;

public class StudentApp {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Daniel", 10.0);
        Student s2 = new Student(2, "Lunar", 2.5);
        Student s3 = new Student(3, "Mike");

        System.out.println(s1.getDetails());

        s1.setGpa(3.1);
        System.out.println(s1.getDetails());

        System.out.println(s2.getDetails());
        System.out.println(s3.getDetails());

        System.out.println("Total students: " + Student.getNoOfStudent());
    }
}
