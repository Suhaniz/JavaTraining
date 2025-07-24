package Day18;

import java.util.Scanner;

public class ManualCaseConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String upper = "";
        String lower = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Convert to uppercase manually
            if (ch >= 'a' && ch <= 'z') {
                upper += (char)(ch - 32);
            } else {
                upper += ch;
            }

            // Convert to lowercase manually
            if (ch >= 'A' && ch <= 'Z') {
                lower += (char)(ch + 32);
            } else {
                lower += ch;
            }
        }

        // Output
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);

        sc.close();
    }
}

