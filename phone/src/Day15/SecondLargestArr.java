/* Question - WAJP to find the Second Largest Element of and array*/ 

package Day15;

	import java.util.Scanner;

	public class SecondLargestArr {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Take array size input
	        System.out.print("Enter number of elements: ");
	        int size = sc.nextInt();

	        if (size < 2) {
	            System.out.println("Need at least 2 elements to find second largest.");
	            return;
	        }

	        int[] arr = new int[size];

	        // Take array elements input
	        System.out.println("Enter " + size + " elements:");
	        for (int i = 0; i < size; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // Initialize
	        int first = Integer.MIN_VALUE;
	        int second = Integer.MIN_VALUE;

	        // Find first and second largest
	        for (int num : arr) {
	            if (num > first) {
	                second = first;
	                first = num;
	            } else if (num > second && num != first) {
	                second = num;
	            }
	        }

	        // Output
	        if (second == Integer.MIN_VALUE) {
	            System.out.println("No distinct second largest element found.");
	        } else {
	            System.out.println("Second largest element: " + second);
	        }
	    }
	}

