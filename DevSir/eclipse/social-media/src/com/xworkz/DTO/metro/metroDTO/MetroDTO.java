package com.xworkz.DTO.metro.metroDTO;

public class MetroDTO {
	
	private String sourcePoint;
	private String destinationPoint;
	private String timings;
	private int trainNo;
	
	public MetroDTO() {
		// TODO Auto-generated constructor stub
		System.out.println(getClass().getSimpleName()+" object is created");
	}
	
	public int getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}
	
	public String getSourcePoint() {
		return sourcePoint;
	}

	public void setSourcePoint(String sourcePoint) {
		this.sourcePoint = sourcePoint;
	}

	public String getDestinationPoint() {
		return destinationPoint;
	}

	public void setDestinationPoint(String destinationPoint) {
		this.destinationPoint = destinationPoint;
	}

	public String getTimings() {
		return timings;
	}

	public void setTimings(String timings) {
		this.timings = timings;
	}

	
	@Override
	public String toString() {
		return "MetroDTO [trainNo=" + trainNo + ", sourcePoint=" + sourcePoint + ", destinationPoint="
				+ destinationPoint + ", timings=" + timings + "]";
	}

	@Override
public int hashCode() {
	return trainNo;
}
	
@Override

public boolean equals(Object obj) {
	MetroDTO metro = (MetroDTO) obj;
	if (trainNo == metro.trainNo)
		return true;
	return false;
}
	
	

	
	
		
}
