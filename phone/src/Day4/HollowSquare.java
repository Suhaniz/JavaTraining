package Day4;

public class HollowSquare {
	    public static void main(String[] args) {
	        int n = 4;

	        for (int i = 1; i <= n; i++) { //outer for loop for rows
	            for (int j = 1; j <= n; j++) { //inner for loop for cols
	                if (i == 1 || i == n || j == 1 || j == n)
	                    System.out.print("* ");
	                else
	                    System.out.print("  ");
	            }
	            System.out.println();
	        }
	    }
	}

