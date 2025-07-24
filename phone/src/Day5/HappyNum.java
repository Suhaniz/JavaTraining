package Day5;

import java.util.Scanner;

public class HappyNum {
    
    // Function to find the sum of squares of digits
    public static int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num = num / 10;  
        }
        return sum;
    }

    // Function to check if a number is happy
    public static boolean isHappy(int num) {
        int slow = num;
        int fast = num;

        do {
            slow = sumOfSquares(slow); // move one step
            fast = sumOfSquares(sumOfSquares(fast)); // move two steps
        } while (slow != fast);

        return slow == 1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a Happy Number: ");
        int number = sc.nextInt();

        if (isHappy(number)) {
            System.out.println(number + " is a Happy Number.");
        } else {
            System.out.println(number + " is not a Happy Number.");
        }
        sc.close();
    }
}
