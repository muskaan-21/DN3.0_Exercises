package InventoryManagementSystem;

public class Product {
	private int productid;
	private String productName;
	private int quantity;
	private double price;
	public Product(int productid,String productName, int quantity, double price) {
		this.productid=productid;
		this.productName=productName;
		this.quantity=quantity;
		this.price=price;
		
	}
	public int getproductid() {
		return productid;
	}
	public String getproductname() {
		return productName;
	}
	public int getquantity() {
		return quantity;
	}
	public double getprice() {
		return price;
	}
	public void setproductid(int productid) {
		this.productid=productid;
	}
	public void setproductname(String productName) {
		this.productName=productName;
	}
	public void setquantity(int quantity) {
		this.quantity=quantity;
	}
	public void setprice(double price) {
		this.price=price;
	}
	public String toString() {
		return "Product{" +"productid: "+productid +", productname: "+productName + '\'' + ", quantity: "+quantity+", price: "+price+'}';
	}

}
