package lab3.prob4;

public class House extends Property {

	private int lotSize;
	
	public House(Address address, int lotSize) {
		super(address);
		this.lotSize = lotSize;
	}

	@Override
	public double computeRent() {
		return 0.1 * lotSize;
	}
	
}
