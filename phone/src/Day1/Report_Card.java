package Day1;

  import java.util.Scanner;

	public class Report_Card {
		
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter percentage: ");
	        float percent = sc.nextFloat();

	        if (percent >= 75) {
	            System.out.println("Distinction");
	        } else if (percent >= 60) {
	            System.out.println("First Class");
	        } else if (percent >= 50) {
	            System.out.println("Second Class");
	        } else if (percent >= 35) {
	            System.out.println("Pass");
	        } else {
	            System.out.println("Fail");
	        }

	        sc.close();
	    }
	}

