package Day4;

public class ButterflyPattern {
    public static void main(String[] args) {
        int n = 8;

        // Upper half of the butterfly
        for (int i = 1; i <= n; i++) {
            // Left stars
            for (int j = 1; j <= i; j++) { //inner for loop
                System.out.print("*"); //print the left stars
            }
            // Spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" "); //print the spaces
            }
            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part
        for (int i = n; i >= 1; i--) {
            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//spaces formula ==> 2 * (n - i) --> if i increases space decreases
//if i=3
//2*(n-i) = 2*(n-3)=2*(7-3)==>2*4=8