package com.xworkz.DTO.railway;

public class RailwayDTO {
	private int trainNo;
	private String trainNameString;
	private String sourcePointString;
	private String destinationString;
	
	public RailwayDTO() {
		// TODO Auto-generated constructor stub
		System.out.println(getClass().getSimpleName()+" object is created");
	}

	public int getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}

	public String getTrainNameString() {
		return trainNameString;
	}

	public void setTrainNameString(String trainNameString) {
		this.trainNameString = trainNameString;
	}

	public String getSourcePointString() {
		return sourcePointString;
	}

	public void setSourcePointString(String sourcePointString) {
		this.sourcePointString = sourcePointString;
	}

	public String getDestinationString() {
		return destinationString;
	}

	public void setDestinationString(String destinationString) {
		this.destinationString = destinationString;
	}

	@Override
	public String toString() {
		return "RailwayDTO [trainNo=" + trainNo + ", trainNameString=" + trainNameString + ", sourcePointString="
				+ sourcePointString + ", destinationString=" + destinationString + "]";
	}
	
	
	@Override
	
	public int hashCode() {
		return trainNo;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		RailwayDTO rail1 = (RailwayDTO)obj;
		if (trainNo == rail1.getTrainNo())
			return true;
		return false;
	}

}
