package Day9;

public class Engine {
    String brand;
    int cc;

    // Constructor
    public Engine(String brand, int cc) {
        this.brand = brand;
        this.cc = cc;
        System.out.println("Engine is Created");
    }

    // Method to display engine details
    public void displayEngine() {
        System.out.println("Engine brand is: " + brand);
        System.out.println("Engine cc: " + cc);
    }
}
