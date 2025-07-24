package Day4;

public class CurrencyConverter {
    public static void main(String[] args) {
        double usd = 10; // amount in USD
        double rate = 83.20; // 1 USD = 83.20 INR (example rate)

        double inr = usd * rate;

        System.out.println(usd + " USD = " + inr + " INR");
    }
}

//USD → United States Dollar
//INR → Indian Rupee 