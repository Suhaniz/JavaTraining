package Day1;

import java.util.Scanner;

public class PhoneChargeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter phone's battery percentage: ");
        int battery = sc.nextInt();

        if (battery < 20) {
            System.out.println("Your phone needs charging.");
        } else {
            System.out.println("Your phone is sufficiently charged.");
        }
        sc.close();
    }
}