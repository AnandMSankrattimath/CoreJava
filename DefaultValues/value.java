class 

defaultValue{
		static boolean dvBoolean;  
		static byte dvByte;
		static short dvShort;
		static int dvInt;
		static long dvLong;
		static float dvFloat;
		static double dvDouble;
		static char dvChar;
	public static void main(String [] anand){
		System.out.println(dvBoolean);
		System.out.println(dvByte);
		System.out.println(dvShort);
		System.out.println(dvInt);
		System.out.println(dvLong);

		System.out.println(dvFloat);
		System.out.println(dvDouble);
		System.out.println("dvCharecter values is " + dvChar);
}


}


/* 17-02-2022
-->Default Values are those values that are not initialized by the developer then the compiler will initialize the default values based on the datatype.
-->Compiler will initialize the default values for only static variables not initialize the local variables.....

OUTPUT:---
false
0
0
0
0
0.0
0.0
dvCharecter values is


*/