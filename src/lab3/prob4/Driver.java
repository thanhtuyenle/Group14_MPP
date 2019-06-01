package lab3.prob4;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {

		Address addr1 = new Address("Street name 1", "Fairfield", "Iowa", "52557");
		Address addr2 = new Address("Street name 2", "Chicago", "Illinois", "265126");
		Address addr3 = new Address("Street name 3", "Des Moines", "Iowa", "529845");
		
		List<Property> properties = new ArrayList<>();
		
		Property house = new House(addr1, 10);
		Property condo = new Condo(addr2, 3);
		Property trailer = new Trailer(addr3);
		properties.add(house);
		properties.add(condo);
		properties.add(trailer);
		
		double totalRent = Admin.computeTotalRent(properties);
		System.out.println(totalRent);
	}
}
