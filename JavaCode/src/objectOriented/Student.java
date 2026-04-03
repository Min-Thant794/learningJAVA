package objectOriented;

public class Student {
    private int rollNumber, year;
    private String name, major;

    public Student (int rollNumber, String name) {
        this(rollNumber, 1, name, "CST");
    }

    public Student (int rollNumber, int year, String name, String major) {
        this.rollNumber = rollNumber;
        this.year = year;
        this.name = name;
        this.major = major;
    }

    public int getRollNumber () {
        return rollNumber;
    }

    public void setRollNumber (int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getYear () {
        return year;
    }

    public void setYear (int year) {
        this.year = year;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getMajor () {
        return major;
    }

    public void setMajor (String major) {
        this.major = major;
    }
}
