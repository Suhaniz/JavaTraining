package Day20;

import java.util.ArrayList;

public class StudentList {
	
   public static void main(String[] args) {
	
	   //4.creating an ArrayList to store Student objects
	   ArrayList<Student>studentList=new ArrayList<>();
	   
	   //5.Adding Student objects to the ArrayList
	   studentList.add(new Student("Vaibhavi",23));
	   studentList.add(new Student("Ayush",24));
	   studentList.add(new Student("Huzefa",25));
	   
	   //6.Displyaing all students using a loop
	   for (Student s:studentList) {
		 s.display();
	   }
    }
}
