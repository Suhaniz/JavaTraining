package Day2;

public class DataTypeLimits {
	
	   public static void main(String[] args) {
	        System.out.println("Primitive Data Types: Min and Max Values\n");

	        // Integer types
	        System.out.println("byte     : Min = " + Byte.MIN_VALUE     + ", Max = " + Byte.MAX_VALUE);
	        System.out.println("short    : Min = " + Short.MIN_VALUE    + ", Max = " + Short.MAX_VALUE);
	        System.out.println("int      : Min = " + Integer.MIN_VALUE  + ", Max = " + Integer.MAX_VALUE);
	        System.out.println("long     : Min = " + Long.MIN_VALUE     + ", Max = " + Long.MAX_VALUE);

	        // Floating-point types
	        System.out.println("float    : Min = " + Float.MIN_VALUE    + ", Max = " + Float.MAX_VALUE);
	        System.out.println("double   : Min = " + Double.MIN_VALUE   + ", Max = " + Double.MAX_VALUE);

	        // Character type
	        System.out.println("char     : Min = " + (int) Character.MIN_VALUE + ", Max = " + (int) Character.MAX_VALUE);

	        // Boolean type
	        System.out.println("boolean  : Values = " + Boolean.FALSE + " and " + Boolean.TRUE);
	    }
	}


