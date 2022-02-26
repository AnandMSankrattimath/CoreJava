class institute {
		static char name = 'X';
	public static void main(String [] anand){	
		// variable is used to stores the data. 
		int strengthOfStudents; // variable declaration    syntax : datatype referenceVariableName 
		strengthOfStudents=10;  // variable initialization syntax : referenceVariableName = value;
		System.out.println(strengthOfStudents);
		boolean attend = true;
		System.out.println(attend);
		long ok = 123456789123456789l;
		int a = (int)ok;
		System.out.println(name); // Calling static variable in the method.
		System.out.println(a);
		

	}


}

/* 16-02-2022
variable has 4 types:
1) local var-- Declare inside the class and method.
2) static var -- Declare inside the class but outside the method.Using keyword 'static'.
3) instance var--
4) Parameter var-- 
*/