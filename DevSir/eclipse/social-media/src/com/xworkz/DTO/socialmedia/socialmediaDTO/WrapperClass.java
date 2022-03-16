package com.xworkz.DTO.socialmedia.socialmediaDTO;

import java.awt.Taskbar;

public class WrapperClass {
// for each primitive type we have corrosponding wrapper class.
	// Java is not purely object oriented langauge to make this purely we have wrapper class.
	/*
	 * primitive datatype						WrapperClass
	 * byte												Byte
	 * 
	 * short											Short
	 * 
	 * int												Integer
	 * 
	 * long												Long
	 *
	 * 
	 * float											Float
	 * 
	 * double											Double	
	 * 
	 * char												Charecter
	 * 
	 * boolean											BooleaN
	 * 
	 * wrapper class uses:--
	 * 1)to make java as a purely object oriented
	   2) to convert non-primitive to primitive type.
	 * 
	 * task :
	 * convert string to non primitive data type.
	 * 
	 * */
	
	
	public WrapperClass() {
		System.out.println(getClass().getSimpleName()+" object is created");
	}
	
	
	public static void main(String[] args) {
		
	
	 // parsing is a process of converting string type to corresponding datatype or primitive datatype.
	
	
	String ageInString  = "20";
	byte age = Byte.parseByte(ageInString);
	System.out.println(age);
	  
	String shortValueString = "32000";
	short shrtValueInNumber =Short.parseShort(shortValueString);
	System.out.println(shrtValueInNumber);
	
	String intString = "20000000";
	int intValueInNumber = Integer.parseInt(intString);
	System.out.println(intValueInNumber);
	
	String phoneNumber= "7975588346";
	long contactNo = Long.parseLong(phoneNumber);
	System.out.println(contactNo);
	
	String flotString = "2.555";
	float floatValueInDecimal = Float.parseFloat(flotString);
	System.out.println(floatValueInDecimal);
	
	String doubleString = "2.555555555555";
	double doubleValueIndecimal = Double.parseDouble(doubleString);
	System.out.println(doubleValueIndecimal);
	
	String isAliveString = "true";
	boolean isAlive = Boolean.parseBoolean(isAliveString);
	System.out.println(isAlive);
	
	
	
	}
	
	
	
	
}

