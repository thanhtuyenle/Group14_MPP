package lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class Landlord {
	private List<Building> buildings = new ArrayList<Building>();

	public List<Building> getBuildings() {
		return buildings;
	}

	public void setBuildings(List<Building> building) {
		this.buildings = building;
	}
	public double monthlyTotalProfit() {
		double sumProfit = 0.0;
		for(Building b : buildings) {
			sumProfit += b.calcProfits(b.getApartments());
		}
		return sumProfit;
	}

}
