package Day4;

public class AlphabetRightAngledTriangle {
    public static void main(String[] args) {
        int rows = 5; // Number of rows

        char ch = 'A'; // Start from A

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
