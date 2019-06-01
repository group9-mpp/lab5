package prob2;

public final class Circle implements Figure {

	private final double radius;
	
	
	public Circle(double radius) {
		this.radius = radius;
	}


	public double getRadius() {
		return radius;
	}


	@Override
	public double computeArea() {
	
		double area = Math.PI * radius * radius;

		System.out.println(String.format("Area of the circle is %,.2f", area));

		return area;
 
	}

}
