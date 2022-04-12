package com.xworkz.collection.typesofcollection.set.DTOTester;

import java.util.Set;
import java.util.TreeSet;

import com.xworkz.collection.typesofcollection.set.DTO.DVDDTO;

public class DVDDTOTester {
public static void main(String[] args) {
	
	Set treeSet = new TreeSet();
	 treeSet.add(new DVDDTO(0, null));
	 treeSet.add(new DVDDTO(0, null));
	 treeSet.add(new DVDDTO(-1, null));
	 
	 for (Object object : treeSet) {
		System.out.println(object);
	}
	
}

}
