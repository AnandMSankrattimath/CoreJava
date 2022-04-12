package com.xworkz.collection.typesofcollection.set.DTO;

import java.util.function.IntConsumer;

public class PoliticianDTO implements Comparable<PoliticianDTO >{

private int id;
private String constuiencyString;


public PoliticianDTO(int id,String constuienyString){
this.id=id;
this.constuiencyString=constuienyString;

}


@Override
public int compareTo(PoliticianDTO dto) {
	return this.hashCode()-dto.hashCode();
	
}

@Override
public int hashCode() {
	
	return this.id;
	
}


@Override
public String toString() {
	return "PoliticianDTO [id=" + id + ", constuiencyString=" + constuiencyString + "]";
}

}
