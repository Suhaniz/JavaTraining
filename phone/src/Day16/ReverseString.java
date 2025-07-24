package Day16;

public class ReverseString {
     public static void main(String[] args) {
		String str = "Heloo World";
		String reversed = new StringBuilder(str).reverse().toString();
		System.out.println("Reversed String: "+reversed);
	}
}
