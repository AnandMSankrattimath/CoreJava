package com.xworkz.collection.typesofcollection.set.DTO;

public class ShipDTO implements Comparable<ShipDTO>{
int ship_id;
String nameString;
String typeString;

public ShipDTO(int id,String nameString,String typeString) {
	this.ship_id=id;
	this.nameString=nameString;
	this.typeString=typeString;
	
}

@Override
public int compareTo(ShipDTO dto) {
	return this.hashCode()-dto.hashCode();
	
}

@Override
public int hashCode() {
	return ship_id;
}

@Override
public String toString() {
	return "ShipDTO [ Ship_id : "+ship_id+ " Ship_Name: "+nameString+ " Ship_Type : "+typeString+"]";
}


}
