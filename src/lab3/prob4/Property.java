package lab3.prob4;

public abstract class Property {

	private Address address;
	
	public Property(Address address) {
		super();
		this.address = address;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public abstract double computeRent();
	
}
