import java.util.Date;

 class Employee {
    private int employeeId;
    private String name;
    public double salary;

    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("\n Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary+"\n");
    }
}
