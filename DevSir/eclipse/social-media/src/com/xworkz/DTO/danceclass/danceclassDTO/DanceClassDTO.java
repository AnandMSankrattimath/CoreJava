package com.xworkz.DTO.danceclass.danceclassDTO;

public class DanceClassDTO {

	private int schoolNo;
	private String schoolname;
	private int strength;
	
	
	public DanceClassDTO() {
		// TODO Auto-generated constructor stub
		System.out.println(getClass().getSimpleName()+" object is created");
	}


	public int getSchoolNo() {
		return schoolNo;
	}


	public void setSchoolNo(int schoolNo) {
		this.schoolNo = schoolNo;
	}


	public String getSchoolname() {
		return schoolname;
	}


	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}


	public int getStrength() {
		return strength;
	}


	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	@Override
	public String toString() {
		return "School No : " +schoolNo+" ,School Name : "+schoolname+ " , Strength = "+strength;
	}
	
	@Override
	public int hashCode() {
		return schoolNo;
	}
	
	@Override
	
	public boolean equals(Object obj) {
		DanceClassDTO d1 = (DanceClassDTO)obj;
		if(schoolNo == d1.schoolNo)
			return true;
		return false;
		
	}
}
