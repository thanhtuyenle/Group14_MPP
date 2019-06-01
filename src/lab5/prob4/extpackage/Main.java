package lab5.prob4.extpackage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lab5.prob4.CustOrderFactory;
import lab5.prob4.Customer;
import lab5.prob4.CustomerAndOrder;

public class Main {
	public static void main(String[] args) {
		
		List<Customer> customers = new ArrayList<Customer>();
		
		List<String> itemsA = Arrays.asList("Shirt", "Laptop");
		CustomerAndOrder customerAndOrderA = CustOrderFactory.createCustomerOrders("Bod", LocalDate.now(), itemsA);
		customers.add(customerAndOrderA.getCustomer());
		
		List<String> itemsB = Arrays.asList("Pants", "Knife Set");
		CustomerAndOrder customerAndOrderB = CustOrderFactory.createCustomerOrders("Bod", LocalDate.now(), itemsB);
		customers.add(customerAndOrderB.getCustomer());
		
		for(Customer cust: customers) {
			System.out.println(cust.getOrders());
		}
	}
}

		
