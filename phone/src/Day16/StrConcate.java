package Day16;

public class StrConcate {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str = "Hello";

        // Concatenation using +
        System.out.println(str1 + " " + str2); // Hello World

        // Concatenation using concat()
        String str3 = str1.concat(", ").concat(str2).concat("!");
        System.out.println(str3); // Hello, World!

        // length()
        int length = str1.length(); // 5-->length
        System.out.println(length);

        // charAt()
        char ch = str1.charAt(0); // 'H'
        System.out.println(ch);

        // substring()
        String substr1 = str1.substring(0, 2); // "He"
        System.out.println(substr1);

        // equals()
        boolean isEqual = str1.equals(str2); // false
        System.out.println(isEqual);

        boolean equal = str1.equals(str); // true
        System.out.println(equal);

        // == reference comparison
        boolean isSameReference = (str1 == str2); // false
        System.out.println(isSameReference);

        // equalsIgnoreCase()
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase("hello"); // true
        System.out.println(isEqualIgnoreCase);

        // String.valueOf()
        int num = 10;
        String numStr = String.valueOf(num); // "10"
        System.out.println(numStr);
    }
}
