package lab5.prob2;


public class Main {

	public static void main(String[] args) {
		Figure[] shapes = {
				new Rectangle(12,16), new Circle(33), new Triangle(53,32)
		};
		
		double sum_areas = 0;
		for(Figure shape: shapes)
		{
			sum_areas += shape.computeArea();
		}
		
		System.out.println("Sum of Areas = " + sum_areas);

	}

}
