package com.xworks.redBusApp;

import com.xworks.redBusApp.agency.TravelAgency;
import com.xworks.redBusApp.contract.RedBusContract;
import com.xworks.redBusApp.srs.SRSImplementation;

public class RedBusTester {
	public static void main(String[] args) {
		RedBusContract redBusContract = new SRSImplementation();
		
		// abstraction
		TravelAgency agency = new TravelAgency(redBusContract);
		agency.booking(4);
		
	}

}
