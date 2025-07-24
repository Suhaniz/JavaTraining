package Day7;

public class Employee {
    // Fields (data members) – made private
    private String empName;
    private int empId;
    private double empSalary;
    private String department;

    // Constructor
    public Employee(String empName, int empId, double empSalary, String department) {
        this.empName = empName;
        this.empId = empId;
        this.empSalary = empSalary;
        this.department = department;
    }

    // Getters and Setters
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Display method
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + empName);
        System.out.println("ID: " + empId);
        System.out.println("Salary: ₹" + empSalary);
        System.out.println("Department: " + department);
    }
}

