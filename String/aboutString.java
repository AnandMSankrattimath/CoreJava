// String is a non-primitive datatype which stores the set of charecters. Starting point is 0.
class aboutString{     // Put file name same as a class name....
	static int a=10;
	static int b=20;
	static String string1="Hello";
	static String string2="@@@@@@";
	static boolean boolType=false;
	static float floatType = 1.23f;
	
	public static void main(String [] anand){

	System.out.println( a+b ); 		// Addition of two integers
	System.out.println( string1 + string2); // concatenation of strings
	System.out.println( a + string1); 	// Concatenation of string and integer....
	System.out.println( string2 + boolType); // Concatenation of String and boolean....
	
	//System.out.println( a + boolType);
	
	//System.out.println( floatType + boolType);



}
}

/* 17-02-2022--->

OutPut:----

30
Hello@@@@@@
10Hello
@@@@@@false

*/