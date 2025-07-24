package Day7;

public class TestStudent {
	
	    public static void main(String[] args) {
	        Student s1 = new Student(); // Create Student object

	        // Set values using setters
	        s1.setName("Suhani");
	        s1.setRollNo(66);
	        s1.setCourse("Computer Science");

	        // Get values using getters and print
	        System.out.println("Student Name: " + s1.getName());
	        System.out.println("Roll Number: " + s1.getRollNo());
	        System.out.println("Course: " + s1.getCourse());
	    }
	}

