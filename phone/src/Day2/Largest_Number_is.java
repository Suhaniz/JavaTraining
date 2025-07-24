package Day2;

  import java.util.Scanner;

    public class Largest_Number_is {
    	
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);

	        // Input three numbers
	        System.out.print("Enter first number: ");
	        int a = sc.nextInt();
	        
	        System.out.print("Enter second number: ");
	        int b = sc.nextInt();
	        
	        System.out.print("Enter third number: ");
	        int c = sc.nextInt();

	        // Using nested ternary operator
	        int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

	        // Output the result
	        System.out.println("The largest number is: " + largest);
	        
	        sc.close();    
	}
}

