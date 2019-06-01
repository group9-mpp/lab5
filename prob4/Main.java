package prob4;

import java.time.LocalDate; 

public class Main {
	public static void main(String[] args) {
		
		Customer cust = Customer.getNewCustomer("Bob");
		Order order = Order.newOrder(cust, LocalDate.now());
		order.addItem("Shirt");
		order.addItem("Laptop");

		//System.out.println(cust.getOrders());

		order = Order.newOrder(cust, LocalDate.now());
		order.addItem("Pants");
		order.addItem("Knife set");

		System.out.println(cust.getOrders());
		
	}
}
