package com.xworkz.collection.typesofcollection.set.DTOTester;

import java.util.TreeSet;
import java.util.function.ObjDoubleConsumer;

import com.xworkz.collection.typesofcollection.set.DTO.SwiggyDTO;

public class SwiggyDTOTester {
public static void main(String[] args) {
	
	TreeSet treeSet = new TreeSet();
	
	treeSet.add(new SwiggyDTO(0, null));
	treeSet.add(new SwiggyDTO(1, null));
	treeSet.add(new SwiggyDTO(-1, null));
	
	
	for (Object object : treeSet) {
		System.out.println(object);
	}
	
}
}
