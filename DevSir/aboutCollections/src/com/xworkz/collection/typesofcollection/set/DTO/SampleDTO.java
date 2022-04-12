package com.xworkz.collection.typesofcollection.set.DTO;

public class SampleDTO implements Comparable<SampleDTO>{
	private int id;
	
	public SampleDTO(int id) {
		this.id=id;
	}
	
	@Override
	public int compareTo(SampleDTO dto) {
		return this.hashCode()-dto.hashCode();// - (subtract) is used comapre one value to another value.
		// return this.id-dto.id;
	}
	
	@Override
	public int hashCode() {
		return this.id;
	}
	
	@Override
	public String toString() {
		return "Sample DTO [id : "+id+ " ]";
	}
}
