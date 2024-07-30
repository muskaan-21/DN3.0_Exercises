package CommandPatternExample;

public class TestCommand {

	public static void main(String[] args) {
		Light livroom=new Light();
		Command on=new LightOnCommand(livroom);
		Command off=new LightOffCommand(livroom);
		RemoteControl remote=new RemoteControl();
		//turning on
		remote.setCommand(on);
		remote.pressbutton();
		
		//turning off
		remote.setCommand(off);
		remote.pressbutton();
	}

}
