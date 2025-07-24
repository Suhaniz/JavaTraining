package Day14;

public class OlaUber {
   public static void main(String[] args) {
	Rider R= new Rider("Suhani");
	Driver D =new Driver("Sanskar");
	
    R.requestRide();
    D.accepteride();
    
    System.out.println("The Ride is Started");
    System.out.println("The Ride is Completed , Thank Youhh For Ridding");
	
}
}