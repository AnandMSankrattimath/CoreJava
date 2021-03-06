package com.xworkz.string;

public class StringPool {
	
	public static void main(String[] args) {
		// string is a special type of class in java.
		String nameString = "Anand"; // string literals &&& String constant pool
		String nameString3 ="ANAND";
		String nameString2 = new String("Anand"); // using new keyword
		// string objects are immutable with string literals not with new keyword.
		// why it is immutable reason:::(can't modified)
		// nameString ="ABC"; // try to change the string literal but in memory section,
		// now new object will be created  for "ABC";
		//== --> used to compare the reference variables
		//equals()--> used to compare the content/data/value. 
		//System.out.println(nameString==nameString2); // comparing the reference variable. output will be false beacause nameString is referencing the varibale which is in stringpool.
													// nameString2 is heap memory...
	
		//System.out.println(nameString.equals(nameString2));// output will be true.Beacause equals() compare the data/value of the object no matter where they are stored...
	//
	//System.out.println(nameString.equalsIgnoreCase(nameString3));// op: true..
	
	//String nameString = "Anand";  In String Constant Pool both nameString & nameString5 refering the same data.
	//nameString5="Anand"; In StringPool any new object is to be created, first check with the previosly created data if data is same it won't create new object else it will create new object.
	String nullString = "null";
	String nameString4 = null;
	System.out.println(nullString.equalsIgnoreCase(nameString4));//op: false
	System.out.println(nameString4.equalsIgnoreCase(nullString));// null pointer exception
	
	}		
}