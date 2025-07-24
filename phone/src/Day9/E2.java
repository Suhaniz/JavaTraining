package Day9;

public class E2 {
    String brand;
    int cc;

    public E2(String brand, int cc) {
        this.brand = brand;
        this.cc = cc;
        System.out.println("Engine2 Created");
    }

    public void displayE2() {
        System.out.println("Engine2 brand: " + brand);
        System.out.println("Engine2 CC: " + cc);
    }
}
