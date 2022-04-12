package com.xworkz.collection.typesofcollection.set.DTO;


public class PaintDTO implements Comparable<PaintDTO>{
	
 int color_id;
 String color_NameString;
 
 public PaintDTO(int id,String name) {
	 this.color_id=id;
	 this.color_NameString=name;
 }
 
 @Override
 
 public int compareTo(PaintDTO dto) {
	 return this.hashCode()-dto.hashCode();
 }
 
 @Override
 public int hashCode() {
	 return this.color_id;
	 
 }
 
 @Override
public String toString() {
	return "PaintDTO [color_id=" + color_id + ", color_Name=" + color_NameString + "]";
}

}
