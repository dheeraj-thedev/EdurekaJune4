package co.edureka.bean;

public class Employee {
	
	int eid;
	String name;
	int salary;
	String email;
	String designation;
	
	// Getters and Setters
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public void show(){
		
	}
	
	// Business Method
	public void allocateSeat(String dept, int floor, int seat){
		System.out.println("******Seat Allocation Start******");
		if(dept.equals("Admin")){
			seat++;
			System.out.println(name+" is allocated "+floor+" floor for dept "+dept+" with seat# "+seat);
		}else if(dept.equals("R&D")){
			seat--;
			System.out.println(name+" is allocated "+floor+" floor for dept "+dept+" with seat# "+seat);
		}else{
			System.out.println("No Dept Found !!");
		}
		System.out.println("******Seat Allocation Finish******");
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + ", email=" + email + ", designation="
				+ designation + "]";
	}
}
