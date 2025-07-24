package Day17;

	import java.util.Scanner;

	public class LinearSearch {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input size of array
	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];

	        // Input array elements
	        System.out.println("Enter " + n + " elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // Input element to search
	        System.out.print("Enter element to search: ");
	        int key = sc.nextInt();

	        // Linear Search logic
	        boolean found = false;
	        for (int i = 0; i < n; i++) {
	            if (arr[i] == key) {
	                System.out.println("Element found at index: " + i);
	                found = true;
	                break;
	            }
	        }

	        if (!found) {
	            System.out.println("Element not found in the array.");
	        }
	    }
	}

