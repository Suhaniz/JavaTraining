package Day8;

public class Bike {
       String bikeName;
       Engine engine;
       
       public Bike(String bikeName,Engine engine) {
    	   this.bikeName=bikeName;
    	   this.engine=engine;
       }
       public void displayBikeDetails() {
    	   System.out.println("Bike Name is: "+ bikeName);
    	   engine.displayEngine();
    	   System.out.println();
       }
}
