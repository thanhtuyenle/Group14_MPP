package lab3.prob4;

import java.util.List;

public class Admin {
	
	public static double computeTotalRent(List<Property> properties) {
		double totalRent = 0;
		
		for(Property prop : properties) {
			totalRent += prop.computeRent();
		}
		return totalRent;
	}
}
