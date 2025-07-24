/* Question - WAJP to find the Second Largest Element of and array*/

package Day15;

	import java.util.Scanner;

	public class SmallestArr {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input array size
	        System.out.print("Enter the number of elements: ");
	        int size = sc.nextInt();

	        if (size <= 0) {
	            System.out.println("Array must have at least one element.");
	            return;
	        }

	        int[] arr = new int[size];

	        // Input array elements
	        System.out.println("Enter " + size + " elements:");
	        for (int i = 0; i < size; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // Initialize smallest with first element
	        int min = arr[0];

	        // Find the smallest element
	        for (int i = 1; i < size; i++) {
	            if (arr[i] < min) {
	                min = arr[i];
	            }
	        }

	        // Output
	        System.out.println("Smallest element: " + min);
	    }
	}
