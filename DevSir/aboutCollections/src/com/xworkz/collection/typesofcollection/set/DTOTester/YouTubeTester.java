package com.xworkz.collection.typesofcollection.set.DTOTester;

import java.util.TreeSet;

import com.xworkz.collection.typesofcollection.set.DTO.YouTubeDTO;

public class YouTubeTester {
public static void main(String[] args) {
	
	TreeSet treeSet = new TreeSet();
	
	treeSet.add(new YouTubeDTO(-1, "Telusko"));
	treeSet.add(new YouTubeDTO(0, "Smart Programming"));
	treeSet.add(new YouTubeDTO(1, "RATAN IT"));
	
	
	for (Object object : treeSet) {
		System.out.println(object);
	}
	
}
}
