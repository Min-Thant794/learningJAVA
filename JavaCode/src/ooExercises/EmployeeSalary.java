package ooExercises;

public class EmployeeSalary {
    protected String name;
    protected int salary;
    private static int employeeCount = 0;

    EmployeeSalary(String name, int salary) {
        this.name = name;
        this.salary = salary;
        employeeCount++;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void increaseSalary(int percent) {
        double increasedSalary = salary * (percent / 100.0);
        this.salary += (int)increasedSalary;
        System.out.println("Salary increased!" + "\n" + employeeDetails());
    }

    public String employeeDetails() {
        return "Employee Details" + "\n" +
                "Name: " + name + "\n" +
                "Salary: " + salary;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }
}
