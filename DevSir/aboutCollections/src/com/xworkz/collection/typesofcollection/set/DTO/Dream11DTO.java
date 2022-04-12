package com.xworkz.collection.typesofcollection.set.DTO;

import java.util.Collection;

public class Dream11DTO implements Comparable<Dream11DTO>{
	
	int id;
	String teamNameString;
	Collection playerCollection;
	
	public Dream11DTO(int id,String namString,Collection playerCollection) {
		this.id=id;
		this.teamNameString=namString;
		this.playerCollection=playerCollection;
	}
	
	
	@Override
	public int hashCode() {
		return this.id;
	}
	
	@Override
	public int compareTo(Dream11DTO dream11dto) {
		return this.hashCode()-dream11dto.hashCode();
		}

	@Override
	public String toString() {
		return "Dream11DTO [id=" + id + ", Team Name=" + teamNameString + ", PlayerList=" + playerCollection
				+ "]";
	}
	
}
