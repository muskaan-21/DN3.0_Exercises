package SortingCustomerorder;

public class Order {
	private int orderId;
	private String customerName;
	private double totalPrice;
	public Order(int orderId,String orderName,double orderPrice, String customerName, double totalPrice) {
		this.orderId=orderId;
		this.customerName=customerName;
		this.totalPrice=totalPrice;
	}
	public int getorderid() {
		return orderId;
	}
	public String getordername() {
		return customerName;
	}
	public double gettotalprice() {
		return totalPrice;
	}
	public String toString() {
		return "Order{" +" orderid : "+orderId+", customername : "+customerName+", totalprice : "+totalPrice+'}';
	}

}
