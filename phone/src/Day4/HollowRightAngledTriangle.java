package Day4;

public class HollowRightAngledTriangle {
    public static void main(String[] args) {
        int n = 5;  // height of triangle

        for (int i = 1; i <= n; i++) {  // rows
            for (int j = 1; j <= i; j++) {  // columns
                // Print '*' at border positions (first or last column, or last row)
                if (j == 1 || j == i || i == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
