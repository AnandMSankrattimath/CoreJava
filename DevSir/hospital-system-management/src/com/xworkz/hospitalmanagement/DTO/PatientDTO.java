package com.xworkz.hospitalmanagement.DTO;

import com.xworkz.hospitalmanagement.constant.Gender;

public class PatientDTO {
		private String pName;
		private int pId;
		private String ptAddrssString;
		private long pContactNumber;
		private int age;
		private String diseaseString;
		private Gender gender;
		
		public Gender getGender() {
			return gender;
		}
		public void setGender(Gender gender) {
			this.gender = gender;
		}

		
		public PatientDTO() {
			System.out.println("invoking PatientDTO Class");
		}
		public String getpName() {
			return pName;
		}
		public void setpName(String pName) {
			this.pName = pName;
		}
		public int getpId() {
			return pId;
		}
		public void setpId(int pId) {
			this.pId = pId;
		}
		public String getPtAddrssString() {
			return ptAddrssString;
		}
		public void setPtAddrssString(String ptAddrssString) {
			this.ptAddrssString = ptAddrssString;
		}
		public long getpContactNumber() {
			return pContactNumber;
		}
		public void setpContactNumber(long pContactNumber) {
			this.pContactNumber = pContactNumber;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getDiseaseString() {
			return diseaseString;
		}
		public void setDiseaseString(String diseaseString) {
			this.diseaseString = diseaseString;
		}
		
		@Override
		public String toString() {
			return "PatientDTO [pName=" + pName + ", pId=" + pId + ", ptAddrssString=" + ptAddrssString
					+ ", pContactNumber=" + pContactNumber + ", age=" + age + ", diseaseString=" + diseaseString + "]";
		}
		
		/*public void getDetails() {
			System.out.println(getpId()+getpName()+getAge()+getPtAddrssString()+getpContactNumber()+getDiseaseString());
		*/}
		
		

