package Day1;

import java.util.Scanner;

public class Identifier_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        // Check if it's a valid identifier
        if (Character.isJavaIdentifierStart(word.charAt(0))) {
            boolean valid = true;

            for (int i = 1; i < word.length(); i++) {
                if (!Character.isJavaIdentifierPart(word.charAt(i))) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                System.out.println("Valid Java Identifier.");
            } else {
                System.out.println("Invalid Identifier: Contains invalid characters.");
            }
        } else {
            System.out.println("Invalid Identifier: Must start with a letter, $ or _.");
        }

        sc.close();
    }
}

