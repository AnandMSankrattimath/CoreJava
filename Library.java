// Access Specifier : 1)private 2)default 3)protected 4)public 
		/*  1) private --- Variable & method can only accessible within the same class
		 *  2) default -->  Did not specify any specifier.Default access specifier for variable and method. Accessible is within the folder/same package.
		 *  3) protected -->
		 *  4)public --> Accessible within the class or folder or inside and outside the package...
		 *  
		 *  able to give access specefiers to  local and parameter variable
		 *  visibility for local and parameter.
		 *  library ex for method overloading....
		 *  how to covert one primitive dt to another data type....
		 *   */
		
		
		
		
		// 1) Yes , we are able to give the access specifiers to local varible and parameter variable.
		// if you are to give the access specifiers or not they will be accessible within the class.
		
		//2)By default local varibables are accessible within the class and within the package/folder.
		
		//3)Library example for method overloading

class Library{
	static void read(){
		System.out.println("You are in Library");
                 }
	static void read(String name){
		System.out.println(name);
		}
	static void read(float price){
		System.out.println(price);
		}
	static void read(char a){
		System.out.println("You are in "+a +" section");
		}

public static void main(String [] args){
	read();
	read("ABC");
	read(25.00f);
	read('A');




}
}



