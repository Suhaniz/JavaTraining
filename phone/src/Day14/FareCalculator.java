package Day14;

public class FareCalculator {
    public static double calculateFinalFare(double fare, boolean isFestive,boolean isMember,boolean isBadWeather)  {
        if (isFestive) {
        	fare=FestiveModifier.applyFestiveSurge(fare);
        }
        if (isMember) {
        	fare=MemberShipModifier.applyMemberShipDiscount(fare);
        }
        if( isBadWeather) {
        	fare=WeatherModifier.applyWeatherAdjustment(fare);
        }
        return fare;
}
}