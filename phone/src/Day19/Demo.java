package Day19;

public class Demo {
     public static void main(String[] args) {
		int numerator = 10;
		int denominator = 0;
		int result;
		
		try {
			//code that might throw an exception
			result=numerator/denominator;
			System.out.println("Result:"+result);
		}
		catch (ArithmeticException e) {
			//Handling the Exception
			System.out.println("Message: Cannot divide by zero.");
		}
		finally {
			//This block always Exception 
		}
	}
}
