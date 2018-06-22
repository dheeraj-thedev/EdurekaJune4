package co.edureka.model;

public class Product {

	Integer pid;
	String name;
	String brand;
	Integer price;
	
	public Product(){
		
	}
	
	public Product(Integer pid, String name, String brand, Integer price) {
		this.pid = pid;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
}
