package EcommercePlatformSearchAlgo;

public class Product {
	private int productId;
	private String productName;
	private String category;
	//constructor
	public Product(int productId, String productName,String category) {
		this.productId=productId;
		this.productName=productName;
		this.category=category;
	}
	
	//getter & settor methods
	public int getproductid() {
		return productId;
	}
	public void setproductid(int productId) {
		this.productId=productId;
	}
	public String getproductname() {
		return productName;
	}
	public void setproductname(String productName) {
		this.productName=productName;
	}
	public String getcategory() {
		return category;
	}
	public void setcategory(String category) {
		this.category=category;
	}
	
	public String toString() {
		return "Product{" +"productid: "+productId+", productname: "+productName+", caegory: "+category +'\'' + '}';
	}

}
