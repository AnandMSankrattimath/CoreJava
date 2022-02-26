class Morning{
	static void breakFast(){
		System.out.println("I had BreakFast");
		}
	static void breakFast(String name){
		System.out.println("I had " +name +" in the beakfast");
		}
	static void breakFast(String name,double price){
		System.out.println("I had "+name+ " in the breakfast and it's price is "+price);
		}
	static double breakFast(String name,double price,int noOfMembers){
		System.out.println("We were " +noOfMembers+" members we had the breakfast " +name+ " and price per plate was " +price);
		
		double totalPrice = price*noOfMembers;
		System.out.println("The total bill was "+totalPrice);
		double perHeadPrice = totalPrice/noOfMembers;
		
		return perHeadPrice;
		}

	public static void main(String []args){
		breakFast();
		breakFast("Rice");
		breakFast("Idly",20.00);
		double ratePerHead = breakFast("Rice",25.99,3);
		System.out.println("Rate per Head is " +ratePerHead);
}
}