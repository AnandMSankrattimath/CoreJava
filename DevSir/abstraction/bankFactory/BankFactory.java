package com.xworkz.oops.abstraction.bankFactory;

public class BankFactory {
	public static AtmCardinterface getDetails(String type) {
		if(type.equalsIgnoreCase("AxisBank")) {
			AxisBankImpl axisBankImpl = new AxisBankImpl();
			return axisBankImpl;
		}
		else if(type.equalsIgnoreCase("Sbi Bank")) {
			SBIBankImpl sbiBankImpl = new SBIBankImpl();
			return sbiBankImpl;
		}
		
		else if (type.equalsIgnoreCase("ICICI Bank")) {
			ICICIBankImpl iciciBankImpl = new ICICIBankImpl();
			return iciciBankImpl;
		}
		
		else if (type.equalsIgnoreCase("KVG Bank")) {
			KVGBankImpl kvgBankImpl = new KVGBankImpl();
			return kvgBankImpl;
		}
		
		else if (type.equalsIgnoreCase("Karnataka Bank")) {
			KarnatakaBankImpl karnatakaBankImpl = new KarnatakaBankImpl();
			return karnatakaBankImpl;
		}
		return null;
	}

}
