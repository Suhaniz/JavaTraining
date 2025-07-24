package Day18;

import java.util.Scanner;

public class ReverseStringManual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String reversed = "";

        // Loop from the end of the string to the beginning
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Output the reversed string
        System.out.println("Reversed string: " + reversed);

        sc.close();
    }
}

