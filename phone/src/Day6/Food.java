package Day6;

	public class Food {
	    // Fields
	    String name;
	    double price;

	    // Constructor
	    public Food(String name, double price) {
	        this.name = name;
	        this.price = price;
	    }

	    // Method to display food details
	    public void display() {
	        System.out.println("Food Item Details:");
	        System.out.println("Name  : " + name);
	        System.out.println("Price : ₹" + price);
	    }

	    // Main method to test the class
	    public static void main(String[] args) {
	        // Create a Food object
	        Food food1 = new Food("Pizza", 249.00);

	        // Display details
	        food1.display();
	    }
	}

