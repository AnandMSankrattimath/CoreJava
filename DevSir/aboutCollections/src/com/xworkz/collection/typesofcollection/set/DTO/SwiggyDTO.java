package com.xworkz.collection.typesofcollection.set.DTO;

public class SwiggyDTO implements Comparable<SwiggyDTO> {

	
	private int id;
	private String order_nameString;
	
	public SwiggyDTO(int id,String orderString) {
		this.id=id;
		this.order_nameString=orderString;
	}
	
	@Override
	public int compareTo(SwiggyDTO dto) {
		return this.hashCode()-dto.hashCode();
	}
	
	@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public String toString() {
		return "SwiggyDTO [id=" + id + ", order_nameString=" + order_nameString + "]";
	}
	
}
