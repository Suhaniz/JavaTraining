package Day8;

public class Main {
	public static void main(String[] args) {
		Engine engine=new Engine("ENG1234","petrol");	
		
		Bike bike1=new Bike("Bike1",engine);
		Bike bike2=new Bike("Bike2",engine);
		Bike bike3=new Bike("Bike3",engine);
		
		bike1.displayBikeDetails();
		bike2.displayBikeDetails();
		bike3.displayBikeDetails();
	}
}
