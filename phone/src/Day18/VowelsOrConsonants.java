package Day18;

import java.util.Scanner;

public class VowelsOrConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user 
        System.out.println("Enter a String:");
        String input = scanner.nextLine().toLowerCase();

        int vowels = 0, consonants = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if character is a letter 
            if (Character.isLetter(ch)) {
                // Check for vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}