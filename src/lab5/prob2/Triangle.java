package lab5.prob2;

public class Triangle implements Figure{
	private final int base;
	private final int height;
	
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	public int getBase() {
		return base;
	}

	public int getHeight() {
		return height;
	}

	@Override
	public double computeArea() {
		return 1/2 * base * height;
	}

}
