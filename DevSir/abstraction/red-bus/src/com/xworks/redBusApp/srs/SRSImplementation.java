package com.xworks.redBusApp.srs;

import com.xworks.redBusApp.contract.RedBusContract;

public class SRSImplementation implements RedBusContract{

	@Override
	public int minBooking() {
	
		return 20;
	}

	@Override
	public boolean warrenty() {
	
		return true;
	}
	

}
