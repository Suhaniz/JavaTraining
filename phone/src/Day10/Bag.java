package Day10;


import java.util.Scanner;

public class Bag {
    String brand;
    double price;
    Laptop L;

    public Bag(String brand, double price) {
        this.brand = brand;
        this.price = price;
        System.out.println("Bag Created");
    }

    public void addLaptop() {
        if (L == null) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Laptop name:");
            String name = sc.nextLine();
            System.out.println("Laptop price:");
            double price = sc.nextDouble();
            L = new Laptop(name, price);
            System.out.println("Laptop added");
        } else {
            System.out.println("Bag already contains a Laptop");
        }
    }

    public void removeLaptop() {
        if (L == null) {
            System.out.println("Bag is empty, add a Laptop first");
        } else {
            L = null;
            System.out.println("Laptop removed");
        }
    }

    public void displayLaptop() {
        if (L == null) {
            System.out.println("Bag is empty, add a Laptop first");
        } else {
            System.out.println("Laptop name: " + L.name);
            System.out.println("Laptop price: " + L.price);
        }
    }

    public void displayBag() {
        System.out.println("Bag brand: " + brand);
        System.out.println("Bag price: " + price);
    }
}