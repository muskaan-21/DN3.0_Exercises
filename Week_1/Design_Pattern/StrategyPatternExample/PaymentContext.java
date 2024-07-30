package StrategyPatternExample;

public class PaymentContext {
	private PaymentStrategy ps;
	public void setPaymentStrategy(PaymentStrategy ps) {
		this.ps=ps;
	}
	public void showpayment(double amount) {
		if(ps!=null) {
			ps.pay(amount);
		}
		else {
			System.out.println("No payment strategy set");
		}
	}

}
