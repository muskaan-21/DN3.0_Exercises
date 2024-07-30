package DecoratorPatternExample;

public class SMSNotifierDecorator extends NotifierDecorator {
	public SMSNotifierDecorator(Notifier note) {
		super(note);
	}
	public void send(String message) {
		super.send(message);
		sendsms(message);
	}
	public void sendsms(String message) {
		System.out.println("Sending sms with message "+message);
	}

}
