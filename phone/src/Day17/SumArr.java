/*Question - WAJP to print the sum of elements of an array*/

package Day17;

import java.util.Scanner;

   public class SumArr {
	
       public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input size of the array
	        System.out.print("Enter number of elements: ");
	        int size = sc.nextInt();

	        int[] arr = new int[size];
	        int sum = 0;

	        // Input array elements
	        System.out.println("Enter " + size + " elements:");
	        for (int i = 0; i < size; i++) {
	            arr[i] = sc.nextInt();
	            sum += arr[i]; // Add element to sum
	        }

	        // Output the sum
	        System.out.println("Sum of array elements: " + sum);
	    }
	}

