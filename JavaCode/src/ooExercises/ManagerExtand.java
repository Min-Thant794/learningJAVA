package ooExercises;

public class ManagerExtand extends EmployeeSalary {
    private int bonus;

    public ManagerExtand(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public String employeeDetails() {
        return "Manager Details\n" +
                "Name: " + name +  "\n" +
                "Salary: " + salary + "\n" +
                "Bonus: " + bonus;
    }
}
