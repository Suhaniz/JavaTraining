/*Question - WAJP to print Fibonacci Series using Memoization*/

package Day17;

import java.util.Scanner;

public class FibonacciMemoArr {

    static int[] memo; // Array to store computed Fibonacci values

    // Recursive method with memoization
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }

        // Check if value already computed
        if (memo[n] != -1) {
            return memo[n];
        }

        // Compute and store the result
        memo[n] = fib(n - 1) + fib(n - 2);
        return memo[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: how many terms
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        // Initialize memo array with -1
        memo = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            memo[i] = -1;
        }

        System.out.println("Fibonacci series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
