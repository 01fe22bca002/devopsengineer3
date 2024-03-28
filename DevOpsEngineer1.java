import java.util.Date;
class DevOpsEngineer1 extends employee1 {
    private double bonus;

    public DevOpsEngineer1(int employeeId, String name, double salary, double bonus) {
        super(employeeId, name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public double calculateTotalSalary() {
        return salary + bonus;
    }

    @Override
    public void displayEmployeeDetails() {
        super.displayEmployeeDetails();

        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateTotalSalary());
    }


public class main {
    public static void Main(String[] args) {
        employee1 employee = new employee1(1, "John Doe", 50000);
        employee.displayEmployeeDetails();
        System.out.println("\n");

        DevOpsEngineer1 devOpsEngineer = new DevOpsEngineer1(2, "Jane Doe", 60000, 5000);
        devOpsEngineer.displayEmployeeDetails();
    }
}
}
