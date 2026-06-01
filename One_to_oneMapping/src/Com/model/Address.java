package Com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address {
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Id
	private int pincode;
	private String areaname;
	private String cityname;
	
	public String getAreaname() {
		return areaname;
	}
	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	
	

}
