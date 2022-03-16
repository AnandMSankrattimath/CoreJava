package com.xworkz.DTO.atm.atmDTO;

public class ATMDTO {
	
	private String typeOfCard;
	private int deposite;
	private int witdrawal;
	
	public ATMDTO(){
		System.out.println(getClass().getSimpleName()+" type of a class");
	}

	

	public String getTypeOfCard() {
		return typeOfCard;
	}

	public void setTypeOfCard(String typeOfCard) {
		this.typeOfCard = typeOfCard;
	}

	public int getDeposite() {
		return deposite;
	}

	public void setDeposite(int deposite) {
		this.deposite = deposite;
	}

	public int getWitdrawal() {
		return witdrawal;
	}

	public void setWitdrawal(int witdrawal) {
		this.witdrawal = witdrawal;
	}
	
	public String toString(){
		return "Type Of Card : "+typeOfCard+ ", Deposite : "+deposite+", Withdrawl : "+witdrawal;
		
	}
	@Override
	public int hashCode() {
		System.out.println("hashcode value "+deposite);
		return deposite;
	}
	
	@Override
	 public boolean equals(Object obj) {
		ATMDTO a1 = (ATMDTO)obj;
		System.out.println("equals method value "+a1.getWitdrawal());
		if(deposite==a1.getWitdrawal())
			return true;
		return false;
		
	}
	

}
