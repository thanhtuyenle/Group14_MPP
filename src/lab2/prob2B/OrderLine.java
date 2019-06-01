package lab2.prob2B;

public class OrderLine {

	private Order order;
	private String name;
	private int lineNum = 0 ;
	private double price;
	private int quantity;
	
	public int increaseLineNum() {
		lineNum ++;
		return lineNum;
	}
	public OrderLine(String name, double price, int quantity, Order order) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.order = order;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLineNum() {
		return lineNum;
	}
	public void setLineNum(int lineNumber) {
		this.lineNum = lineNumber;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: " + name + ", Price: " + price + ", Quantity: " + quantity ;
	}
	
	
}
