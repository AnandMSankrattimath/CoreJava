package com.xworkz.collection.typesofcollection.set.DTO;

public class PostOfficeDTO implements Comparable<PostOfficeDTO> {
	
	int id;
	String postTypeString;
	
	public PostOfficeDTO(int id,String type) {
		this.id=id;
		this.postTypeString=type;
		
	}
	
	@Override
	public int compareTo(PostOfficeDTO dto) {
		return this.hashCode()-dto.hashCode();
	}
	
	@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public String toString() {
		return "PostOfficeDTO [id=" + id + ", postTypeString=" + postTypeString + "]";
	}
	
	

}
