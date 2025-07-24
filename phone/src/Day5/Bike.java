package Day5;

public class Bike {
     int speed=0;
     
     void accelerate(int increment) {
    	 speed=speed+increment;
    	 
    	 System.out.println("Accelerate speed:"+ speed);
    	 
     }
     void brake(int decrement) {
    	 speed=speed-decrement;
    	 System.out.println("Braked speed:"+speed);
    	
     }
     public static void main(String[] args) {
		Bike b1=new Bike();
		b1.accelerate(10);
		b1.brake(3);
	}
}
//Accelator
//Brake