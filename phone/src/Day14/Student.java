package Day14;

	// Student.java
	public class Student extends Person {
	    int rollNo;
	    String course;

	    // Constructor of Student using super()
	    public Student(String name, int age, int rollNo, String course) {
	        super(name, age); // Calls Person's constructor
	        this.rollNo = rollNo;
	        this.course = course;
	    }

	    // Display method
	    public void display() {
	        super.display(); // call display() of Person
	        System.out.println("Roll No : " + rollNo);
	        System.out.println("Course  : " + course);
	    }
	}
