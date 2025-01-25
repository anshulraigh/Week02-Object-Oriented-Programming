package employeemanagement;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list to store employees
        List<Employee> employees = new ArrayList<>();

        // Add FullTimeEmployee
        FullTimeEmployee fte = new FullTimeEmployee(101, "John Doe", 50000, 10000);
        fte.assignDepartment("Engineering");
        employees.add(fte);

        // Add PartTimeEmployee
        PartTimeEmployee pte = new PartTimeEmployee(102, "Jane Smith", 200, 25);
        pte.assignDepartment("Support");
        employees.add(pte);

        // Process employees using polymorphism
        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println("Salary: " + employee.calculateSalary());
            if (employee instanceof Department) {
                System.out.println(((Department) employee).getDepartmentDetails());
            }
            System.out.println("-------------------------");
        }
    }
}
