package com.xworkz.hospitalmanagement;

import java.util.Scanner;

import com.xworkz.hospitalmanagement.DTO.PatientDTO;
import com.xworkz.hospitalmanagement.constant.Gender;

public class HospitalTest {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the size");
		int size = scanner.nextInt();
			
			Hospital hp = new Hospital(size);
			for(int i=0;i<size;i++) {
			
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
			
			hp.createPatientDetails(dto);

			
		}
			
			
			/*hp.getAllPatientDetails();
			System.out.println("Enter the PatientId");
			int patientId = scanner.nextInt();
			hp.getpatientById(patientId);
			
			System.out.println("Enter the patientName");
			String nameString=scanner.next();
			hp.getPatientAddressByPatientName(nameString);
			
			System.out.println("Enter the Patient Gender");
			String genderString = scanner.next();
			hp.getPatientDetailsByGender(genderString);
			
			
			System.out.println("Enter the patientName");
			String nameString=scanner.next();
			hp.getPatientAgeByPatientName(nameString);
			
			System.out.println("Enter the patientName");
			String nameString=scanner.next();
			hp.getPatientGenderByPatientName(nameString);
			*/
			
			System.out.println("Enter the patientName");
			String nameString=scanner.next();
			long cnumber = hp.getPatientContactNumberByPatientName(nameString);
			System.out.println("Patient contact number is "+cnumber+ " by the Patient Name "+nameString);
			
			String addString=hp.getPatientAddressByPatientName(nameString);
			System.out.println("Patient Address is "+addString+ " by the Patient Name "+nameString);
			
			
		}
}