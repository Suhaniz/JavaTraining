package Day4;

public class DiamondPattern {
    public static void main(String[] args) {
        int n = 5; // Half height of the diamond

        // Upper half
        for (int i = 1; i <= n; i++) { //outer loop
        	//runs from 1 to 3
        	
            for (int s = i; s < n; s++) {  //inner for loop for printing
                System.out.print(" ");  //spaces
            }
            for (int j = 1; j <= i; j++) { //inner loop for printing
                System.out.print("* ");  //stars
            }
            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {  //ulta loop 
            for (int s = n; s > i; s--) {   //inner loop to print spaces
                System.out.print(" ");  //ulta loop
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");  //no changes and print stars
            }
            System.out.println();
        }
    }
}
