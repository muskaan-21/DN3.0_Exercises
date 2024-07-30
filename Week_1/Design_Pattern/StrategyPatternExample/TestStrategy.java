package StrategyPatternExample;

public class TestStrategy {

	public static void main(String[] args) {
		PaymentContext pc=new PaymentContext();
		//using credit card
		PaymentStrategy cd=new CreditCardPayment("567896543678", "Rahul Bisoi", "334","12/26");
		pc.setPaymentStrategy(cd);
		pc.showpayment(300.0);
		
		//using paypal
		PaymentStrategy pp=new PayPalPayment("rahulbisoi34@gmail.com", "gandhi_34");
		pc.setPaymentStrategy(pp);
		pc.showpayment(500.0);

	}

}
