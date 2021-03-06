package com.xworkz.DTO.brtc.brtcDTO;

public class BrtcDTO {
	private int busNo;
	private String destinationPoint;
	private String sourcePoint;
	private String route;
	
	public BrtcDTO() {
		System.out.println(getClass().getSimpleName()+" object is created");
	}

	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}

	public String getDestinationPoint() {
		return destinationPoint;
	}

	public void setDestinationPoint(String destinationPoint) {
		this.destinationPoint = destinationPoint;
	}

	public String getSourcePoint() {
		return sourcePoint;
	}

	public void setSourcePoint(String sourcePoint) {
		this.sourcePoint = sourcePoint;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}
	
	@Override
	public String toString() {
		return "Bus No = " +busNo+ " ,Route = "+route+" ,From = "+sourcePoint+ ", To = "+destinationPoint;
	}

	@Override
	
	public int hashCode() {
		System.out.println("in Hashcode "+busNo);
		return busNo;
	}
	
	@Override
	public boolean equals(Object obj) {
		BrtcDTO br1 = (BrtcDTO)obj;
		
		System.out.println("in equals "+br1.busNo); // br1 object has the recent initialized value.
		if (busNo == br1.busNo)
		return true;
		
		return false;
		
	}
		
		
	}


