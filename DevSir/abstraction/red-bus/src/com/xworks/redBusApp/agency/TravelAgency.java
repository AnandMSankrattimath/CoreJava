package com.xworks.redBusApp.agency;

import com.xworks.redBusApp.contract.RedBusContract;

public class TravelAgency {
	//has-a relation
	RedBusContract redBusContract;
	
	static String nameString ="Suguma Travels";
	
	public TravelAgency(RedBusContract redBusContract) {
		this.redBusContract = redBusContract;
	}
	
	public boolean booking(int noOfBooking) {
		boolean booking=true;
		System.out.println("Inside Booking");
		boolean warrenty = redBusContract.warrenty();
		if(warrenty) {
			System.out.println("Checked Warrenty ... please proceed for booking");
			if(noOfBooking <=redBusContract.minBooking()) {
				System.out.println("Booking Successful");
				booking = true;
			}
			else {
				System.out.println("Cannot proceed booking... no of bookings exceeded");
			}
			System.out.println("OutSide Booking");
		}
		return booking;
		
	}

}
