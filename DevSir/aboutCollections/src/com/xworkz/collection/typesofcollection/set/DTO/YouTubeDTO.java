package com.xworkz.collection.typesofcollection.set.DTO;

public class YouTubeDTO implements Comparable<YouTubeDTO> {
private int id;
private String channel_NameString;

public YouTubeDTO(int id,String name) {
	this.id=id;
	this.channel_NameString=name;
	
}


@Override
public int compareTo(YouTubeDTO dto) {
	return this.hashCode()-dto.hashCode();
}


@Override
public int hashCode() {
	return this.id;
}


@Override
public String toString() {
	return "YouTubeDTO [id=" + id + ", channel_NameString=" + channel_NameString + "]";
}


}
