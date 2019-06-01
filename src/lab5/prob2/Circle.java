package lab5.prob2;

public final class Circle implements Figure{
	
	private final double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public double computeArea() {
		return radius * radius * Math.PI;
	}

}
