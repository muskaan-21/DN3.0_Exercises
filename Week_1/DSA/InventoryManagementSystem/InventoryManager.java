package InventoryManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
	//using HashMap
	private Map<Integer, Product> inventory;
	public InventoryManager() {
		this.inventory=new HashMap<>();
		
	}
	public void addproduct(Product prod) {
		inventory.put(prod.getproductid(), prod);
	}
	public void updateproduct(Product prod) {
		inventory.put(prod.getproductid(), prod);
	}
	public void deleteproduct(int productid) {
		inventory.remove(productid);
	}
	public Product getproduct(int productid) {
		return inventory.get(productid);
	}
	public void displayproduct() {
		for(Product pro: inventory.values()) {
			System.out.println(pro);
		}
	}

}
