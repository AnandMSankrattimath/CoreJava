package com.xworkz.aboutHashCode;



import com.xworkz.adhar.adharDTO.AdharDTO;

public class AdharInfo {

	private int adharId; // HashCode is a unique number of a class property.By default it returns the memory address of the object.
	private String name;
	private String address;
	
	public AdharInfo() {
		
	}

	public int getAdharId() {
		return adharId;
	}

	public void setAdharId(int adharId) {
		this.adharId = adharId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public int hashCode() {
		
		return adharId;
	}

	@Override
	public String toString() {
		return "AdharInfo [adharId=" + adharId + ", name=" + name + ", address=" + address + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		AdharInfo a2 = (AdharInfo)obj;
		if(this.hashCode() == a2.hashCode()) {
		      return true;
		}
		if(this.adharId == a2.adharId) {
		      return true;
		}
		return false;
	}

	
	
	
	
}
