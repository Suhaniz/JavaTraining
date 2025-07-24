package Day4;

public class InvertedAlphabetRightyAngledTriangle {
	
    public static void main(String[] args) {
	        int rows = 5; // Number of rows

	        char ch = 'A'; // Start from A

	        for (int i = 5; i >= 1; i--) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(ch + " ");
	                ch++;
	            }
	            System.out.println();
	        }
	    }
	}

