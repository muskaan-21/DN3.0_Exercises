package SortingCustomerorder;

import java.util.List;

public class Bubblesort {
	public static void bsort(List<Order> orders) {
		int n=orders.size();
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(orders.get(j).gettotalprice()>orders.get(j+1).gettotalprice()) {
					Order ord=orders.get(j);
					orders.set(j, orders.get(j+1));
					orders.set(j+1, ord);
				}
			}
		}
	}

}
