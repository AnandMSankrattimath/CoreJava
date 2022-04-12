package com.xworkz.collection.typesofcollection.set.DTOTester;

import java.util.Set;
import java.util.TreeSet;

import com.xworkz.collection.typesofcollection.set.DTO.CasinoDTO;

public class CasinoDTOTester {
public static void main(String[] args) {
	Set treeSet = new TreeSet();
	
	/*treeSet.add(3);
	treeSet.add(4);
	treeSet.add(1);
	treeSet.add(5);
	treeSet.add(2);*/
	
	treeSet.add(new CasinoDTO(1, "Anand", 44.22));
	treeSet.add(new CasinoDTO(3, "Manish", 33.22));
	treeSet.add(new CasinoDTO(5, "Tulasi", 22.22));
	treeSet.add(new CasinoDTO(2, "Manohar", 22.2));
	treeSet.add(new CasinoDTO(4, "Anand ms ", 1.1));
	
	for( Object obj:treeSet)
		System.out.println(obj);
	
}
}