package prob3;

public class Main {

	public static void main(String[] args) {
		Vehicle myVehicle = VehicleFactory.getVehicle("Car");
		if (myVehicle != null)
			myVehicle.startEngine();

	}

}
