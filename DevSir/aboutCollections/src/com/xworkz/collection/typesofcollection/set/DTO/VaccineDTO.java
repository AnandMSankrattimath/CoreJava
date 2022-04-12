package com.xworkz.collection.typesofcollection.set.DTO;

public class VaccineDTO implements Comparable<VaccineDTO>{
	int id;
	String vaccine_NameString;
	
	
	public VaccineDTO(int id,String vaccineString) {
		this.id=id;
		this.vaccine_NameString=vaccineString;
	}
	
	@Override
	public int compareTo(VaccineDTO dto) {
		return this.hashCode()-dto.hashCode();
		}
	
	@Override
	public int hashCode() {
		return this.id;
	}
	
	@Override
	public String toString() {
		return "VaccineDTO [id=" + id + ", vaccine_NameString=" + vaccine_NameString + "]";
	}
	

}
