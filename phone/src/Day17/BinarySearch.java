package Day17;

	import java.util.Scanner;

	public class BinarySearch {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input size of array
	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];

	        // Input sorted array elements
	        System.out.println("Enter " + n + " elements in **sorted order**:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // Input element to search
	        System.out.print("Enter element to search: ");
	        int key = sc.nextInt();

	        // Binary search logic
	        int low = 0, high = n - 1;
	        boolean found = false;

	        while (low <= high) {
	            int mid = (low + high) / 2;

	            if (arr[mid] == key) {
	                System.out.println("Element found at index: " + mid);
	                found = true;
	                break;
	            } else if (arr[mid] < key) {
	                low = mid + 1; // Search right half
	            } else {
	                high = mid - 1; // Search left half
	            }
	        }

	        if (!found) {
	            System.out.println("Element not found in the array.");
	        }
	    }
	}
