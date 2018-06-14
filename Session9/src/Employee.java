public class Employee {
	
	int eid;
	String name;
	int salary;
	
	public Employee(){
		
	}
	
	public Employee(int eid, String name, int salary) {
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
