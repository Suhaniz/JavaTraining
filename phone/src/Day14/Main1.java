package Day14;

public class Main1 {
  public static void main(String[] args) {
	Flower myFlower = new Rose();
	myFlower.smell();
	
	Rose myRose= (Rose) myFlower;
	myRose.fragrance();
  }
}
