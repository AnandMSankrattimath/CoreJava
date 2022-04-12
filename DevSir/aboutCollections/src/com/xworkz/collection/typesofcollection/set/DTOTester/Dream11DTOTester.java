package com.xworkz.collection.typesofcollection.set.DTOTester;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

import com.xworkz.collection.typesofcollection.set.DTO.Dream11DTO;

public class Dream11DTOTester {
public static void main(String[] args) {
	
	Set treeSet = new TreeSet();// creating tree set
	Collection rcbCollection = new ArrayList();// creating arryList of players from team RCB
	
	rcbCollection.add("Virat");
	rcbCollection.add("dinesh kartik");
	rcbCollection.add("Du plessy");
	rcbCollection.add("Maxmuller");
	rcbCollection.add("Devadutt Padikall");
	
	Collection cskCollection=new ArrayList();
	cskCollection.add("MSD");
	cskCollection.add("Jadeja");
	cskCollection.add("Bravo");
	cskCollection.add("Suresh Raina");
	cskCollection.add("Uttappa");
	
	
	treeSet.add(new Dream11DTO(2, "RCB",rcbCollection ));
	treeSet.add(new Dream11DTO(0, "CSK", cskCollection));
	
	for(Object object : treeSet) {
		System.out.println(object);
	}
	
}
}
