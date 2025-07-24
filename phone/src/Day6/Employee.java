package Day6;

	public class Employee {
	    // Fields
	    String empName;
	    int empId;
	    String department;
	    int YOJ; // Year of Joining
	    double salary;

	    // Parameterized Constructor
	    public Employee(String empName, int empId, String department, int YOJ, double salary) {
	        this.empName = empName;
	        this.empId = empId;
	        this.department = department;
	        this.YOJ = YOJ;
	        this.salary = salary;
	    }

	    // Method to display employee details
	    void display() {
	        System.out.println("Employee Details:");
	        System.out.println("Name       : " + empName);
	        System.out.println("ID         : " + empId);
	        System.out.println("Department : " + department);
	        System.out.println("YOJ        : " + YOJ);
	        System.out.println("Salary     : ₹" + salary);
	    }

	    // Main method to test
	    public static void main(String[] args) {
	        // Create an employee object
	        Employee emp1 = new Employee("Suhani", 1001, "HR", 2022, 45000.00);

	        // Display employee details
	        emp1.display();
	    }
	}


