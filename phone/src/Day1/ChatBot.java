package Day1;

import java.util.Scanner;

 public class ChatBot {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println(":) Hello! I'm JavaBot. Ask me Anything (type 'bye' to exit).");
        
        while (true) {
        	System.out.print("You: ");
        	String input = sc.nextLine().toLowerCase();
        	
        	if (input.contains("hi") || input.contains("hello")) {
        		System.out.println("JavaBot: Hello there! How can I help you?");
        		
        	}
        	else if (input.contains("how are you")) {
        		System.out.println("JavaBot: I'M just a code,I'm doing great! ");
        	}
        	else if (input.contains("name")) {
        		System.out.println("JavaBot: I'm JavaBot,your friendly terminal assistant.");
        	}
        	else if (input.contains("bye"))	{
        		System.out.println("JavaBot: Goodbye ! Have a great day:) ");
        		break;
        	}
        	else {
        		System.out.println("JavaBot: Sorry, I didn't understand that.");
        	}
       }
        
	}

}