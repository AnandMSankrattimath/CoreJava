package com.xworkz.WrapperClass;

import java.sql.SQLIntegrityConstraintViolationException;

public class WrapperClass {
	public static void main(String[] args) {
		
	
	int i = 10;
	
	//Boxing - converting primitive datatype to corosponding its non-primitive datatype.
	// Java understand class & object. 
	// At compile time Class
	//At runtime object..
	Integer i1 = i;//auto-boxing

System.out.println(i1.toString());
// System.out.println(i.toString()); Cannot invoke toString() to primitive datatype...
byte b = 20; // here, b is a reference variable of type byte(primitive).
Byte byte1 = b; // here,byte1 is reference variable or object of type Class(non-primitive).
System.out.println(byte1.toString());
System.out.println(byte1.hashCode());

short s = 10;
Short short1 = s;
System.out.println(short1.toString());
System.out.println(short1.hashCode());

long l = 123456789l;
Long long1 = l;
System.out.println(long1.toString());
System.out.println(long1.hashCode());

float f = 1.2345f;
Float float1 = f;
System.out.println(float1.toString());
System.out.println(float1.hashCode());

double d = 1.123456789;
Double double1 = d;
System.out.println(double1.toString());
System.out.println(double1.hashCode());

boolean bool= true;
Boolean boolean1 = bool;
System.out.println(boolean1.toString());
System.out.println(boolean1.hashCode());

// parsing is refer to String. String to primitive datatype;
Number number1 = new Byte(b); //polymorphism
Number number2 = new Short(s);
Number number3 = new Integer(i);
Number number4 = new Float(1.25f);


//Unboxing -- Wrapper class to corrosponding primitive datatype
Integer integer = 10;
         int integer1  = integer.intValue(); //Unboxing 
         int integer2 = integer; // auto-unboxing..
         
Byte b1 = 10;
byte bytevalue = b1.byteValue();

Short short2 = 12;
short shortvalue = short2.shortValue();

Long long2 = 123456789l;
long longvalue = long2.longValue();

Boolean boolean2 = false;
boolean booleanvalue = boolean2.booleanValue();

Float float2 = 12.233f;
float floatvalue = float2.floatValue();

Double double2 = 12.23456789;
double doublevalue = double2.doubleValue();

Character character = 'a';
char charvalue = character.charValue();

  System.gc();

}
}