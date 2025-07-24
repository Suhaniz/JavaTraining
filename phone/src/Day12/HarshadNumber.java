/* The correct sequence of components in a Java method declaration, specifically the main() method.

 Correct Sequence for main() Method in Java:
 Answer --> [Access Modifier] [Other Modifiers] [Return Type] [Method Name]([Parameters]) [Method Block] */

package Day12;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int sum = 0;
        int temp = num;

        // Calculate sum of digits
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        // Check Harshad condition
        if (num % sum == 0) {
            System.out.println(num + " is a Harshad number.");
        } else {
            System.out.println(num + " is NOT a Harshad number.");
        }
    }
}
