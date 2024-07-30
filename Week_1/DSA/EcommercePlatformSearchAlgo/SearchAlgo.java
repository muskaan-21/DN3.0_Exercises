package EcommercePlatformSearchAlgo;

public class SearchAlgo {
	
	//LINEAR SEARCH
	public static Product linearsearch(Product[] prod,String productName) {
		for(Product p:prod) {
			if(p.getproductname().equalsIgnoreCase(productName)) {
				return p;
			}
		}
		return null;
	}
	
	//BINARY SEARCH
	public static Product binarysearch(Product[] prod,String productName) {
		int left=0;
		int right=prod.length-1;
		while(left<=right) {
			int mid=left+(right-left)/2;
			int comp=prod[mid].getproductname().compareToIgnoreCase(productName);
			if(comp==0) {
				return prod[mid];
			}
			else if(comp<0) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		return null;
	}

}
