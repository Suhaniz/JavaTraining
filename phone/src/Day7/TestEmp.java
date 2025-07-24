package Day7;

public class TestEmp {
    public static void main(String[] args) {
        // Create Employee object using constructor
        Employee emp1 = new Employee("Suhani", 101, 50000.0, "HR");

        // Use setter (optional)
        emp1.setEmpSalary(55000.0);  // updating salary

        // Display Employee info
        emp1.displayDetails();
    }
}

