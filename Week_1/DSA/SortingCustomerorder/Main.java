package SortingCustomerorder;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Order> orders=new ArrayList<>();
		orders.add(new Order(1,"Ali",300.0, null, 0));
		orders.add(new Order(2,"Bob",800.0, null, 0));
		orders.add(new Order(3,"Harsh",500.0, null, 0));
		
		System.out.println("Orginal Order");
		for(Order order: orders) {
			System.out.println(order);
		}
		
		List<Order> bso=new ArrayList<>(orders);
		Bubblesort.bsort(bso);
		System.out.println("bubble sort:");
		for(Order order: bso) {
			System.out.println(order);
		}
		
		List<Order> qso=new ArrayList<>(orders);
		Quicksort.qsort(qso);
		System.out.println("Quick sort: ");
		for(Order order: qso) {
			System.out.println(order);
		}

	}

}
