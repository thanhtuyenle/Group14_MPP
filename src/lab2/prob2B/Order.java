package lab2.prob2B;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
	private String orderNum;
	private LocalDate orderDate;
	private List<OrderLine> listOrderlines = new ArrayList<>();
		
	public Order(String orderNum, LocalDate orderDate) {
		super();
		this.orderNum = orderNum;
		this.orderDate = orderDate;
	}
	
	public void addLine(String lineName, double price, int quantity) {
		OrderLine line = new OrderLine(lineName, price, quantity, this);
		listOrderlines.add(line);
	}
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public List<OrderLine> getListOrderlines() {
		return listOrderlines;
	}
	public void setListOrderlines(List<OrderLine> listOrderlines) {
		this.listOrderlines = listOrderlines;
	}

	 @Override 
	 public String toString() { // TODO Auto-generated method stub
	 return listOrderlines.toString(); }
	
}
