package Day20;

public class ThrowException {

    public static void main(String[] args) {
        try {
            checkAge(22); // Welcome to vote
            checkAge(12); // Exception Caught: Age is not valid
        } catch (Exception e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }

    // Method to check age
    public static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age is not Valid to Vote");
        } else {
            System.out.println("Welcome to Vote");
        }
    }
}
