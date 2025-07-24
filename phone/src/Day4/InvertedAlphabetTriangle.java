package Day4;

public class InvertedAlphabetTriangle {
    public static void main(String[] args) {
        int rows = 5;
        char ch = 'A'; // Initialize character once

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " "); // Use print instead of println
                ch++; // Increment character
            }
            System.out.println(); // Move to next line after each row
        }
    }
}