package Day4;

public class InvertedNumberTriangle {
    public static void main(String[] args) {
        int rows = 5; // total rows

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // move to next line
        }
    }
}
