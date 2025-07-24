package Day11;

import Day12.A;

public class C extends A {
    public void test() {
        System.out.println(pub);   // ✅ public
        System.out.println(pro);   // ✅ protected (via inheritance)
        // System.out.println(def); // ❌ default - not accessible
        // System.out.println(pri); // ❌ private - not accessible
    }
}

/*From Package 12 of Class A and Class B*/