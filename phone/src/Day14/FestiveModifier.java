package Day14;

class FestiveModifier {
    public static double applyFestiveSurge(double fare) {
    	return fare*1.3;//30% surge
    }
}
    	
class MemberShipModifier {
	public static double applyMemberShipDiscount(double fare) {
		return fare*0.9; //10% discount
	}
}

class WeatherModifier {
	public static double applyWeatherAdjustment(double fare) {
		return fare*1.1; //10% extra
    }
}
