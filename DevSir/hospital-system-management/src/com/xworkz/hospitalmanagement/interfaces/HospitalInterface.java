package com.xworkz.hospitalmanagement.interfaces;
import com.xworkz.hospitalmanagement.DTO.*;
import com.xworkz.hospitalmanagement.constant.*;
public interface HospitalInterface {
	
	public boolean createPatientDetails(PatientDTO dto); // create data
	
	public void getAllPatientDetails();// Read data all at once
	
	public PatientDTO getpatientById(int pateintId) ;// Read data based on the Id
	
	public PatientDTO getPatientDetailsByGender(Gender gender) ; //Read data based on the gender.
	
	public PatientDTO getPatientDetailsByContactNumber(long contactNo); // Read data based on the contact number
	
	public PatientDTO getPatientDetailsByAge(int age); // Read data based on the age
	
	public String getPatientNameById(int pid); //get Name  based on the ID
	
	public int  getPatientIdByName(String nameString);//get Id  based on the Name
	
	public String  getPatientAddressByPatientName(String namString);//get Address  based on the Name
	
	public int  getPatientAgeByPatientName(String nameString);//get Age  based on the Name
	
	public long getPatientContactNumberByPatientName(String nameString) ;//get Contact Number   based on the name
	
	public void getPatientGenderByPatientName(String nameString) ;//get Gender  based on the Name
	
	public boolean updateContactNoByPateintName(long contactNo,String patientNameString);//Update contact no by Name
	
	public void updatePatientContactNumberByPatientId(int pid,long contactNo);//Update contact no by Id
	
	public boolean deletePatientById(int patientId); //delete patient details by ID

}
