package Day4;

public class NumberTriangle {
    public static void main(String[] args) {
        int num = 5; // total rows

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // move to next line
        }
    }
}

