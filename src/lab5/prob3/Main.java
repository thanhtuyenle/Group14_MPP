package lab5.prob3;

public class Main {
	public static void main(String[] args) {
		Vehicle[] vehicles = {VehicleFactory.getVehicle("bus"), 
				VehicleFactory.getVehicle("car"), 
				VehicleFactory.getVehicle("electriccar"), 
				VehicleFactory.getVehicle("truck")};
		
		for(Vehicle v : vehicles) {
			v.startEngine();
		}
	}
}
