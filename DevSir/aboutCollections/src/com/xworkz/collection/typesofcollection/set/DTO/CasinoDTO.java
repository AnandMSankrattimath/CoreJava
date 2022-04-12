package com.xworkz.collection.typesofcollection.set.DTO;

public class CasinoDTO implements Comparable<CasinoDTO> {

	int id;
	double amount;
	String nameString;
	
	
	public CasinoDTO(int id,String namString,double amount){
		this.id=id;
		this.nameString=namString;
		this.amount=amount;
	}
	
	
	@Override
	public int hashCode() {
		return this.id;
	}
	
	@Override
	public int compareTo(CasinoDTO dto) {
		return this.hashCode()-dto.hashCode();
	}
	
	@Override
	public String toString() {
		return "CasinoDTO [ Id :"+id+" Name: "+nameString+" Amount: "+amount+"]";
	}
	
	
	
	
	
}
