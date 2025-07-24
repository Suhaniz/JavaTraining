package Day5;

public class Dog {
	String name;
	
	void bark() {//non-static method
		System.out.println(name+" says Woof!");
	}
    public static void main(String[] args) {
		//to call a non - static method we must create an object for the particular class
    	
    	Dog d1=new Dog();
    	d1.name="Bruno";
    	d1.bark(); //Bruno says Woof
    	
    	Dog d2=new Dog();
    	d2.name="Luna";
    	d2.bark(); //Luna says Woof
	}
}
//
//Make the non-static method for class Cat,Cow as well
