package Day18;

public class StringPalindrome {
     public static boolean isPalindrome(String str) {
    	 String reversed=new StringBuilder(str).reverse().toString();
    	 return str.equals(reversed);
     }
     public static void main(String[] args) {
		String str="MOM";
		System.out.println("Is Pallindrome:"+isPalindrome(str));
	}
}