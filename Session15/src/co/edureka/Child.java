package co.edureka;

public class Child extends Father{
	
	// Attributes
	int vehicles;
	String compName;
	
	public int getVehicles() {
		return vehicles;
	}
	public void setVehicles(int vehicles) {
		this.vehicles = vehicles;
	}
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	
	@Override
	public String toString() {
		return "Child [vehicles=" + vehicles + ", compName=" + compName + ", fname=" + fname + ", lname=" + lname
				+ ", money=" + money + "]";
	}
	
}
