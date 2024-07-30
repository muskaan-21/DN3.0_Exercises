package CommandPatternExample;

public class LightOffCommand implements Command {
	private Light l;
	public LightOffCommand(Light l) {
		this.l=l;
	}
	public void execute() {
		l.turnoff();
	}

}
