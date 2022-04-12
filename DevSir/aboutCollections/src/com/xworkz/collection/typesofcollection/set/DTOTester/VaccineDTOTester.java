package com.xworkz.collection.typesofcollection.set.DTOTester;

import java.util.Set;
import java.util.TreeSet;

import com.xworkz.collection.typesofcollection.set.DTO.VaccineDTO;

public class VaccineDTOTester {
	public static void main(String[] args) {
		
		Set treeSet = new TreeSet();
		
		treeSet.add(new VaccineDTO(1, "Co-Vaxine"));
		treeSet.add(new VaccineDTO(-1, "covieShield"));
		treeSet.add(new VaccineDTO(0, null));
		treeSet.add(new VaccineDTO(0, null));
		
		
		for (Object object : treeSet) {
			System.out.println(object);
		}
	}

}
