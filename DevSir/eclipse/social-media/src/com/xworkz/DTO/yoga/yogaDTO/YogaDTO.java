package com.xworkz.DTO.yoga.yogaDTO;

public class YogaDTO {
	
	private int yogaCenterNo;
	private String nameString;
	private String timingString;
	private String typeOfClassString;
	public YogaDTO() {
		System.out.println(this.getClass().getSimpleName()+" object is created");
	}
	public int getYogaCenterNo() {
		return yogaCenterNo;
	}
	public void setYogaCenterNo(int yogaCenterNo) {
		this.yogaCenterNo = yogaCenterNo;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public String getTimingString() {
		return timingString;
	}
	public void setTimingString(String timingString) {
		this.timingString = timingString;
	}
	public String getTypeOfClassString() {
		return typeOfClassString;
	}
	public void setTypeOfClassString(String typeOfClassString) {
		this.typeOfClassString = typeOfClassString;
	}
	@Override
	public String toString() {
		return "YogaDTO [yogaCenterNo=" + yogaCenterNo + ", nameString=" + nameString + ", timingString=" + timingString
				+ ", typeOfClassString=" + typeOfClassString + "]";
	}
	@Override
	public int hashCode() {
		return yogaCenterNo;
	}
	@Override
	public boolean equals(Object obj) {
		YogaDTO yoga1 = (YogaDTO) obj;
		if (yogaCenterNo == yoga1.yogaCenterNo)
			return true;
		return false;
	}
	
	

}
