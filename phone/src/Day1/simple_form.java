package Day1;

 import java.util.Scanner;

   public class simple_form {
	  
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your roll number: ");
        String rollNo = sc.nextLine();

        System.out.print("Enter your phone number: ");
        String phone = sc.nextLine();

        System.out.print("Enter your interested course: ");
        String course = sc.nextLine();

        System.out.print("Enter your gender (Male/Female/Other): ");
        String gender = sc.nextLine();

        // Displaying the data
        System.out.println("\n--- Submitted Information ---");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Phone No   : " + phone);
        System.out.println("Course     : " + course);
        System.out.println("Gender     : " + gender);

        sc.close();
    }
}
