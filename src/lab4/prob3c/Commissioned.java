package lab4.prob3c;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee {
	private double commission;
	private double baseSalary;
	private List<Order> orders = new ArrayList<>();
	
	
	public Commissioned(String empId, double commission, double baseSalary, List<Order> orders) {
		super(empId);
		this.commission = commission;
		this.baseSalary = baseSalary;
		this.orders = orders;
	}

	@Override
	public double calcGrossPay(int month, int year) {
		double sumOrders = 0;
		for(Order order : orders) {
			LocalDate date = order.getOrderDate();
			
			if(date.getYear() == year && date.getMonthValue() == month) {
				sumOrders += order.getOrderAmount();
			}
		}
		
		return sumOrders * commission + baseSalary;
	}
}
