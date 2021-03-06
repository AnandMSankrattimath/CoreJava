package com.xworkz.DTO.rationcard.RationCardDTO;


public class RationCardDTO {

	
	private String typeOfCard;
	private int id;
	private int noOfMembers;
	private int rationShopNumber;
	private String rationShopAddress;
	private String memberAddress;
	
	
	public RationCardDTO() {
		System.out.println(getClass().getSimpleName()+" object is created");
	}
	
	public String getTypeOfCard() {
		return typeOfCard;
	}
	public void setTypeOfCard(String typeOfCard) {
		this.typeOfCard = typeOfCard;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNoOfMembers() {
		return noOfMembers;
	}
	public void setNoOfMembers(int noOfMembers) {
		this.noOfMembers = noOfMembers;
	}
	public int getRationShopNumber() {
		return rationShopNumber;
	}
	public void setRationShopNumber(int rationShopNumber) {
		this.rationShopNumber = rationShopNumber;
	}
	public String getRationShopAddress() {
		return rationShopAddress;
	}
	public void setRationShopAddress(String rationShopAddress) {
		this.rationShopAddress = rationShopAddress;
	}
	public String getMemberAddress() {
		return memberAddress;
	}
	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}
	
	  public String toString(){
		 return "Ration Card Details --> ID : " +id+   "\n  Type of Card : "+typeOfCard+" \n Number of Members : "+noOfMembers+" \n RationShop Number :"+rationShopNumber+" \n RationShopAddress :" +rationShopAddress+" \n CardHolderAddress : " +memberAddress ;
	 }
	@Override
	public int hashCode() {
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		RationCardDTO r1 = (RationCardDTO)obj;
		if(id == r1.id)
			return true;
		return false;
		
	}
		
}
