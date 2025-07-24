package Day3;

import java.util.Scanner;

public class FiboUsingRecursion {
	//Recursion method to find nth fibonacci number
	public static int fibonacci(int n) {
		if(n==0)
			return 0;
		else if (n==1)
			return 1;
		else
			return fibonacci(n-1)+ fibonacci(n-2); //logic for that recursive approach
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of terms to print:");
		int n=sc.nextInt();
		
		System.out.println("Fibonacci Series using recursion:");
		for(int i=0;i<n;i++) {
			System.out.println(fibonacci(i)+" "); //recursion --> method is called again and again
			//run in loop
		}
		sc.close();
	}
}
//Recursive --> method calling itself again and again is called as Recursion
//Simple but slow--> recalculates the same values again and again
