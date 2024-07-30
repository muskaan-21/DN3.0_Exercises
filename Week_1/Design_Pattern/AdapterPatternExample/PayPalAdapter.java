package AdapterPatternExample;

public class PayPalAdapter implements PaymentProcessor {
	private PayPal p;
	PayPalAdapter(PayPal p) {
		this.p=p;
	}
	public void processPayment(double amount) {
		p.makePayment(amount);
	}

}
