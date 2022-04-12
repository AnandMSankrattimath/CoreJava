package com.xworkz.collection.typesofcollection.set.implementedclassesofset;

import java.util.Set;
import java.util.TreeSet;

import com.xworkz.collection.typesofcollection.set.DTO.SampleDTO;

public class TreeSetImpl {
public static void main(String[] args) {
	// for sorting alpabetical order. similar type of object.
	// calls treemap()
	// stores the object which is comparable type.
	//comparable in java -- It is an interface.  comparable is in java.lang package.
	// to sort the list in ascending order.
	// string by deafualt implements compable interface.
	// comparable has compareTo() -- 
	
	Set treeSet = new TreeSet();
	treeSet.add(new SampleDTO(1));
	treeSet.add(new SampleDTO(3));
	treeSet.add(new SampleDTO(2));
	treeSet.add(new SampleDTO(5));
	treeSet.add(new SampleDTO(4));
	
	for (Object object : treeSet) {
		System.out.println(object);
	}
}
}
