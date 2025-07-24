package Day20;

import java.util.LinkedList;

public class TaskManager {
    public static void main(String[] args) {
		//2.Create a LinkedList to store tasks
    	LinkedList<String>tasks= new LinkedList<>();
    	
    	//3.Add tasks to the list
    	tasks.add("Wake up");
    	tasks.add("Get Ready");
    	tasks.add("Attend Java Class");
    	tasks.add("Practice  Coding");
    	
    	//4.Display the task list
    	System.out.println("Today's Tasks:");
    	for(String task:tasks) {
    		System.out.println("-"+task);
    	}
    	
    	//5.Remove a completed task
    	tasks.remove("Brush Teeth");
    	
    	//6.Add a task at the end
    	tasks.addFirst("Make Your Bed");
    	
    	//7.Add a task at the end
    	tasks.addLast("Sleep");
    	
    	//8.Display update List
    	System.out.println("\nUpdated Tasks:");
    	for(String task:tasks) {
    		System.out.println("-"+task);
    	}
	}
}
