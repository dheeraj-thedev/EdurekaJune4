package co.edureka;

import org.springframework.beans.factory.annotation.Autowired;

public class Driver {

	Vehicle vehicle; // HAS-A Relation
	
	public Driver() {
		System.out.println("**Driver Object Constructed**");
	}

	public Vehicle getVehcile() {
		return vehicle;
	}

	@Autowired
	public void setVehcile(Vehicle vehicle) {
		System.out.println("**Vehicle Setter**");
		this.vehicle = vehicle;
	}
	
}
