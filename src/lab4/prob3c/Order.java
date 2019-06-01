package lab4.prob3c;

import java.time.LocalDate;

public class Order {
	private String orderNo;
	private LocalDate orderDate;
	private double orderAmount;
	
	public Order(String orderNo, LocalDate orderDate, double orderAmount) {
		super();
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public double getOrderAmount() {
		return orderAmount;
	}
	
	
}
