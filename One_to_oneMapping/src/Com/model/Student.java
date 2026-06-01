package Com.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
	@Id
	private int rollno;
	private String name;
	@OneToOne(cascade = CascadeType.ALL)
	private Address adddr;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAdddr() {
		return adddr;
	}
	public void setAdddr(Address adddr) {
		this.adddr = adddr;
	}
	
}
