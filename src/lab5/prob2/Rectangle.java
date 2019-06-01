package lab5.prob2;

public class Rectangle implements Figure{
	
	private final int width;
	private final int height;
	
	public Rectangle(int width, int height)
	{
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	@Override
	public double computeArea() {
		return width*height;
	}

}
