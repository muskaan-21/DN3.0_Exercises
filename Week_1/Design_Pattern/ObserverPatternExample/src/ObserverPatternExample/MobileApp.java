package ObserverPatternExample;

public class MobileApp implements Observer{
	public String appname;
	public MobileApp(String appname) {
		this.appname=appname;
	}
	public void update(String stockname, double stockprice) {
		System.out.println(appname +" received update: "+stockname +" is now "+stockprice);
	}

}
