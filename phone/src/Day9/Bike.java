package Day9;

public class Bike {
    String name;
    int price;
    Engine E = new Engine("Honda", 160); 
    public Bike(String name, int price) {
        this.name = name;
        this.price = price;
        System.out.println("Bike Created");
    }

    public void displayBike() {
        System.out.println("Bike name: " + name);
        System.out.println("Bike price: " + price);
    }
}
