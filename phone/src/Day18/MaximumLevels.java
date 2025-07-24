package Day18;

public class MaximumLevels {
     public static String getMaxLevelScore(int energy) {
    	 StringBuilder score=new StringBuilder();
    	 
    	 while(energy>0) {
    		 int power = Integer.highestOneBit(energy);
    		 //Gets Higher Power of 2 <energy
    		 
    		 score.append(power).append(" "); // add space for readability;
    		 energy -= power; //energy=energy-power
     }
    	 return score.toString().trim(); // remove trailing space();
}
     public static void main(String[] args) {
		int energy=18; //example input
		String result=getMaxLevelScore(energy);
		System.out.println("Result:"+result);
	}
}