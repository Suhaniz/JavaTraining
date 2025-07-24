package Day6;

public class RegistrationForm1 {
    String name;
    String email;
    String password;
    String mobile;
    String city;

    // 1. Empty Constructor
    RegistrationForm1() {
        System.out.println("Empty registration form created.");
    }

    // 2. Constructor with registration details only
    RegistrationForm1(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    // 3. Constructor with all details including optional fields
    RegistrationForm1(String name, String email, String password, String mobile, String city) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.mobile = mobile;
        this.city = city;
    }

    // Method to display registration details
    void displayDetails() {
        System.out.println("Registration Details:");
        System.out.println("Name     : " + name);
        System.out.println("Email    : " + email);
        System.out.println("Password : " + password);
        if (mobile != null && city != null) {
            System.out.println("Mobile   : " + mobile);
            System.out.println("City     : " + city);
        }
        System.out.println(); // for spacing
    }

    // Main method to test all constructors
    public static void main(String[] args) {
        // Using empty constructor
        RegistrationForm1 r1 = new RegistrationForm1();
        System.out.println();

        // Using constructor with only registration details
        RegistrationForm1 r2 = new RegistrationForm1("Suhani", "suhani@gmail.com", "pass123");
        r2.displayDetails();

        // Using constructor with all details
        RegistrationForm1 r3 = new RegistrationForm1("Amit", "amit@gmail.com", "amit@321", "9876543210", "Mumbai");
        r3.displayDetails();
    }
}

