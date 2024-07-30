package AdapterPatternExample;

public class AmazonPaYAdapter implements PaymentProcessor {
	private AmazonPay a;
	AmazonPaYAdapter(AmazonPay a) {
		this.a=a;
	}
	public void processPayment(double amount) {
		a.sendPayment(amount);
	}
}
