package Day12;

public class TestOverride {
    public static void main(String[] args) {
        Parent p = new Child();  // Upcasting

        // Instance methods - overridden
        p.show();     // Output: Child: show()
        p.display();  // Output: Child: display()

        // Static method - hidden, resolved by reference type
        p.staticMethod();  // Output: Parent: staticMethod()

        Child.staticMethod(); // Output: Child: staticMethod()
    }
}
