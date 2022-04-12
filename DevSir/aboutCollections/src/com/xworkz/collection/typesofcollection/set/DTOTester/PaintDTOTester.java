package com.xworkz.collection.typesofcollection.set.DTOTester;

import java.util.Set;
import java.util.TreeSet;

import com.xworkz.collection.typesofcollection.set.DTO.PaintDTO;

public class PaintDTOTester {
	public static void main(String[] args) {
		
		Set treeSet = new TreeSet();
		
		treeSet.add(new PaintDTO(0, null));
		treeSet.add(new PaintDTO(-1, null));
		treeSet.add(new PaintDTO(-2, "Red"));
		treeSet.add(new PaintDTO(-3, "Blue"));
		treeSet.add(new PaintDTO(-4, "Green"));
		
		
		
		
		for (Object object : treeSet) {
			System.out.println(object);
		}
		
	}

}
