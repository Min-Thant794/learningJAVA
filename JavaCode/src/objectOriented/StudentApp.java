package objectOriented;

public class StudentApp {
    public static void main (String[] args) {
        Student s1 = new Student(1, "Aung Aung");
        System.out.println("Roll number: " + s1.getRollNumber());
        System.out.println("Student name: " + s1.getName());
        System.out.println("Major: " + s1.getMajor());
        System.out.println("Year: " + s1.getYear());

        Student s2 = new Student(2, "Mg Mg" + "Civil" + 3);
        System.out.println("Roll number: " + s2.getRollNumber());
        System.out.println("Student name: " + s2.getName());
        System.out.println("Major: " + s2.getMajor());
        System.out.println("Year: " + s2.getYear());

        Student s3 = new Student(3, "Ma Ma" + "Computer Science" + 2);
        System.out.println("Roll number: " + s3.getRollNumber());
        System.out.println("Student name: " + s3.getName());
        System.out.println("Major: " + s3.getMajor());
        System.out.println("Year" + s3.getYear());

        System.out.println("\nAfter 1 year later");
        s1.setYear(2);
        s1.setMajor("Computer Science");
        System.out.println("Roll number: " + s1.getRollNumber());
        System.out.println("Student name: " + s1.getName());
        System.out.println("Major: " + s1.getMajor());
        System.out.println("Year: " + s1.getYear());
    }
}
