package Day9;

public class E1 {
	
    String brand;
    int cc;

    public E1(String brand, int cc) {
        this.brand = brand;
        this.cc = cc;
        System.out.println("Engine1 Created");
    }

    public void displayE1() {
        System.out.println("Engine1 brand: " + brand);
        System.out.println("Engine1 CC: " + cc);
    }
}
