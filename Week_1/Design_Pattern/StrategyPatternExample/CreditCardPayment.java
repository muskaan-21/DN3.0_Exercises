package StrategyPatternExample;

public class CreditCardPayment implements PaymentStrategy {
	private String cardholder;
	private String cardnumber;
	private String cvv;
	private String expdate;
	public CreditCardPayment(String cardholder, String cardnumber, String cvv, String expdate) {
		this.cardholder=cardholder;
		this.cardnumber=cardnumber;
		this.cvv=cvv;
		this.expdate=expdate;
	}
	public void pay(double amount) {
		System.out.println("Paid "+amount+" using credit card");
	}

}
