package Day4;

public class HollowHourGlassPattern {
    public static void main(String[] args) {
        int n = 5; // height of hourglass (top or bottom half)

        // Upper half
        for (int i = n; i >= 1; i--) {
            // Leading spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // Hollow stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1) || i == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }

        // Lower half
        for (int i = 2; i <= n; i++) {
            // Leading spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // Hollow stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1) || i == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}
