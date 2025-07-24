package Day12;

public class B {
    public void display() {
        A obj = new A();
        System.out.println(obj.pub);   // ✅ public
        System.out.println(obj.pro);   // ✅ protected
        System.out.println(obj.def);   // ✅ default
        // System.out.println(obj.pri); // ❌ private - not accessible
    }
}
/* It's C Class in Package 11; */