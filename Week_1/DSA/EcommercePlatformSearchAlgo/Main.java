package EcommercePlatformSearchAlgo;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Product[] product= {
				new Product(1,"Laptop","Electorinics"),
				new Product(2,"Chair","Furniture"),
				new Product(3,"glass","Utensil"),
				new Product(4,"Headphone","Electornics")
		};
		Arrays.sort(product,(p1,p2) -> p1.getproductname().compareToIgnoreCase(p2.getproductname()));
		
		//linear search   O(n)
		Product foundprod=SearchAlgo.linearsearch(product, "glass");
		System.out.println("Linear search: "+foundprod );
		
		//binary search    O(logn)
		foundprod=SearchAlgo.binarysearch(product, "glass");
		System.out.println("Binary search: "+foundprod);
	}

}
