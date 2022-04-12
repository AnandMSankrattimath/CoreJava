package com.xworkz.collection.typesofcollection.set.DTOTester;

import java.util.TreeSet;

import com.xworkz.collection.typesofcollection.set.DTO.PostOfficeDTO;

public class PostOfficeDTOTester {
public static void main(String[] args) {
	
	TreeSet treeSet = new TreeSet();
	
	treeSet.add(new PostOfficeDTO(-1, null));
	treeSet.add(new PostOfficeDTO(1, null));
	treeSet.add(new PostOfficeDTO(0, null));
	
	
	for (Object object : treeSet) {
		System.out.println(object);
	}
}
}
