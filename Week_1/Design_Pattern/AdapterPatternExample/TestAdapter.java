package AdapterPatternExample;

public class TestAdapter {

	public static void main(String[] args) {
		PayPal py=new PayPal();
		AmazonPay aam=new AmazonPay();
		Stripe sp=new Stripe();
		
		//adapters
		PaymentProcessor pad=new PayPalAdapter(py);
		PaymentProcessor amad=new AmazonPaYAdapter(aam);
		PaymentProcessor sad=new StripeAdapter(sp);
		
		//payment through adapters
		pad.processPayment(200.0);
		amad.processPayment(400.0);
		sad.processPayment(600.0);
	}

}
