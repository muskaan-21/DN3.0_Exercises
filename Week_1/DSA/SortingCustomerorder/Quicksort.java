package SortingCustomerorder;

import java.util.List;

public class Quicksort {
	public static void qsort(List<Order> orders) {
		quick(orders,0,orders.size()-1);
	}
	private static void quick(List<Order> orders,int low,int high) {
		if(low<high) {
			int pi=partition(orders,low,high);
			quick(orders,low,pi-1);
			quick(orders,pi+1,high);
		}
	}
	private static int partition(List<Order> orders,int low,int high) {
		int i=low-1;
		for(int j=low;j<high;j++) {
			double pivot = 0;
			if(orders.get(j).gettotalprice()<pivot) {
				i++;
				Order temp=orders.get(i);
				orders.set(i, orders.get(j));
				orders.set(j, temp);
			}
		}
		Order temp=orders.get(i+1);
		orders.set(i+1, orders.get(high));
		orders.set(high, temp);
		return i+1;
	}
	

}
