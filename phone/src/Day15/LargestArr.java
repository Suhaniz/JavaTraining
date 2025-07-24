/*Question - WAJP to find the Largest element of an Array*/ 


/*
 * package Day15;
 
	 public class LargestArr {
	 
         public static void main(String[] args) {
		//defining an array og integers
    	 int[] arr = {12,23,48,78,43,2};
    	 
    	 int largest = arr[0];
    	 
    	 for (int i=1;i<arr.length;i++) {
    		 if (arr[i] > largest) {
    			 largest = arr[i]; //updating for largest element
    		 }
    	 }
    	 
    	 System.out.println("The Largest Element is: "+ largest);
	}
}
*/
package Day15;

import java.util.Scanner;

   public class LargestArr {

	        public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input size
	        System.out.print("Enter the number of elements: ");
	        int size = sc.nextInt();

	        int[] arr = new int[size];

	        // Input array elements
	        System.out.println("Enter " + size + " elements:");
	        for (int i = 0; i < size; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // Assume first element is largest
	        int max = arr[0];

	        // Compare with other elements
	        for (int i = 1; i < size; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	        }

	        System.out.println("Largest element: " + max);
	    }
	
   }
