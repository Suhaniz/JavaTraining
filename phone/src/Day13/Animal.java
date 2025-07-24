package Day13;

abstract class Animal {
     abstract void sound();
     abstract void type();
     abstract void color();
     
     void primtMe() {
    	 System.out.println("I'm a Concrete Method");
     }
}
