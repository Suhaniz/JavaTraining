package Day9;

public class Car {
    String name;
    int price;
    E1 e1 = new E1("Toyota", 160);
    E2 e2 = new E2("Maruti", 150);
   

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
        System.out.println("Car Created");
    }

    public void displayCar() {
        System.out.println("Car name: " + name);
        System.out.println("Car price: " + price);
        e1.displayE1(); // 
    }
   
}
