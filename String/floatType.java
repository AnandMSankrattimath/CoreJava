class floatType{
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
				float float1 = 1.2f;
				float float2 = 1.2f;
				float float3 = float1+float2;
				System.out.println("Addition of two floats are" +float3); // Addition of floating point.....
				System.out.println(" float value + Bool is " + boolValue+floatValue);
				System.out.println(" float value + short value is " + floatValue+shortValue);
				System.out.println(" float value + intvalue is " + floatValue+ intValue);
				System.out.println(" float value + long value is " + floatValue+longValue);
				System.out.println(" float value + float value is " + floatValue+floatValue);
				System.out.println(" float value + byte value is " + floatValue+ byteValue);
				System.out.println(" float value + char Value is " + floatValue+ charValue);
				System.out.println(" float value + string value is " + floatValue+ stringValue);

							
	
}
}

/*
OUTPUT--->
 Addition of two floats are2.4
 float value + Bool is true1.123456
 float value + short value is 1.12345632000
 float value + intvalue is 1.123456123456789
 float value + long value is 1.123456123456789123456789
 float value + float value is 1.1234561.123456
 float value + byte value is 1.123456120
 float value + char Value is 1.123456@
 float value + string value is 1.123456Anand M Sankrattimath
*/