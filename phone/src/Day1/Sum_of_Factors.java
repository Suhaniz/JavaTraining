package Day1;

 import java.util.Scanner;

   public class Sum_of_Factors {
	   
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number: ");
	        int num = sc.nextInt();

	        // Using for loop
	        int sum = 0, count = 0;
	        System.out.println("Factors using for loop:");
	        for (int i = 1; i <= num; i++) {
	            if (num % i == 0) {
	                System.out.print(i + " ");
	                sum += i;
	                count++;
	            }
	        }
	        System.out.println("\nSum: " + sum);
	        System.out.println("Count: " + count);

	        // Using while loop
	        sum = 0;
	        count = 0;
	        int i = 1;
	        System.out.println("\nFactors using while loop:");
	        while (i <= num) {
	            if (num % i == 0) {
	                System.out.print(i + " ");
	                sum += i;
	                count++;
	            }
	            i++;
	        }
	        System.out.println("\nSum: " + sum);
	        System.out.println("Count: " + count);

	        sc.close();
	    }
	}

