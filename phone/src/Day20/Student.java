package Day20;

public class Student {
    String name;
    int age;
    
    //2.Constructor to initialize student details 
    Student(String name,int age) {
    	this.name=name;
    	this.age=age;
    }
    
    //3.Method to display student details
    void display() {
    	System.out.println("Name:"+name+",Age:"+age);
    }
}
