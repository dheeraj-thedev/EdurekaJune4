package co.edureka.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// Mapping is done in Java file rather than hbm file. 

@Entity
@Table(name="STUDENT")
public class Student {
	
	// Attributes
	
	@Id @GeneratedValue
	@Column(name="ROLL")
	Integer roll;
	
	@Column(name="NAME")
	String name;
	
	@Column(name="AGE")
	Integer age;
	
	public Student(){
		
	}
	
	public Student(Integer roll, String name, Integer age) {
		this.roll = roll;
		this.name = name;
		this.age = age;
	}

	public Integer getRoll() {
		return roll;
	}

	public void setRoll(Integer roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", age=" + age + "]";
	}
	
}
