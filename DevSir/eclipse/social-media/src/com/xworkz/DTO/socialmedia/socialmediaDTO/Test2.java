package com.xworkz.DTO.socialmedia.socialmediaDTO;

public class Test2 {
	
	Test2(){
		 //this(); // complie time error --> recursion error
		int i=1;
		System.out.println(++i);
	Test2 test = new Test2(); // runtime error i.e stackoverflow...
		//System.out.println(test);
	}
	
	public static void main(String[] args) {
		Test2 test3 = new Test2();
	System.out.println(test3);
	}

}
