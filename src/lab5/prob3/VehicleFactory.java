package lab5.prob3;

public class VehicleFactory {

	
	private VehicleFactory() {
	}

	public static Vehicle getVehicle(String s) {
		Vehicle v = null;
		switch(s) {
		case "bus":
			v = new Bus();
			break;
		case "truck":
			v = new Truck();
			break;
		case "car":
			v = new Car();
			break;
		case "electriccar":
			v = new ElectricCar();
			break;
		}
		return v;
	}
}
