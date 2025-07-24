package Day6;

	public class Camera {
	    // Fields
	    String name;
	    double price;
	    String model;
	    String company;

	    // Constructor
	    public Camera(String name, double price, String model, String company) {
	        this.name = name;
	        this.price = price;
	        this.model = model;
	        this.company = company;
	    }

	    // Method to display camera details
	    public void display() {
	        System.out.println("Camera Details:");
	        System.out.println("Name    : " + name);
	        System.out.println("Price   : ₹" + price);
	        System.out.println("Model   : " + model);
	        System.out.println("Company : " + company);
	    }

	    // Main method to test the class
	    public static void main(String[] args) {
	        // Creating a Camera object
	        Camera cam1 = new Camera("Canon EOS 1500D", 34999.00, "1500D", "Canon");

	        // Displaying the details
	        cam1.display();
	    }
	}

