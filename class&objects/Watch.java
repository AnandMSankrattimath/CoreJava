class Watch{
	String brand;
	String type;
	String batteryLife;
	String screenSize;
	String colour;
	String weight;
	String resolution;
	double price;
	String bodyType;
	String countryOfOrigin;

	Watch(String ty,String coo,String br ,String screen,String weit,String col,String bat,String bt,String res,double pri){
	brand =br;
	type = ty;
	batteryLife = bat;
	screenSize = screen;
	colour = col;
	weight = weit;
	resolution =res;
	price = pri;
	bodyType = bt;
	countryOfOrigin = coo;
	} //

	void aboutWatch(){
	System.out.println("Type : "+type);
	System.out.println("CountryOfOrigin : "+countryOfOrigin);
	System.out.println("Brand : "+brand);
	System.out.println("BodyType: "+bodyType);
	System.out.println("Wieght: "+weight);
	System.out.println("Colour : "+colour);
	System.out.println("Battery Capacity : "+batteryLife);
	System.out.println("ScreenSize : "+screenSize);
	System.out.println("Resolution : "+resolution);
	System.out.println("Price : "+price+ "\n");
	}//

	void bluetoothCalling(){
	System.out.println("You can make call & recieve \n");
	}//

	void oxygenMonitoring(){
	System.out.println("You can level of oxygen in your body \n");
	}//

	void heartRateMonitoring(){
	System.out.println("You can monitor your HeartBeat \n");
	}//

	void alarmClock(){
	System.out.println("You can set Alarm \n");
	}//

	void musicPlayer(){
	System.out.println("You can listen Music \n");
	}

	public static void main(String args[]){
	Watch boat = new Watch("SmartWatch" , "INDIA" , "Boat" , "1.6 ", "40 gms" , "Black" , "10 Days" , "Metal"  , "240*240" ,2999.50);
	boat.aboutWatch();
	boat.bluetoothCalling();
	boat.oxygenMonitoring();
	boat.heartRateMonitoring();
	boat.alarmClock();
	boat.musicPlayer();
	}
	


}