package com.xworkz.collection.typesofcollection.set.DTOTester;

import java.util.TreeSet;

import com.xworkz.collection.typesofcollection.set.DTO.PoliticianDTO;

public class PoliticianDTOTester {
	public static void main(String[] args) {
		
		TreeSet treeSet = new TreeSet();
		
		treeSet.add(new PoliticianDTO(-1, "jamakhandi"));
		treeSet.add(new PoliticianDTO(0, "Kudachi"));
		treeSet.add(new PoliticianDTO(1, "Athani"));
		
		for (Object object : treeSet) {
			System.out.println(object);
		}
	}

}
