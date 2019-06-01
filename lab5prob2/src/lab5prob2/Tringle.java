package lab5prob2;

public final class Tringle implements Figure {

	private final double base;
	private final double height;
	
	public Tringle(double base, double height) {
		super();
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
		// TODO Auto-generated method stub
		return  1/2 * base * height;
	}
	

}
