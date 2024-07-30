package ObserverPatternExample;

public class TestObserver {

	public static void main(String[] args) {
		StockMarket applestock=new StockMarket("Apple", 500.0);
		Observer mbap=new MobileApp("Mobile App");
		Observer webap=new WebApp("Web App");
		applestock.register(mbap);
		applestock.register(webap);
		
		applestock.setstockprice(155.0);
		applestock.setstockprice(880.0);
		
		applestock.deregister(webap);
		applestock.setstockprice(660.0);
		
	}

}
