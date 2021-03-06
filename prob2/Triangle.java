package prob2;

public final class Triangle implements Figure {

	private final double base;
	private final double height;

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

	@Override
	public double computeArea() {

		double area = (1.0 / 2.0) * base * height;

		System.out.println(String.format("Area of the triangle is %,.2f", area));

		return area;

	}

}
