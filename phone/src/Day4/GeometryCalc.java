package Day4;

public class GeometryCalc {
    public static void main(String[] args) {
		//method calls
    	// values they are called as actual arguments
    	int squareSide=5;
    	int rectLength=10;
    	int rectBreadth=4;
    	System.out.println("Area of a Square is:"+areaOfSquare(5));
    	System.out.println("Perimeter of a Rectangle is:"+perimOfRect(10,4));
    }
    static int areaOfSquare(int side) {//formal arguments
    	return side*side;
    }
    static int perimOfRect(int length, int breadth) {
    	return 2*(length+breadth);
    }
}
