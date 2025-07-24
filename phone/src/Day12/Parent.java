/*a) Can we override 2 instance methods?
Yes, we can override both.

b) Can we override 2 static methods?
No, static methods are class-level. You can hide them (not override).

c) Can we override 1 static + 1 instance?
No, because static and instance methods are handled differently.*/

package Day12;

class Parent {
    // Instance method
    void show() {
        System.out.println("Parent: show()");
    }

    // Another instance method
    void display() {
        System.out.println("Parent: display()");
    }

    // Static method
    static void staticMethod() {
        System.out.println("Parent: staticMethod()");
    }
}

class Child extends Parent {
    // Overriding instance method
    @Override
    void show() {
        System.out.println("Child: show()");
    }

    // Overriding another instance method
    @Override
    void display() {
        System.out.println("Child: display()");
    }

    // Hiding static method (not overriding)
    static void staticMethod() {
        System.out.println("Child: staticMethod()");
    }

    // This is NOT overriding Parent's staticMethod; it's hiding
    // If you try to override static method with instance method or vice versa, you'll get an error
}
