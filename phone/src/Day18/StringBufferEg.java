package Day18;

public class StringBufferEg {
    public static void main(String[] args) {
        // Creating a StringBuffer Object
        StringBuffer sb = new StringBuffer("Hello");

        // Appending strings
        sb.append(", ").append("World!");

        // Inserting a String
        sb.insert(5, "Java");

        // Reversing the String
        sb.reverse();

        // Converting StringBuffer to String
        String result = sb.toString();

        // Printing the Result
        System.out.println("StringBuffer Result: " + result);

        // Resetting the StringBuffer to original reversed result
        sb.setLength(0);         // Clear contents
        sb.append(result);       // Set it back

        // Printed the Modified Result
        System.out.println("Modified StringBuffer Result: " + sb.toString());
    }
}
