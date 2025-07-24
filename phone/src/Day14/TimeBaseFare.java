package Day14;

public interface TimeBaseFare {
      double applyTimeFare(double baseFare);
      }

      class DayFareStrategy implements TimeBaseFare {
    	  @Override
    	  public double applyTimeFare(double baseFare) {
    		  return baseFare; //No change
    	  }
      }
      
      class NightFareStrategy implements TimeBaseFare {
    	  @Override
    	  public double applyTimeFare(double baseFare) {
    		  return baseFare*1.2;//20% night surcharge
    	  }
}
