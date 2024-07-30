package ObserverPatternExample;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {
	private List<Observer> observers;
	private String stockname;
	private double stockprice;
	public StockMarket(String stockname, double stockprice) {
		this.observers=new ArrayList<>();
		this.stockname=stockname;
		this.stockprice=stockprice;
	}
	public void register(Observer observer) {
		observers.add(observer);
	}
	public void deregister(Observer observer) {
		observers.remove(observer);
	}
	public void notifyobs() {
		for(Observer observer : observers) {
			observer.update(stockname,stockprice);
		}
		
	}
	public void setstockprice(double stockprice) {
		this.stockprice=stockprice;
		notifyobs();
	}
	

}
