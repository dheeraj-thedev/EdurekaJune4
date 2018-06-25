package co.edureka;

public class Address {

	String adrsLine;
	int zipCode;
	String city;
	
	public String getAdrsLine() {
		return adrsLine;
	}
	public void setAdrsLine(String adrsLine) {
		this.adrsLine = adrsLine;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [adrsLine=" + adrsLine + ", zipCode=" + zipCode + ", city=" + city + "]";
	}
	
}
