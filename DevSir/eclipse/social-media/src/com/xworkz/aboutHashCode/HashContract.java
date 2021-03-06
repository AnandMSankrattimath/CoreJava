package com.xworkz.aboutHashCode;

public class HashContract {

	private int id;
	private String nameString;
	
	public HashContract() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	
	@Override 
	/*public boolean equals(Object obj) {
		if(obj == null || getClass() != obj.getClass()) {
			return false;
		}
		if(obj == this) {
			return true;
		}
		HashContract h = (HashContract)obj;
		return (this.getId() == h.getId());*/
	public boolean equals(Object obj) {
		HashContract h = (HashContract)obj;
		if(this.nameString == h.nameString) 
			return true;
		if(this.hashCode() == h.hashCode()) // HashCode contract.....
			return true;
	
		return false;
	}
	

}
