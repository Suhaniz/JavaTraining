package Day4;

public class AlphabetTriangle {
    public static void main(String[] args) {
        int rows = 4;

        for (int i = 1; i <= rows; i++) {
            char ch = 'A'; // Initialize a character for each row
            
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " "); // Use print, not println
                ch++; // Increment character
            }

            System.out.println(); // Move to next line after each row
        }
    }
}

