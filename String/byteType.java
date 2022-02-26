class byteType{
		static boolean boolValue =true;
		static byte byteValue = 120;
		static short shortValue = 32000;
		static int intValue = 123456789;
		static long longValue = 123456789123456789l;
		static float floatValue = 1.123456f;
		static double doubleValue = 1.123456789123456789d;
		static char charValue = '@';
		static String stringValue = "Anand M Sankrattimath";
		
		public static void main(String [] anand){
				System.out.println("Byte + Bool is " + byteValue+boolValue);
				System.out.println(byteValue+shortValue);
				System.out.println(" byte value + intvalue is " + byteValue + intValue);
				System.out.println(" byte value + long value is " + byteValue+longValue);
				System.out.println(" byte value + float value is " + byteValue+floatValue);
				System.out.println(" byte value + byte value is " + byteValue + byteValue);
				System.out.println(" byte value + char Value is " + byteValue + charValue);
				System.out.println(" byte value + string value is " + byteValue + stringValue);

							
	
}
}

/* OUTPUT----->
	
 Byte + Bool is true120
 byte value + short value is 12032000
 byte value + intvalue is 120123456789
 byte value + long value is 120123456789123456789
 byte value + float value is 1201.123456
 byte value + byte value is 120120
 byte value + char Value is 120@
 byte value + string value is 120Anand M Sankrattimath
*/