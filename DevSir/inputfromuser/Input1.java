package com.xworkz.inputfromuser;

import java.util.Scanner;

public class Input1 {
	public static void main(String[] args) {
		// Take input from user is an important.
		/* To take input from user we need Scanner class which is present in java.util package.
		 * We need to create an object for the Scanner class and its constructor use (System.in)
		 * Scanner class inbuilt method :----
		 * for String ---
		 * next() --> read string type of input. takes only the first string after space it won't aceept.
		 * nextLine()--> takes the whole line string 
		 * 
		 * for Number class --->
		 * byte --> nextByte();
		 * short -->nextShort();
		 * int --> nextInt();
		 * long -->nextLong();
		 * float-->nextFloat();
		 * double -->nextDouble();
		 * boolean -->nextBoolean();
		 * */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name");
		String nameString = scanner.next();
		
		
		System.out.println("Enter the address");
		String addressString = scanner.nextLine();
		
		System.out.println("Enter the age");
		byte age = scanner.nextByte();
		
		System.out.println("Enter the phone number");
		long contactNo = scanner.nextLong();
		
		System.out.println("enter the gender");
		char gender = scanner.next().charAt(0);
		
		System.out.println("Are you surf on the internet (yes/no)");
		char answer = scanner.next().charAt(0);
		char y='y',Y='Y',N='N',n='n';
		if(answer==y || answer==Y) {
			System.out.println("Obiviously....");
		}
		else if(answer==n ||answer==N) {
			System.out.println("pls do....");
		}
		
		System.out.println("your details are : Name = "+nameString+" , Address: "+addressString+" , Age : "+age+" , contactNo : "+contactNo+", Gender : "+gender+" , Answer : "+answer);	
		
		
	}


}
