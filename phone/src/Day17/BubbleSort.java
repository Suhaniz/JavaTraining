package Day17;

	import java.util.Scanner;

	public class BubbleSort {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input size of array
	        System.out.print("Enter the number of elements: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];

	        // Input elements
	        System.out.println("Enter " + n + " elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // Bubble Sort Logic
	        for (int i = 0; i < n - 1; i++) {          // Passes
	            for (int j = 0; j < n - 1 - i; j++) {  // Comparisons
	                if (arr[j] > arr[j + 1]) {
	                    // Swap arr[j] and arr[j + 1]
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }

	        // Output sorted array
	        System.out.println("Sorted array in ascending order:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
	}

