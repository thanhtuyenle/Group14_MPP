package lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
	private List<Apartment> apartments = new ArrayList<>();
	private double maintenanceCost = 0;

	
	
	public Building(double maintenanceCost, List<Apartment> apartments) {
		super();
		this.maintenanceCost = maintenanceCost;
		this.apartments = apartments;
	}

	public double getMaintenanceCost() {
		return maintenanceCost;
	}


	public List<Apartment> getApartments() {
		return apartments;
	}	
	
	public double calcProfits(List<Apartment> listApp) {
		double sum = 0.0;
		for(Apartment a : listApp) {
			sum += a.getRent();
		}
		return sum - maintenanceCost;
	}
	
}
