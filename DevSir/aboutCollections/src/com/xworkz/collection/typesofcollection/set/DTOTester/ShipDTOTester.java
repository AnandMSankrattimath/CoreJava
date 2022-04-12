package com.xworkz.collection.typesofcollection.set.DTOTester;

import java.util.Set;
import java.util.TreeSet;

import com.xworkz.collection.typesofcollection.set.DTO.ShipDTO;

public class ShipDTOTester {
public static void main(String[] args) {
	
	Set treeSet = new TreeSet();
	
	treeSet.add(new ShipDTO(0, null, null));
	treeSet.add(new ShipDTO(1, null, null));
	treeSet.add(new ShipDTO(1, null, null));
	treeSet.add(new ShipDTO(2, null, null));
	
	
	
	for(Object object:treeSet) {
		System.out.println(object);
	}
	
}
}
