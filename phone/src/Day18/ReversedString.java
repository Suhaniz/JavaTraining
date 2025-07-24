package Day18;

public class ReversedString {
     public static void main(String[] args) {
		  String input="Suhani";
		  System.out.println(input);
		  System.out.println(reverse(input));
	}
     
     public static String reverse(String input ) {
    	 char[] chars=new char[input.length()];
    	 int index=0;
    	 for(int i=input.length()-1;i>=0;i--) {
         chars[index++]=input.charAt(i);
    	 }
    	 return new String(chars);
     }
}