package Day2;

public class Operators {
    public static void main(String[] args) {
		int a = 10, b = 5 , c;
		
		// A* Bitwise Operators
		// 1.Arithmetic Operators
		System.out.println("Arithmetic Operators:");
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
		
		// 2.Relational(Comparison) Operators
		System.out.println("\nRelational Operators:");
		System.out.println("a==b:"+(a==b));
		System.out.println("a!=b:"+(a!=b));
		System.out.println("a>b="+(a>b));
		System.out.println("a<b="+(a<b));
		System.out.println("a>=b="+(a>=b));
		System.out.println("a<=b="+(a<=b));
		
		// 3.Logical Operators
	    boolean x = true, y= false;
		System.out.println("\nLogical Operaotrs:");
		System.out.println("x&&y="+(x&&y));
		System.out.println("x||y="+(x||y));
		System.out.println("!x="+(x));
		
		// 4.Bitwise Operators
		System.out.println("\nBitwise Operators:");
     	System.out.println("a&b="+(a&b));
     	System.out.println("a|b="+(a|b));
     	System.out.println("a^b="+(a^b));
     	System.out.println("~a="+(~a));
     	System.out.println("a&b="+(a&b));
     	
        // 5. Assignment Operators
        System.out.println("\nAssignment Operators:");
        c = a;
        System.out.println("c = a => " + c);
        c += b;
        System.out.println("c += b => " + c);
        c -= b;
        System.out.println("c -= b => " + c);
        c *= b;
        System.out.println("c *= b => " + c);
        c /= b;
        System.out.println("c /= b => " + c);
        c %= b;
        System.out.println("c %= b => " + c);
        c &= b;
        System.out.println("c &= b => " + c);
        c |= b;
        System.out.println("c |= b => " + c);
        c ^= b;
        System.out.println("c ^= b => " + c);
        c <<= 1;
        System.out.println("c <<= 1 => " + c);
        c >>= 1;
        System.out.println("c >>= 1 => " + c);
        c >>>= 1;
        System.out.println("c >>>= 1 => " + c);

     	
     	// B* Unary Operators
     	System.out.println("\nUnary Operators:");
     	int d= +a;
     	System.out.println("d = +a =>" +d);
     	d = --a;
     	System.out.println("d= -a =>"+d);
     	d= a++;
     	System.out.println("d=a++ =>"+d+",a="+a);
     	d= ++a;
     	System.out.println("d=++a =>"+d+",a="+a);
     	d= a--;
     	System.out.println("d=a-- =>" +d+",a="+a);
     	d= --a;
     	System.out.println("d= --a =>"+d+",a="+a);
     	
        // C* Ternary Operators
     	System.out.println("\nTernary Operator:");
     	int max = (a>b)? a:b;
     	System.out.println("Max of a and b is:"+max);   
     	
        // D*. instance of Operator
        System.out.println("\ninstance of Operator:");
        String str = "Hello";
        System.out.println("str instance of String: " + (str instanceof String));
	}
}
