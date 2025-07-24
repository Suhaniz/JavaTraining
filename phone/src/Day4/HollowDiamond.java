package Day4;

public class HollowDiamond {
    public static void main(String[] args) {
        int n = 5; // Height of the upper half

        // Upper half
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // Print stars and hollow spaces
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // Print stars and hollow spaces
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}
