package lab3.prob3a;

public class Circle extends Cylinder {
	
	public Circle(double height, double radius) {
		super(height, radius);
	}
	
	public double computeArea() {
		return Math.PI * getRadius() * getRadius();
	}
}
