package Day1;

 import java.util.Scanner;

   public class Course_Enrollment {
	   
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter course name: ");
	        String course = sc.nextLine();

	        if (course.equalsIgnoreCase("Java")) {
	            System.out.println("Student is enrolled in the course.");
	        } else {
	            System.out.println("Student is NOT enrolled in the course.");
	        }

	        sc.close();
	    }
	}

