package Day6;

	// WAJP to create a Car class with constructor and display details

	public class Car {
	    // Fields
	    String name;
	    String model;
	    double price;
	    String company;

	    // Constructor
	    Car(String name, String model, double price, String company) {
	        this.name = name;
	        this.model = model;
	        this.price = price;
	        this.company = company;
	    }

	    // Method to display car details
	    void displayDetails() {
	        System.out.println("Car Details:");
	        System.out.println("Name     : " + name);
	        System.out.println("Model    : " + model);
	        System.out.println("Price    : ₹" + price);
	        System.out.println("Company  : " + company);
	    }

	    // Main method to test
	    public static void main(String[] args) {
	        // Creating a car object
	        Car car1 = new Car("Swift", "VXI", 700000, "Maruti Suzuki");

	        // Displaying car details
	        car1.displayDetails();
	    }
	}

