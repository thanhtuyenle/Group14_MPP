package lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//building 1
		Apartment apartmentA = new Apartment(200);
		Apartment apartmentB = new Apartment(300);
		Apartment apartmentC = new Apartment(400);
		
		List<Apartment> group1App = new ArrayList<Apartment>();
		group1App.add(apartmentA);
		group1App.add(apartmentB);
		group1App.add(apartmentC);
		
		Building buildingA = new Building(100, group1App);
		
		
		//building 2
		Apartment apartmentD = new Apartment(250);
		Apartment apartmentE = new Apartment(350);
		
		List<Apartment> group2App = new ArrayList<Apartment>();
		group2App.add(apartmentD);
		group2App.add(apartmentE);
		
		Building buildingB = new Building(200, group2App);
		
		List<Building> buildings = new ArrayList<Building>();
		buildings.add(buildingA);
		buildings.add(buildingB);
		Landlord landlord = new Landlord();
		landlord.setBuildings(buildings);
		System.out.println("landlord's monthly total profits: " + landlord.monthlyTotalProfit());
		
	}
	
}
