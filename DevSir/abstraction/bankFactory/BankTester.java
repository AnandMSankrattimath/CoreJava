package com.xworkz.oops.abstraction.bankFactory;

public class BankTester {
		public static void main(String[] args) {
			AtmCardinterface atm1 = new AxisBankImpl();
			atm1.Cardswap();
			
			AtmCardinterface atm2 = new SBIBankImpl();
			atm2.Cardswap();
			
			AtmCardinterface atm3 = new ICICIBankImpl();
			atm3.Cardswap();
			
			AtmCardinterface atm4 = new KVGBankImpl();
			atm4.Cardswap();
			
			AtmCardinterface atm5 = new KarnatakaBankImpl();
			atm5.Cardswap();
		}
}
