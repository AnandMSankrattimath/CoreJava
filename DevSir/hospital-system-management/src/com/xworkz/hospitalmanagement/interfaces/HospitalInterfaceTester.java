package com.xworkz.hospitalmanagement.interfaces;

import java.util.Scanner;

import com.xworkz.hospitalmanagement.DTO.PatientDTO;
import com.xworkz.hospitalmanagement.constant.Gender;
import com.xworkz.hospitalmanagement.implementsss.HospitalImpl;

public class HospitalInterfaceTester {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the Size");
	int size = scanner.nextInt();
	
	HospitalImpl hospitalImpl = new HospitalImpl(size);
	
	for (int i = 0; i < size; i++) {
		
		PatientDTO dto = new PatientDTO();
		System.out.println("Enter the patient Id");
		dto.setpId(scanner.nextInt());
		
		System.out.println("Enter the patient Name");
		dto.setpName(scanner.next());
		
		System.out.println("Enter the age");
		dto.setAge(scanner.nextInt());
		
		System.out.println("Enter the address");
		dto.setPtAddrssString(scanner.next());
		
		System.out.println("Enter the patient disease");
		dto.setDiseaseString(scanner.next());
		
		System.out.println("Enter the pateint contact number");
		dto.setpContactNumber(scanner.nextLong());
		
		System.out.println("Enter the gender");
		String genderString = scanner.next();
		dto.setGender(Gender.valueOf(genderString));
		
		hospitalImpl.createPatientDetails(dto);
		
	}
	
	String textString = null;
	
	do {
		System.out.println("Press 1 to get all the patient details at once");
		System.out.println("Press 2 to get patient details by the ID");
		System.out.println("Press 3 to get patient details by the Gender");
		System.out.println("Press 4 to get patient details by the Contact Number");
		System.out.println("Press 5 to get patient details by the Age");
		System.out.println("Press 6 to get patient Name by the ID");
		System.out.println("Press 7 to get patient Id by the Name");
		System.out.println("Press 8 to get patient address by the Name");
		System.out.println("Press 9 to get patient age by the Name");
		System.out.println("Press 10 to get patient Gender by the Name");
		System.out.println("Press 11 to get patient contact No by the Name");
		System.out.println("Press 12 to Update patient contact No by the Name");
		System.out.println("Press 13 to Update patient contact No by the Id");
		System.out.println("Press 14 to delete patient details by the Id");
		
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:System.out.println(" Getting all the Patient Details");
				hospitalImpl.getAllPatientDetails();
				break;
				
		case 2: System.out.println(" Enter the Patient Id");
				hospitalImpl.getpatientById(scanner.nextInt());
				
				break;
				
		case 3: System.out.println("Enter the Gender");		
				String genderString = scanner.next();
				hospitalImpl.getPatientDetailsByGender(Gender.valueOf(genderString));
				break;
				
		case 4:System.out.println("Enter the contact Number");
				hospitalImpl.getPatientDetailsByContactNumber(scanner.nextLong());
			break;
		
		case 5 : System.out.println("Enter the age");
				hospitalImpl.getPatientDetailsByAge(scanner.nextInt());
				break;
		
		case 6:System.out.println("Enter the Id to get the pateint name");
				hospitalImpl.getPatientNameById(scanner.nextInt());
				break;
				
		case 7 : System.out.println(" Enter the Name to get patient ID");
					hospitalImpl.getPatientIdByName(scanner.next());
					break;
			 		
		case 8: System.out.println(" Enter the Name to get the patient Address");
				hospitalImpl.getPatientAddressByPatientName(scanner.next());
				break;
				
		case 9: System.out.println(" Enter the Name to get the patient Age");
				hospitalImpl.getPatientAgeByPatientName(scanner.next());
				break;
			
		case 10: System.out.println(" Enter the name to get the Patient Gender");
				hospitalImpl.getPatientGenderByPatientName(scanner.next());
				break;
				
		case 11: System.out.println(" Enter the name to get the patient Contact number");
				hospitalImpl.getPatientContactNumberByPatientName(scanner.next());
				break;
				
		case 12: System.out.println(" Enter the name and new Contact Number to update the patient Contact Number ");
				hospitalImpl.updateContactNoByPateintName(scanner.nextLong(), scanner.next());
				break;
				
		case 13 : System.out.println(" Enter the Id and new Contact number to update the Patient contact number");
					hospitalImpl.updatePatientContactNumberByPatientId(scanner.nextInt(), scanner.nextLong());
					break;
					
		case 14 : System.out.println(" Enter the Id to delete the Patient details");
					hospitalImpl.deletePatientById(scanner.nextInt());
					break;
		

		default: System.out.println("Enter the correct choice");
			
		}
			System.out.println(" Do you want to continue type yes/no ?");
			textString=scanner.next();
			
		


		
	} while (textString.equalsIgnoreCase("yes"));
	scanner.close();
}
}
