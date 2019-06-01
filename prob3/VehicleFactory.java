package prob3;

final public class VehicleFactory {
	private VehicleFactory() {
	};

	public static Vehicle getVehicle(String v) {
		switch (v) {
		case "Car":
			return new Car();
		case "Bus":
			return new Bus();
		case "Truck":
			return new Truck();
		case "Electric Car":
			return new ElectricCar();
		default:
			return null;
		}
	}
}
