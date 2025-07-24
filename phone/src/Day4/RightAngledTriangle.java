package Day4;

public class RightAngledTriangle {

	    public static void main(String[] args) {
	        int num = 4;

	        for (int i = 1; i<= num; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println(); // move to next line after each row
	        }
	    }
}
//run a loop
//rows , cols