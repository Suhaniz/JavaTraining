package Day4;

public class HollowButterfly {
    public static void main(String[] args) {
        int n = 8; // height of each half

        // Upper half
        for (int i = 1; i <= n; i++) {
            // Left half
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            // Spaces in middle
            for (int s = 1; s <= 2 * (n - i); s++) {
                System.out.print(" ");
            }

            // Right half
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }

        // Lower half
        for (int i = n; i >= 1; i--) {
            // Left half
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            // Spaces in middle
            for (int s = 1; s <= 2 * (n - i); s++) {
                System.out.print(" ");
            }

            // Right half
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}

