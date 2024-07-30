package CommandPatternExample;

public class RemoteControl {
	private Command com;
	public void setCommand(Command com) {
		this.com=com;
	}
	public void pressbutton() {
		if(com!=null) {
			com.execute();
		}
		else {
			System.out.println("NO command set");
		}
	}

}
