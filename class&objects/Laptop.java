class Laptop{
	String brand;
	String series;
	String type;
	String operatingSystem;
	String colour;
	String storage;
	String ssd;
	double price;
	String emi;
	String warrenty;

	Laptop(String br,String ser,String ty,String os,String stor,String col,String sd,double pri,String em,String warr){
	brand =br;
	series = ser;
	type = ty;
	operatingSystem = os;
	colour = col;
	storage = stor;
	ssd = sd;
	price = pri;
	emi = em;
	warrenty = warr;
	} //

	void aboutLaptop(){
	System.out.println("Brand : "+brand);
	System.out.println("Series : "+series);
	System.out.println("Type : "+type);
	System.out.println("OperatingSystem : "+operatingSystem);
	System.out.println("Colour : "+colour);
	System.out.println("Storage : "+storage);
	System.out.println("SSD : "+ssd);
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
	Laptop hp = new Laptop("HP","Note","Gaming","Windows 11","White","8GB RAM 1TB HDD","500GB",55000.50,"5000 rs per month","1Yr Warrenty");
	hp.aboutLaptop();
	hp.playSong();
	hp.playVideo();
	hp.playGame();
	}
	


}