package lab5.prob4;

import java.time.LocalDate;
import java.util.List;

final public class CustOrderFactory {
	private CustOrderFactory() {
		
	}

	public static CustomerAndOrder createCustomerOrders(String name, LocalDate locDate, List<String> items) {
		Customer newCustomer = new Customer(name);
		Order newOrder = Order.newOrder(newCustomer, locDate);
		for(String item : items) {
			newOrder.addItem(item);
		}
		return new CustomerAndOrderImpl(newCustomer,newOrder);
	}
}
