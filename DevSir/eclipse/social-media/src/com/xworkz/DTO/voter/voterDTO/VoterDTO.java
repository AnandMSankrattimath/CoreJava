package com.xworkz.DTO.voter.voterDTO;

public class VoterDTO {

		private String name;
		private String dob;
		private String address;
		private int voterID;
		
		public VoterDTO() {
			System.out.println(this.getClass().getSimpleName()+" object is created");
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDob() {
			return dob;
		}
		public void setDob(String dob) {
			this.dob = dob;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		
		public int getVoterID() {
			return voterID;
		}
		public void setVoterID(int voterID) {
			this.voterID = voterID;
		}
		
		public String toString(){
			return "Voter Details  Name : "+name+" ID :"+voterID+ " DOB : "+dob+ " Address :"+address;
			
		}
		@Override
		public int hashCode() {
			return voterID;
		}
		@Override
		public boolean equals(Object obj) {
			VoterDTO vote1 = (VoterDTO) obj;
				if (voterID == vote1.voterID)
					return true;
				return false;
			
		}
		
		
}
   