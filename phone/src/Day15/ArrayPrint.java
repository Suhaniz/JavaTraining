/* Question - WAJP  to access elements of an array that print them */

package Day15;

import java.util.Scanner;

public class ArrayPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take size of array
        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();

        // Declare array
        int[] arr = new int[size];

        // Take input from user
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Print elements
        System.out.println("Array elements are:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
    }
}
