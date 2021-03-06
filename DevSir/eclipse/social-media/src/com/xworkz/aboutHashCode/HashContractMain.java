package com.xworkz.aboutHashCode;
public class HashContractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashContract h1 = new HashContract();
		h1.setId(12);
		h1.setNameString("Anand");
		
		HashContract h2 = new HashContract();
		h2.setId(13);
		h2.setNameString("Anand");
		
		System.out.println("Shallow Compare is "+(h1 == h2)); 
		// Even object h1 and h2 having the same values the output will be false beacause here, we are comparing not the values instead
		// we are comparing the memory location new keyword always allocates the new memory location for the object.
		
		System.out.println("Deep Compare " +(h1.equals(h2)));
	}

}
