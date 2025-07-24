package Day4;

import java.util.Scanner;

	public class CheckDisariumNumber {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Input the number
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        int temp = number;
	        int sum = 0;

	        // Count the number of digits
	        int length = Integer.toString(number).length();

	        // Logic to calculate sum of digits powered to their positions
	        for (int i = length; temp > 0; i--) {
	            int digit = temp % 10;
	            sum += Math.pow(digit, i);
	            temp /= 10;
	        }

	        // Check and print result
	        if (sum == number) {
	            System.out.println(number + " is a Disarium number.");
	        } else {
	            System.out.println(number + " is NOT a Disarium number.");
	        }

	        scanner.close();
	    }
	}

