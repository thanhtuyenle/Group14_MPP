package lab3.prob3b;

public class Cylinder {
	private Circle circle;
	private double height;
	
	public Cylinder(double height, double radius) {
		circle = new Circle(radius);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}
	
	public double computeVolume() {
		return circle.computeArea() * height;
	}
	
}
