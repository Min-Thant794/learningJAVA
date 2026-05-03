package objectOriented20Exercises;

public class Manager extends EmployeeSalary{
    private double bonus;

    Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public String getDetails() {
        return "Details\n" +
                "Name: " + getName() + "\n" +
                "Salary: " + getSalary() + "\n" +
                "Bonus: " + getBonus();
    }

    public void setBonus(double amount) {
        if (amount <= 0) {
            System.out.println("Bonus amount must be greater than 0");
        } else {
            this.bonus += amount;
            addBonusToSalary(amount);
            System.out.println("Bonus: " + getBonus() + " added!\n" + "Salary (updated): " + getSalary());
        }
    }
}
