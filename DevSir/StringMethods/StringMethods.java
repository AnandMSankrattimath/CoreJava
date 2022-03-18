
public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String name = "Anand";
			String name2 = "Anand";
			// name is reference variable of String datatype name;
			// referenceVariableName.StringMethods();
			System.out.println(name.length()); // returns the length/size of the String. String supports the index number and index number always starts with the 0.
			
			String name1 = "Anand Muragayya sankrattimath";
			System.out.println(name1.length());
			
			System.out.println(name1.toLowerCase()); // converts lowercase returns the String.
			System.out.println(name1.toUpperCase()); // converts the uppercase returns the string
			
			System.out.println(name.indexOf('a')); // returns the position/index number of the given charecter.(accept charecter)...  
			System.out.println(name.indexOf('A'));
			System.out.println(name.indexOf("an"));// applies on string also
			System.out.println(name.indexOf('n', 2)); // Starts the searching from index number 2...
			System.out.println(name.lastIndexOf('d'));
			
			System.out.println(name.charAt(0)); // returns the character at the particular index number.(Accept --> number && Returns --> char)
			System.out.println(name.charAt(4)); // if the position is not present it will throw an exception called "arrayindexoutofbound".
			
			String name3 = "             anand                                    ";
			System.out.println(name3.trim()); // removes the leading spaces.(Accept --> string && returns -->String).
			
			
		System.out.println(name1.substring(6)); // returns the substring from the main string (Accept -->indexNumber && Returns -->SubString);
		System.out.println(name1.substring(6, 16)); // returns substring from begin index number to end index number.
		
		System.out.println(name.replace('n', 'm')); // replace the charecter at the particular charecter. oldchar & new char (Accept --> oldchar & newChar && Returns  --> replaced string).
		System.out.println(name1.replace('a', 'h')); // replace the oldchar to new char wherever oldchar is present. (Accept -->oldchar/ string & new char / string && Returns --> replaced String);
		
		
		System.out.println(name.startsWith("Ana")); // checks whether the String starts with particular string or not. (Accept -->String && Return -->boolean value)
		System.out.println(name.startsWith("mna"));
		System.out.println(name.endsWith("nd"));
		System.out.println(name.endsWith("md"));
		
		System.out.println(name.equals("anand")); //compare existing string to new string.(case sensitivity matters) Accept -->String && Returns -->boolean value)..
		System.out.println(name.equalsIgnoreCase("anand")); // comapre two strings and ignore the case sensitivity..
		
	}
	

}
