package Day18;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert to lowercase to simplify checking
        input = input.toLowerCase();

        int vowelCount = 0;

        // Loop through each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        // Output the result
        System.out.println("Number of vowels: " + vowelCount);

        sc.close();
    }
}

