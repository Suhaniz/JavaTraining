package Day5;

public class Cow {
		String name;
		
		void humb() {//non-static method
			System.out.println(name+" says Hummmbb !");
		}
	    public static void main(String[] args) {
			//to call a non - static method we must create an object for the particular class
	    	
	    	Cow c1=new Cow();
	    	c1.name="White Cow";
	    	c1.humb(); //White Cow says Woof
	    	
	    	Cow c2=new Cow();
	    	c2.name="Black Cow";
	    	c2.humb(); //Black Cow says Woof
		}
	}
	//
	//Make the non-static method for class Cat,Cow as well

