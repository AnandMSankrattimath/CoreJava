package com.xworkz.hospitalmanagement;


import com.xworkz.hospitalmanagement.DTO.PatientDTO;

public class Hospital {
public PatientDTO patientDTO[];
int index;

public Hospital(int size) {
	patientDTO = new PatientDTO[size];
	
}

// Create Operations Starts
public boolean createPatientDetails(PatientDTO dto) {
	System.out.println("invoked createPatientDetails()");
	boolean patientAdded = false;
	       if(dto!=null) {
	    	   
		patientDTO[index++] = dto;
	    	patientAdded = true;
	      }
	else {
		System.out.println("No pateint added");
	}
	
	System.out.println("end of createPatientDetails()");
	return patientAdded;
}

// Read Operations Starts
// Read operation on all details...
public void getAllPatientDetails() {
	
	System.out.println("inside getPateintDetails().....");
	for (int i = 0; i < patientDTO.length; i++) {
		System.out.println(patientDTO[i]);
	}
	System.out.println("End of getPateintDTO()......");
	
}

//Read Patient Deatils on the basis Patient Id....
public void getpatientById(int pateintId) {
		System.out.println("inside getpatientById()");
		System.out.println("arg 1 Patient Id"+pateintId);
		for(int i = 0;i<patientDTO.length;i++ ) 
		{
			if(patientDTO[i].getpId()==pateintId) {
				System.out.println(patientDTO[i]);
			}
			else {
				System.err.println("Plz....Enter the correct patient ID");
			}
		}	
}

// Read Patient Details on the basis on the Patient Name...
// PatientDTO getPatientDetailsByName
public void getPatientDetailsByName(String name ) {
	System.out.println("inside getPatientDetailsByName()");
	System.out.println("1st args:PatientName"+name);
	for (int i = 0; i < patientDTO.length; i++) {
		if (patientDTO[i].getpName().equals(name)) {
			System.out.println(patientDTO[i]);
		}
		else {
			System.out.println("Patient not found by the name "+name);
		}
	}
	System.out.println("End of getPatientDetailsByName()");
}

// Read Patient Details on the basis on the Patient gender...
//getPateintDetailsByGender
public void getPatientDetailsByGender(String gender) {
	System.out.println("inside getPatientDetailsByGender()");
	System.out.println("args 1 : Gender "+gender);
	for(int i=0;i<patientDTO.length;i++) {
		if (patientDTO[i].getGender().equals(gender)) {
			System.out.println(patientDTO[i]);
		}
		else {
			System.err.println("Patient not found by the gender "+gender);
		}
	}
	System.out.println("end of getPatientDetailsByGender()");
}


//getPateintDetailsByContactNumber
public void getPatientDetailsByContactNumber(long contactNo) {
	System.out.println("getPatientDetailsByContactNumber");
	System.out.println("args1:ContactNumber"+contactNo);
	for (int i = 0; i < patientDTO.length; i++) {
		if (patientDTO[i].getpContactNumber()==contactNo) {
			System.out.println(patientDTO[i]);
		}
		else {
			System.err.println("Patient not found by the entered contact number "+contactNo);
		}
	}
	System.out.println("end of getPatientDetailsByContactNumber()");
}


//getPateintDetailsByAge
public void getPatientDetailsByAge(int age) {
	System.out.println("inside getPatientDetailsByAge()");
	System.out.println("arg1 : Age "+age);
	
	for(int i=0;i<patientDTO.length;i++) {
		if (patientDTO[i].getAge()==age) {
			System.out.println(patientDTO[i]);
		}
		else {
			System.err.println("Patient not found by the age "+age);
		}
	}
	System.out.println("end of getPatientDetailsByAge()");
}


// nameofPatient getPatientNameById --only the name not all data.

public void getPatientNameById(int pid) {
	System.out.println("inside getPatientNameById()");
	System.out.println("args 1 : PatientId "+pid);
	for (int i = 0; i < patientDTO.length; i++) {
		if (patientDTO[i].getpId()==pid) {
			System.out.println(patientDTO[i].getpName());
		}
		else {
			System.err.println("Parient not found by the Patient Id"+pid);
		}
		System.out.println("end of the getPatientNameById()");
	}
	
}

//patientId getPatientIdByName
public void getPatientIdByName(String nameString) {
	System.out.println("inside getPatientIdByName()");
	System.out.println("args 1 : Patient Name "+nameString);
	for (int i = 0; i < patientDTO.length; i++) {
		if (patientDTO[i].getpName().equals(nameString)) {
			System.out.println(patientDTO[i].getpId());
		}
		else {
			System.err.println("Patient not found by the Patient Name "+nameString);
		}
	}
	System.out.println("end of the getPatientIdByName()");
	}
//patgetPatientAddressByName

public String  getPatientAddressByPatientName(String namString) {
	System.out.println("Inside the getPatientAddressByPatientName()");
	String addressString="";
	System.out.println("args 1 : PatienName "+namString);
	for(int i=0;i<patientDTO.length;i++ ) {
		if(patientDTO[i].getpName().equalsIgnoreCase(namString)) {
			//System.out.println(patientDTO[i].getPtAddrssString());
			addressString=patientDTO[i].getPtAddrssString();
		}
		else {
			System.err.println("Patient not found by the Patient Name "+namString);		}
	}
	System.out.println("end of the getPatientAddressByPatientName()");
	return addressString;

}


//getPatientAgeByName

public void getPatientAgeByPatientName(String nameString) {
	System.out.println("Inside the getPatientAgeByPatientName()");
	System.out.println("args 1 : Pateint Name "+nameString);
	for (int i =0;i<patientDTO.length;i++) {
		if (patientDTO[i].getpName().equalsIgnoreCase(nameString)) {
			System.out.println(patientDTO[i].getAge());
		}
		else {
			System.err.println("Not found the Patient Details by the Pateint Name "+nameString);
		}
	}
	System.out.println("End of the getPatientAgeByPatientName()");
}


//getPatientContactNumberByName-- having return type as long 
public long getPatientContactNumberByPatientName(String nameString) {
	long cnum=0;
	
	System.out.println("Inside getPatientContactNumberByPatientName()");
	System.out.println("args 1 : Patient Name "+nameString);
	for ( int i = 0; i < patientDTO.length; i++) {
		if(patientDTO[i].getpName().equalsIgnoreCase(nameString)) {
			//System.out.println(patientDTO[i].getpContactNumber());
		 cnum =  patientDTO[i].getpContactNumber();
		}
		else {
			System.out.println(" Patient Details not Found by the Patient name"+nameString);
		}
	}
	System.out.println("End of getPatientContactNumberByPatientName()");
	return cnum;
}

//getgenderByPatientName
public void getPatientGenderByPatientName(String nameString) {
	System.out.println("Inside the getPatientGenderByPatientName()");
	System.out.println("args 1 : Patient Name "+nameString);
	for (int i=0;i<patientDTO.length;i++) {
		if(patientDTO[i].getpName().equalsIgnoreCase(nameString)) {
			System.out.println(patientDTO[i].getGender());
		}
		else {
			System.out.println(" Patient not found by the Patient Name "+nameString);
		}
	}
	System.out.println(" End of getPatientGenderByPatientName()");
}

//Update Operations Starts
// Update Contact number by Patient Name
public boolean updateContactNoByPateintName(long contactNo,String patientNameString) {
	System.out.println("Inside updateContactNoByPateintName");
	System.out.println("1st arg :Contact No"+contactNo);
	System.out.println("2nd arg : patentName"+patientNameString);
	boolean isContactNoUpdated = false;
	for (int i = 0; i < patientDTO.length; i++) {
		if (patientDTO[i].getpName().equals(patientNameString)) {
			patientDTO[i].setpContactNumber(contactNo);
				isContactNoUpdated = true;
		}
		else {
			System.err.println("Patient not found by the contact number "+contactNo);
		}
	}
	System.out.println("end of updateContactNoByPateintName()");
	return isContactNoUpdated;
}

//Update contact number by patient id.
public void updatePatientContactNumberByPatientId(int pid,long contactNo) {
	System.out.println("Inside updatePatientContactNumberByPatientId()");
	System.out.println("args 1: Patient Id"+pid);
	System.out.println("args 2 : Patient Contact Number "+contactNo);
	
	for(int i=0;i<patientDTO.length;i++) {
		if (patientDTO[i].getpId()==pid) {
			patientDTO[i].setpContactNumber(contactNo);
		}
		else {
			System.err.println("Patient Not Found by the Patient Id "+pid);
		}
	}
	System.out.println("end of  updatePatientContactNumberByPatientId()");
}



//Delete Operations starts
//Delete Patient Details by the pateint Id
public boolean deletePatientById(int patientId) {
	System.out.println("inside deletePatientById()");
	System.out.println("args 1 : patientId"+patientId);
for (int i = 0; i < patientDTO.length; i++) {
	if (patientDTO[i].getpId() == patientId) {
		
	}
	else {
		System.err.println("Patient not found by the Patient Id "+patientId);
	}
}
return false;
}
}
