package AdapterPatternExample;

public class StripeAdapter implements PaymentProcessor {
	private Stripe s;
	StripeAdapter(Stripe s) {
		this.s=s;
	}
	public void processPayment(double amount) {
		s.doPayment(amount);
	}

}
