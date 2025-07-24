package Day16;

public class StringDemo {
      public static void main(String[] args) {
		//using string literals
    	  String str1= "Hello,World! ";
    	  
    	// using the new Keyword
    	  String str2=new String("Hello,World! ");
    	  
    	//Using char array
    	 char[] helloArray = {'H','e','l','l','o'};
    	 String str3 = new String(helloArray);
    	 
    	 System.out.println(str1);
    	 System.out.println(str2);
    	 System.out.println(str3);
	}
}
//String is a Sequence og characters enclosed in":"
//3 ways to declare a String
//1)using String Literals
//2)using new Keyword
//3)using char array