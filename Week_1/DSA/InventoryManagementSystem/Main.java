package InventoryManagementSystem;

public class Main {

	public static void main(String[] args) {
		InventoryManager im=new InventoryManager();
		Product p1=new Product(1, "Laptop", 10, 10000.0);
		Product p2=new Product(2, "MacBook",20, 290000.9);
		im.addproduct(p1);
		im.addproduct(p2);
		
		//update
		Product updatep1=new Product(1,"Laptop",30,39990.0);
		im.updateproduct(updatep1);
		
		//delete
		im.deleteproduct(2);
		
		//display
		im.displayproduct();
	}

}
