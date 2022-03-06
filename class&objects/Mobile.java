class Mobile{
	String brand;
	String series;
	String battery;
	String camera;
	String colour;
	String storage;
	String processor;
	double price;
	String emi;
	String warrenty;

	Mobile(String br,String ser,String bat,String cam,String col,String stor,String proc,double pri,String em,String warr){
	brand =br;
	series = ser;
	battery = bat;
	camera = cam;
	colour = col;
	storage = stor;
	processor =proc;
	price = pri;
	emi = em;
	warrenty = warr;
	} //

	void aboutMobile(){
	System.out.println("Brand : "+brand);
	System.out.println("Series : "+series);
	System.out.println("Battery Capacity : "+battery);
	System.out.println("Colour : "+colour);
	System.out.println("Storage : "+storage);
	System.out.println("Processor : "+processor);
	System.out.println("Price : "+price);
	System.out.println("EMI : "+emi);
	System.out.println("Warrenty : "+warrenty+ "\n");
	}//

	void playSong(){
	System.out.println("You listen songs \n");
	}//

	void playVideo(){
	System.out.println("You can watch Videos OR Films \n");
	}//

	void playGame(){
	System.out.println("When you feel bore you can play Games \n");
	}//

	public static void main(String args[]){
	Mobile samsung = new Mobile("SAMSUNG","A13","6000mAh","64 pixels","White","8GB RAM 128GB ROM","Quadracore ",12000.50,"5000 rs per month","1Yr Warrenty");
	samsung.aboutMobile();
	samsung.playSong();
	samsung.playVideo();
	samsung.playGame();
	}
	


}