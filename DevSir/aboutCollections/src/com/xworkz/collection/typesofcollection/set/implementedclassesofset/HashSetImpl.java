package com.xworkz.collection.typesofcollection.set.implementedclassesofset;

import java.util.HashSet;
import java.util.Set;

public class HashSetImpl {
public static void main(String[] args) {
	Set collectionSet = new HashSet();
	// set is a subinterface and not ordered takes null in only single time.
	for (int i = 1; i <= 30; i++) {
		collectionSet.add(i);
	}
	for (int i = 'a'; i <='z'; i++) {
		collectionSet.add(i);
	}
	
	
	
	collectionSet.add('A');
	collectionSet.add('B');
	for (Object object : collectionSet) {
		System.out.println(object);
	}
	
}
}
