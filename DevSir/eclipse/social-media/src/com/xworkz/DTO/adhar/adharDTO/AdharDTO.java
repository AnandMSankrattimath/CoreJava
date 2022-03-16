package com.xworkz.DTO.adhar.adharDTO;

public class AdharDTO {
	private String name;
	private String dob;
	private String address;
	private int id;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AdharDTO() {
		System.out.println(getClass().getSimpleName()+" class object is created");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString(){
		return "AdharDTO Details "
				+ "Name : " + name +""
						+ "  DOB : "+dob 
								+ "  Address : "+ address +"  ";
						
				
	}
	
	@Override
	public int hashCode() {
		return id;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		AdharDTO a1 = (AdharDTO)obj;
		System.out.println("HashCode "+id + "a1.id "+a1.id);
		if (id==a1.id)
			
			return true;
		return false;
	}
	
	
	

}
