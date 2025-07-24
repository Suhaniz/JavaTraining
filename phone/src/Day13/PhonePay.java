package Day13;

public class PhonePay implements PaymentGateway {

	@Override
	public void VerifiedPayment() {
		System.out.println("The Payment is Verified");
		
	}

	@Override
	public void CancelPayment() {
		System.out.println("The Payment is Cancelld");
		
	}
}
