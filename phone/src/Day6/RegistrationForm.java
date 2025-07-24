package Day6;

import java.util.Scanner;

public class RegistrationForm {
    String username;
    String email;
    String mobile_no;
    String password;

    // Constructor
    RegistrationForm(String username, String email, String mobile_no, String password) {
        this.username = username;
        this.email = email;
        this.mobile_no = mobile_no;
        this.password = password;
    }

    void display() {
        System.out.println("\nRegistration Successful!");
        System.out.println("Name: " + username);
        System.out.println("Email: " + email);
        System.out.println("Mobile No: " + mobile_no);
        // For security, we usually don't display password
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String username = sc.nextLine();

        System.out.print("Enter your email: ");
        String email = sc.nextLine();

        System.out.print("Enter your mobile number: ");
        String mobile = sc.nextLine();

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        // Create object with input data
        RegistrationForm user = new RegistrationForm(username, email, mobile, password);
        user.display();

        sc.close();
    }
}