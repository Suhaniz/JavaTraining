package Day14;

//Person.java
public class Person {
 String name;
 int age;

 // Constructor of Person
 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Display method
 public void display() {
     System.out.println("Name : " + name);
     System.out.println("Age  : " + age);
 }
}
