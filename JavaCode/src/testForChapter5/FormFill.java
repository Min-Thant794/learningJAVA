package testForChapter5;

public class FormFill {
    public static void main (String[] args) {
        Graduate g1 = new Graduate("Ma Ma");
        System.out.println("Name: " + g1.getName());
        System.out.println("Job: " + g1.getJobTitle());
        System.out.println("Salary: " + g1.getSalary());

        Graduate g2 = new Graduate("Aye Aye", "Programmer", 300000);
        System.out.println("\nName: " + g2.getName());
        System.out.println("Job: " + g2.getJobTitle());
        System.out.println("Salary: " + g2.getSalary());

        System.out.println("\nAfter received a job");
        g1.setJobTitle("Trainer");
        g1.setSalary(80000);
        System.out.println("Name: " + g1.getName());
        System.out.println("Job: " + g1.getJobTitle());
        System.out.printf("Salary: " + g1.getSalary());

        System.out.println("\nAfter received bonus");
        g2.setSalary(350000);
        System.out.println("Name: " + g2.getName());
        System.out.println("JobTitle: " + g2.getJobTitle());
        System.out.println("Salary: " + g2.getSalary());
    }
}
