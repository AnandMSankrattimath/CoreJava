package com.xworkz.collection.aboutCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTester {
	public static void main(String[] args) {
		// collection stores the object type of data.
		Collection collection = new ArrayList();
		// add the data
		System.err.println("In collection1");
		collection.add(1);
		collection.add(2);
		collection.add(3);
		collection.add(4);
		System.out.println(collection.size());
		
		// to delete the data and can also any data from collection.
		
		collection.remove(1);
		System.out.println(collection.size());
		
		// collection can store any type of data i.e dynamic data
		
		collection.add("anand");
		System.out.println(collection.size());
		
		collection.add(123);
		collection.add(9740935575l);
		collection.add("Manish is founder of gOOgle");
		/*collection.add(1.3333f);
		collection.add(1.333333);
		collection.add('c');
		collection.add(true);
		collection.add(false);
		collection.add(collection);
		
		CollectionTester c1 = new CollectionTester();
		collection.add(c1);
		collection.add(args);
		collection.add(null);*/
		System.out.println(collection.size());
		
		
		//fetching the objects from collection
		
		// for each loop
		// for each is not a method...
		System.out.println("Fecthing the data with the for each loop");
		for(Object object : collection) {
			System.out.println(object);
		}
		//OR 
		/*System.out.println("Fecthing the data with the for each() ");
		collection.forEach(System.out::println);*/
		
		System.err.println("In collection2");
		Collection collection2 = new ArrayList(); // creating another collection
		System.out.println(collection2.isEmpty());
		System.err.println("After addAll()");
		collection2.addAll(collection);
		System.err.println(" adding individual object");
		collection2.add("anand");
		collection2.add(123);
		System.out.println(collection2.isEmpty());
		
		for (Object object : collection2) {
			System.out.println(object);
		}
		collection2.removeAll(collection2);
		
		
		System.err.println("After removeAll()");
		System.err.println(collection2.isEmpty()+" checking the collection isEmpty or not");
		for (Object object : collection2) {
			System.out.println(object);
		}
		
		//converting one collection to array
		System.err.println("converting collection to array Object obj[] = collectin.toArray()");
		Object obj[] = collection.toArray();
		System.err.println("fetching data from array ");
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
		
		 
		
		
		
		// contains all
		System.err.println(" contains operations");
		//System.out.println(collection.containsAll(null));
		
		
		//updating the collection
		
	}

}
