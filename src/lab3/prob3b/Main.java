package lab3.prob3b;

public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle(5);
		System.out.println("Circle area: " + circle.computeArea());
		
		Cylinder cylinder = new Cylinder(10, 5);
		System.out.println("Cylinder volume: " + cylinder.computeVolume());
	}
}
