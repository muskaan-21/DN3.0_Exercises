package SingletonPatternExample;

public class TestSingleton {

	public static void main(String[] args) {
		Logger log1=Logger.getInstance();
		Logger log2=Logger.getInstance();
		Logger.log("This is the first message");
		Logger.log("This is the secong message");
		
		if(log1==log2) {
			System.out.println("both the loggers have same instance");
		}
		else {
			System.out.println("both the loggers donot have same instnace");
		}

	}

}
