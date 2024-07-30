package DecoratorPatternExample;

public abstract class NotifierDecorator implements Notifier{
	protected Notifier note;
	public NotifierDecorator(Notifier note) {
		this.note=note;
	}
	public void send(String message) {
		note.send(message);
	}

}
