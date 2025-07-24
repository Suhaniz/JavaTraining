package Day18;

import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Counters
        int letters = 0, digits = 0, specialChars = 0;

        // Loop through each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {
                letters++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (!Character.isWhitespace(ch)) {
                specialChars++;
            }
        }

        // Output
        System.out.println("Alphabets: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + specialChars);

        sc.close();
    }
}
