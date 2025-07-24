package Day14;

public class TestTimeFare {
	    public static void main(String[] args) {
	        double baseFare = 100.0;
	        
	        // Use either strategy
	        TimeBaseFare dayFare = new DayFareStrategy();
	        TimeBaseFare nightFare = new NightFareStrategy();

	        System.out.println("Day Fare: ₹" + dayFare.applyTimeFare(baseFare));
	        System.out.println("Night Fare: ₹" + nightFare.applyTimeFare(baseFare));
	    }
}


