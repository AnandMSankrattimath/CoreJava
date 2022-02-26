/* Naming Standerds 
classname ----> First letter should be Capital (Pascal).
VariableName and methodName ---> camelCase...ex:-- methodName(),variableName...
Variable that is declare with the method() signature is called parameter.
*/

class Addition{
		public static void main(String [] args){
		add();
		add(2,4);
		add("anand","sankrattimath");
}
		static void add(){  // Method declaration and initialization 
		System.out.println("This is addition method without parameter.....");
		}
		
		static void add(int a, int b){
		System.out.println("This is add () with integer parameter");
		System.out.println("Addition is " +a+b);
		}

		static void add(String name, String address){
		System.out.println("This is add () with string parameter");
		System.out.println("Concatenation of two strings are " +name+address);
		}	
}