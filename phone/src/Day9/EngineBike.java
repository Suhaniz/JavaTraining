package Day9;


public class EngineBike {
    public static void main(String[] args) {
        Bike b = new Bike("Unicorn", 80);
        b.E.displayEngine();  
        b.displayBike();

        System.out.println();

        Bike b1 = new Bike("Hornet", 90);
        b1.E.displayEngine();  
        b1.displayBike();
    }
}