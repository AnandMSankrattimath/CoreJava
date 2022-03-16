package com.xworkz.DTO.hospital.hospitalDTO;

public class HospitalDTO {
	private int noOfPatient;
	private int noOfDoctors;
	private int noOfCounters;
	private int charges;
	
	public HospitalDTO() {
		System.out.println(getClass().getSimpleName()+" object is created");
	}

	public int getNoOfPatient() {
		return noOfPatient;
	}

	public void setNoOfPatient(int noOfPatient) {
		this.noOfPatient = noOfPatient;
	}

	public int getNoOfDoctors() {
		return noOfDoctors;
	}

	public void setNoOfDoctors(int noOfDoctors) {
		this.noOfDoctors = noOfDoctors;
	}

	public int getNoOfCounters() {
		return noOfCounters;
	}

	public void setNoOfCounters(int noOfCounters) {
		this.noOfCounters = noOfCounters;
	}

	public int getCharges() {
		return charges;
	}

	public void setCharges(int charges) {
		this.charges = charges;
	}
	
	
	public String toString() {
		return "No of Patients : "+noOfPatient+ " , No of Doctors : "+noOfDoctors+ " ,No of Counters :"+noOfCounters+" , Charges : "+charges;
	}
	
	@Override
	public int hashCode() {
		return noOfPatient;
	}
	
	@Override
	public boolean equals (Object obj) {
		HospitalDTO h1 = (HospitalDTO)obj;
		if(noOfPatient == noOfDoctors)
			return true;
		return false;
	}

}
