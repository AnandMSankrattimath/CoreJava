package com.xworkz.collection.typesofcollection.set.DTO;



public class DVDDTO implements Comparable<DVDDTO> {
int id;
String capacityString;

public DVDDTO(int id,String capString) {
	this.id=id;
	this.capacityString=capString;
}

@Override
public int compareTo(DVDDTO dvddto) {
	return this.hashCode()-dvddto.hashCode();
	}

@Override
public int hashCode() {
	return this.id;
}

@Override
public String toString() {
	return "DVDDTO [id=" + id + ", capacityString=" + capacityString + "]";
}

}
