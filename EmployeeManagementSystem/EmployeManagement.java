import java.util.*;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: $" + salary);
        System.out.println("---------------------------");
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "John Doe", 50000));
        employees.add(new Employee(102, "Jane Smith", 60000));
        employees.add(new Employee(103, "Alice Johnson", 55000));

        System.out.println("Employee Details:");
        System.out.println("==================");
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
