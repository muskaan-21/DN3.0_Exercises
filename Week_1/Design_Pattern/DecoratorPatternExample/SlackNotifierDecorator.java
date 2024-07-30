package DecoratorPatternExample;

public class SlackNotifierDecorator extends NotifierDecorator {
	public SlackNotifierDecorator(Notifier note) {
		super(note);
	}
	public void send(String message) {
		super.send(message);
		sendslack(message);
	}
	public void sendslack(String message) {
		System.out.println("Sending slack message "+message);
	}
	

}
