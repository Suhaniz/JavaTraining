package Day4;

public class InvertedRightAngledTriangle {

    public static void main(String[] args) {
        int num = 5;

        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // move to next line after each row
        }
    }
}
