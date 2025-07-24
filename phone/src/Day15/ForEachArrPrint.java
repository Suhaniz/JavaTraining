/*Question - WAJP to print elements of an array using for each loop*/

package Day15;

import java.util.Scanner;

public class ForEachArrPrint {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Take size of the array
	        System.out.print("Enter the number of elements: ");
	        int size = sc.nextInt();

	        // Declare and initialize array
	        int[] arr = new int[size];

	        // Take array input from user
	        System.out.println("Enter " + size + " elements:");
	        for (int i = 0; i < size; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // Print elements using for-each loop
	        System.out.println("Array elements are:");
	        for (int num : arr) {
	            System.out.println(num);
	        }
	    }
	}

