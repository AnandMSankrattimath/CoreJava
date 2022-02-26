/* Array is a non-primitive datatype of  collection of same type of multiple valuesss.

syntax :---

1)Declaration---
		dataType referenceVariableName []; // Declaration

2)Initialization--
		a) Literals 
			--> referenceVariableName = {value1,value2....value n}; // Each value has the index number starting with 0 number.
		b)






class ArrayList{
		public static void main(String [] arr){
			String names [] = {"HP","Lenovo","Redmi"};
				System.out.println(names); // It will shows the memory location of this array.
			
				System.out.println(names.length);// length would gives the length of that array..

				System.out.println(names[0]); // It would prints the 0 index value.. Syntax :---> names[i]..
				
				
				names[0] = "Anand"; // updating the index 0 with new value anand;

}
}

 REAL WORLD EXAMPLES ARE @@@@--> In E-commerce site the Size of shirt or pant or shoe is an array.
				 Songs playlist in songplayer....
				 Video playlist in Youtube...
				 Watch later in youtube....
				 Eggs in a tray....
				 Car parking place...
				 Bike parking place....
				 Book rack....
				 Librabry or Book List
				 days in week...
				 Seats in Bus or car....
				 Apartments....
				 Set of words...
				 Set of charecters in word.....
				 Score board in any match (cricket)
				 months in a year......
				 Every conversation is an array....
				 No.of Contacts in the mobile....
				 Photos i Gallery....
				 Messages in the Whatsapp or any messaging app....
				 Trending news is an array...
			         
				  
				 
HW TraineesDetails with name,email,dob... 

*/



class aboutArray{
	static String days[] = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};


	public static void main(String Size[]){ // Here, Size[] array is an argument type of an array....
	
	String songsPlayList[] = {"Tum Hi Ho","Guzarish","Sada Kannalli","Jaya Bharath","Jana Gana"};
		System.out.println("No of Songs in my playlist "+songsPlayList.length); // calling local varible
		System.out.println("1st Song in my playlist is "+songsPlayList[0]);
		System.out.println("2nd Song in my playlist is "+songsPlayList[1]);
		System.out.println("3rd Song in my playlist is "+songsPlayList[2]);
		System.out.println("4th Song in my playlist is "+songsPlayList[3]);
		System.out.println("5th Song in my playlist is "+songsPlayList[4]);
		System.out.println("");

		System.out.println("About the week");
	        System.out.println("No.of Days in a week " +days.length);// accessing  static array
		System.out.println("First day in a week is "+days[0]);
		System.out.println("After changes ");
		days[0] = "Sun";
		System.out.println("First day in a week is  "+days[0]);
		System.out.println("");

		System.out.println("About the Argument type of an array");
		System.out.println("List the no.of Sizes in shirts "+Size.length); 
		System.out.println("My Size is "+Size[1]); // accessing the argument type of array
		System.out.println("");

		
		/*String LanguagesInAmazon [] = {"KANNADA","HINDI","ENGLISH","TAMIL","MALAYALAM","TELUGU","BENGALI"};
		System.out.println("How many Langauges are in Amazon e-commerce website "+LanguagesInAmazon.length+ " and they are as follows ");
		for(int i=0;i<LanguagesInAmazon.length;i++)
			{
				System.out.println(LanguagesInAmazon[i]);
			}
			
				int arr[] = {1,2,3,4,5,6};
					for (int i=0;i<=arr.length;i++){
					System.out.println(arr[i]);
				
			
			String language[] = {"Kannada","English","Hindi"};
			for (int j=0;j<language.length;j++){
					System.out.println(language[j]);*/
				
	String name []= {"Anand","Muragayya","Sankrattimath"};
		System.out.println("My name is "+name[2]);	
	 String[] dob={"31051996","01012000","01012001"};
	System.out.println("My date of birth is "+dob[0]);

	String Email[] = {"anandmsmath@gmail.com","anandmsxworks@gmail.com"};
	System.out.println("My Email is "+Email[0]);

		
		
		

}
}