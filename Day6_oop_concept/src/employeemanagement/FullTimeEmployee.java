package employeemanagement;

public class FullTimeEmployee extends Employee implements Department {
    private String departmentName;
    private double bonus;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double bonus) {
        super(employeeId, name, baseSalary);
        this.bonus = bonus;
    }

    // Implement abstract method
    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }

    // Implement Department interface methods
    @Override
    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + departmentName;
    }
}
