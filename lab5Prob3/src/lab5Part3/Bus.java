package lab5Part3;

public class Bus implements Vehicle {

	@Override
	public void startEngine() {
		System.out.print(getClass().getSimpleName());
	}

	

}
