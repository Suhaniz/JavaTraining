/*Question - WAJP to remove duplicates from an array*/

package Day17;

	import java.util.Scanner;
	public class RemoveDuplicatesArr {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input array size
	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];

	        // Input array elements
	        System.out.println("Enter " + n + " elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // Sort the array first
	        java.util.Arrays.sort(arr);

	        // Temporary array to store unique elements
	        int[] temp = new int[n];
	        int j = 0;

	        // Remove duplicates
	        for (int i = 0; i < n - 1; i++) {
	            if (arr[i] != arr[i + 1]) {
	                temp[j++] = arr[i];
	            }
	        }
	        // Add the last element
	        temp[j++] = arr[n - 1];

	        // Print the array without duplicates
	        System.out.println("Array after removing duplicates:");
	        for (int i = 0; i < j; i++) {
	            System.out.print(temp[i] + " ");
	        }
	    }
	}

