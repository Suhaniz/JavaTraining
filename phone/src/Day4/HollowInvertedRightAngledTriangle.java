package Day4;

public class HollowInvertedRightAngledTriangle {
    public static void main(String[] args) {
        int n = 5;  // height of triangle

        for (int i = n; i >= 1; i--) {  // rows from n to 1
            for (int j = 1; j <= i; j++) {  // columns
                // Print '*' at the borders: first column, last column of row, or first row
                if (j == 1 || j == i || i == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
