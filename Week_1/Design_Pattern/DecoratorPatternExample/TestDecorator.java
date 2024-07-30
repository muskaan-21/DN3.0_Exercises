package DecoratorPatternExample;

public class TestDecorator {

	public static void main(String[] args) {
		//email notifier
		Notifier email=new EmailNotifier();
		Notifier smsnslack=new SlackNotifierDecorator(new SMSNotifierDecorator(email));
		smsnslack.send("This is a decorator pattern example");
		
		Notifier sms=new SMSNotifierDecorator(email);
		sms.send("This is a sms from decorator pattern");
	}

}
