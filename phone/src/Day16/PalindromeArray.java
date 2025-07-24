/*package Day16;

public class PalindromeArray {
	

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1}; // Change this to test other cases
        boolean isPalindrome = true;
        
        int left = 0, right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is NOT a palindrome.");
        }
    }
}*/
package Day16;
	
import java.util.Scanner;

public class PalindromeArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Check palindrome
        boolean isPalindrome = true;
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is NOT a palindrome.");
        }
    }
}

