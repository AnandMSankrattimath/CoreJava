package com.xworkz.garbagecollector;

public class GarbageCollector {
	public static void main(String[] args) {
		GarbageCollector gCollector = new GarbageCollector();
		System.out.println(gCollector);
		GarbageCollector gCollector2 = new GarbageCollector();
		GarbageCollector gCollector3 = new GarbageCollector();
		GarbageCollector gCollector4=null; // minor gc 
		System.out.println(gCollector4);
		System.gc(); // manually calling minor gc
	}

}
