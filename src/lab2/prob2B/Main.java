package lab2.prob2B;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Order order = new Order("13213213", LocalDate.now());
		//order.getListOrderlines().get(0).increaseLineNum();
		//order.getListOrderlines().get(1).increaseLineNum();
		order.addLine("Snickers", 1.58, 5);
		order.addLine("Banana", 2.58, 2);
		order.addLine("Cola", 3.45, 1);
		//not possible to create instance of an Item outside of a ShoppingCart
		System.out.println("Order contains the orderlines: " );
		for (int i = 0; i < order.getListOrderlines().size() ; i ++) {
			System.out.println( order.getListOrderlines().get(i));
		}
		
	}
}
