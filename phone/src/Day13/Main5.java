package Day13;

public class Main5 {
       public static void main(String[] args) {
		PaymentGateway P = new PhonePay();
		P.VerifiedPayment();
		P.CancelPayment();
	}
}
