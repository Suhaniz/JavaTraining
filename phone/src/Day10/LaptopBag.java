package Day10;

import java.util.Scanner;

public class LaptopBag {
    public static void main(String[] args) {
        Bag b = new Bag("LV", 45000);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Laptop\n2. Remove Laptop\n3. Display Laptop\n4. Display Bag\n5. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    b.addLaptop();
                    break;
                case 2:
                    b.removeLaptop();
                    break;
                case 3:
                    b.displayLaptop();
                    break;
                case 4:
                    b.displayBag();
                    break;
                case 5:
                    System.out.println("BYE BYE");
                    System.exit(0);
                default:
                    System.out.println("Enter a valid choice");
            }
        }
    }
}
