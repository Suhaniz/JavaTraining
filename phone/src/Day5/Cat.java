package Day5;

public class Cat {
		String name;
		
		void Meow() {//non-static method
			System.out.println(name+" says Meoww !!");
		}
	    public static void main(String[] args) {
			//to call a non - static method we must create an object for the particular class
	    	
	    	Cat c1=new Cat();
	    	c1.name="Mufasa";
	    	c1.Meow(); //Mufasa says Woof
	    	
	    	Cat c2=new Cat();
	    	c2.name="Bokya";
	    	c2.Meow(); //Bokya says Woof
		}
	}
	//
	//Make the non-static method for class Cat,Cow as well


