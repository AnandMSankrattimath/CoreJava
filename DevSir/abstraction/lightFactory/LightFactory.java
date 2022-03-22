package com.xworkz.oops.abstraction.lightFactory;

public class LightFactory {

	public static SwitchInterface getLight(String type) {
		if(type.equalsIgnoreCase("tubelight")) {
			TubeLightImpl tubeLightImpl = new TubeLightImpl();
			return tubeLightImpl;
		}
		else if(type.equalsIgnoreCase("C")){
			CFLBulbImpl cflBulbImpl = new CFLBulbImpl();
			return cflBulbImpl;
		}
		
		
		return null;
	}
	
}
