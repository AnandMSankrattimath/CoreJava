package com.xworkz.oops.abstraction.lightFactory;

public class LightTester {
	
	public static void main(String[] args) {
		/*TubeLightImpl tubeLightImpl = new TubeLightImpl();
		tubeLightImpl.sOff();
		*/
		SwitchInterface switchInterface1=new TubeLightImpl();
		switchInterface1.sOn();
		switchInterface1.sOff();
		
		SwitchInterface switchInterface2 = new CFLBulbImpl();
		switchInterface2.sOn();
		switchInterface2.sOff();
	

}
}