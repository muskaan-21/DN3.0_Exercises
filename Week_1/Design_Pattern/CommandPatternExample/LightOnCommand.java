package CommandPatternExample;

public class LightOnCommand  implements Command{
	private Light l;
	public LightOnCommand(Light l) {
		this.l=l;
		
	}
	public void execute() {
		l.turnon();
	}

}
