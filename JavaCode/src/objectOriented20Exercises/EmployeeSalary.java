package objectOriented20Exercises;

public class EmployeeSalary {
    private String name;
    private double salary;

    EmployeeSalary(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDetails() {
        return "Details\n" +
                "Name: " + getName() + "\n" +
                "Salary: " + getSalary();
    }

    public void increaseSalary(double percent) {
        double amount = (percent / 100) * salary;
        this.salary += amount;
        System.out.println("Salary increased!\n" + "Current salary: " + salary);
    }

    public void addBonusToSalary(double amount) {
        this.salary += amount;
    }
}
