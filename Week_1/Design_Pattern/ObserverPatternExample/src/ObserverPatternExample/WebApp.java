package ObserverPatternExample;

public class WebApp implements Observer {
	private String appname;
	public WebApp(String appname) {
		this.appname=appname;
	}
	public void update(String stockname, double stockprice) {
		System.out.println(appname+" received update: "+stockname+" is now"+stockprice);
	}

}
