package com.xworkz.DTO.courtcase.courtcaseDTO;

public class CourtCaseDTO {
private int caseNO;
private String petitioner;
private String opponent;

public CourtCaseDTO() {
	System.out.println(getClass().getSimpleName()+" object is created");
}

public int getCaseNO() {
	return caseNO;
}

public void setCaseNO(int caseNO) {
	this.caseNO = caseNO;
}

public String getPetitioner() {
	return petitioner;
}

public void setPetitioner(String petitioner) {
	this.petitioner = petitioner;
}

public String getOpponent() {
	return opponent;
}

public void setOpponent(String opponent) {
	this.opponent = opponent;
}

public String toString() {
	return "Case NO : " +caseNO+" , Petitioner : "+petitioner+" , Opponent : "+opponent;
}

@Override
public int hashCode() {
	
	return caseNO;
}

@Override

public boolean equals(Object obj) {
	CourtCaseDTO cs = (CourtCaseDTO)obj;
	if (caseNO==cs.caseNO)
		return true;
	return false;
	
}
}
