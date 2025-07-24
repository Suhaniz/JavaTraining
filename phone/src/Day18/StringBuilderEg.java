package Day18;


public class StringBuilderEg {
    public static void main(String[] args) {
		//Creating a StringBuilder Object
    	StringBuilder sb=new StringBuilder("Hello");
    	
    	//Appending strings
    	sb.append(", ").append("World!");
    	
    	//Inserting a String
    	sb.insert(5,"Java");
    	
    	//Reversing the String
    	sb.reverse();
    	
    	//Converting StringBuilder to String
    	String result=sb.toString();
    	
    	//Printing the Result
    	System.out.println("StringBuilder Result:"+result);
    	
    	//Reset the StringBuilder for further Operations
    	sb.reverse();
    	sb.replace(0, 0, result);
    	
    	//Printed the Modified Result
    	System.out.println("Modified StringBuilder Result:"+sb.toString());
	}
}