package lab5prob2;

public final class Circle implements Figure {

	private final double radius;
	
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}


	public double getRadius() {
		return radius;
	}


	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return  Math.PI * radius * radius ;
	}

}