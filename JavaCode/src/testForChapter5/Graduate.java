package testForChapter5;

public class Graduate {
    private String name, jobTitle;
    private int salary;

    public Graduate(String n) { //one argument constructor
        this(n, "Jobless", 0); //3 argument constructor
    }

    public Graduate(String name, String jobTitle, int salary) {// 3 argument constructor
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getJobTitle () {
        return jobTitle;
    }

    public void setJobTitle (String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getSalary () {
        return salary;
    }

    public void setSalary (int salary) {
        this.salary = salary;
    }
}