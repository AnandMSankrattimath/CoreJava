/* Naming Standerds 
classname ----> First letter should be Capital (Pascal).
VariableName and methodName ---> camelCase...
*/

class Addition{
		public static void main(String [] args){
		add();
		add(2,4);
		add("anand","java");
}
		static void add(){  // Method declaration and initialization 
		System.out.println("This is addition method without parameter.....");
		}
		
		void add(int a, int b){
		System.out.println("This is add () with integer parameter");
		System.out.println(a+b);
		}

		void add(String name, String class){
		System.out.println("This is add () with string parameter");
		System.out.println(name+class)
		}	
}