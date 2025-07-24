package Day5;

	import java.util.Scanner;

	public class nLeapYear {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n, year = 2024, count = 0;

	        System.out.print("Enter how many leap years to print: ");
	        n = sc.nextInt();

	        while (count < n) {
	            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
	                System.out.println(year);
	                count++;
	            }
	            year++;
	        }
	    }
	}

