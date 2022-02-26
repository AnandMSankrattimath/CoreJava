class intType{
		static boolean boolValue =true;
		static byte byteValue = 120;
		static short shortValue = 32000;
		static int intValue = 10;
		static int a = 12;
		static long longValue = 100l;
		static float floatValue = 1.123456f;
		static double doubleValue = 1.123456789123456789d;
		static char charValue = '@';
		static String stringValue = "Anand M Sankrattimath";
		
		public static void main(String [] anand){
				System.out.println(" int value + Bool value is " + intValue+boolValue);
				System.out.println(" int value + short value is " + intValue+shortValue);
				System.out.println(" int value + long value is " + intValue +longValue);
				System.out.println(" int value + int value is " + intValue +intValue);          // concatenation of Int Type Values
					        int b = intValue + a;
				             System.out.println("    Addition is   " +b);                                 // Addition of Inttype values....
				System.out.println(" int value + float value is " + intValue +floatValue);
				System.out.println(" int value + byte value is " + intValue + byteValue);
				System.out.println(" int value + char Value is " + intValue + charValue);
				System.out.println(" int value + string value is " + intValue + stringValue);
				

							
	
}
}


/*
OUTPUT----->
int value + Bool value is 10true
 int value + short value is 1032000
 int value + long value is 10100
 int value + int value is 1010
    Addition is   22
 int value + float value is 101.123456
 int value + byte value is 10120
 int value + char Value is 10@
 int value + string value is 10Anand M Sankrattimath

*/