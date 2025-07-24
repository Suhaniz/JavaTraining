package Day4;
import java.util.Scanner;

public class SimpleBillSplitter {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter total bill amount: Rs");
		double total = sc.nextDouble();
		
		System.out.println("Enter number of friends");
		int people = sc.nextInt();
		
		double share= total/people;
		
		System.out.println("Each person should pay: Rs"+share);
	}
}
//Complex
//By adding some more data
//By some more requirements