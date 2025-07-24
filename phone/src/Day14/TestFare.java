package Day14;

public class TestFare {
    public static void main(String[] args) {
        double baseFare = 100.0;
        boolean isFestive = true;
        boolean isMember = true;
        boolean isBadWeather = false;

        double finalFare = FareCalculator.calculateFinalFare(baseFare, isFestive, isMember, isBadWeather);
        System.out.println("Final Fare: ₹" + finalFare);
    }
}
