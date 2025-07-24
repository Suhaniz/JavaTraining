package Day1;

 import java.util.Scanner;

  public class Palindrome_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;

        while (num > 0) {
            rev = rev * 10 + (num % 10);
            num = num / 10;
        }

        if (temp == rev) {
            System.out.println("It is a Palindrome Number.");
        } else {
            System.out.println("It is NOT a Palindrome Number.");
        }

        sc.close();
    }
}

