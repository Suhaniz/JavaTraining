package Day14;

//Main class to test method overloading
public class MainMath {
	
	    public static void main(String[] args) {
	        MathOperations op = new MathOperations();

	        System.out.println("Add int: " + op.add(5, 10));             // int + int
	        System.out.println("Add double: " + op.add(2.5, 3.5));        // double + double
	        System.out.println("Add 3 ints: " + op.add(1, 2, 3));         // int + int + int
	    }
}

