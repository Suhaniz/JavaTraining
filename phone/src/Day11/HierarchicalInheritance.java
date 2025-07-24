package Day11;

public class HierarchicalInheritance extends Cat
{

	public static void main(String[] args) {
		Cat myCat=new Cat();
		myCat.eat();
		myCat.Meow();
		Dog myDog=new Dog();
		myDog.bark();
		Pig myPig=new Pig();
		myPig.sleep();
	}

}