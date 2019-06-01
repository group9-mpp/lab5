package prob2;

public final class Rectangle implements Figure {

	private final double width;
	private final double length;

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}

	@Override
	public double computeArea() {

		double area = width * length;

		System.out.println(String.format("Area of the rectangle is %,.2f", area));

		return area;
	}

}
