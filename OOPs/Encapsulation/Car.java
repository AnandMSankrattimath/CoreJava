class Car{
	private String type;
	private  String brand;
	private  String sereies;
	private  String color;
	private  int seaters;
	private  double price;
	private  String milage;
	private String doorType;
	private String sunRoof;
	private int wheels;

	Car(){ 
	System.out.println("Deatails about the "+brand+ sereies+ "car");  
	 }

	void setType(String ty){
		type = ty;
	}

	String getType(){
		return type;
	}
	
	void setBrand(String br){
		brand = br;
	}

	String getBrand(){
		return brand;
	}

	void setSereies(String ser){
		sereies = ser;
	}
	
	String getSereies(){
		return sereies;						
	}

	void setColor(String col){
		color = col;
	}

	String getColor(){
		return color;
	} 

	void setSeaters(int seat){
		seaters = seat;
	}

	int getSeaters(){
		return seaters;
	}

	void setPrice(Double pri){
		price = pri;
	}
	
	double getPrice(){
		return price;
	}

	void setMilage(String mil){
		mil = milage;
	}

	String getMilage(){
		return milage;
	}

	void setDoorType(String dt){
		doorType = dt;
	}

	String getDoorType(){
		return doorType;
	}

	void  setSunRoof(String sr){
		sunRoof = sr;
	}

	String getSunRoof(){
		return sunRoof;
	}

	void setWheels(int whl){
		wheels = whl;
	}

	int getWheels(){
		return wheels;
	}	


	



	public static void main(String []ar){

		Car tata = new Car();
		tata.setBrand("TATA");
		System.out.println(tata.getBrand());
		tata.setType("Manual");
		System.out.println(tata.getType());
		tata.setSereies("Harrier");
		System.out.println(tata.getSereies());
		tata.setColor("brown");
		System.out.println(tata.getColor());
		tata.setSeaters(7);
		System.out.println(tata.getSeaters());
		tata.setPrice(1500000.57);
		System.out.println(tata.getPrice());
		tata.setMilage("12kmh");
		System.out.println(tata.getMilage());
		tata.setDoorType("Automatic");
		System.out.println(tata.getDoorType());
		tata.setSunRoof("SunRoof is Present");
		System.out.println(tata.getSunRoof());
		tata.setWheels(4);
		System.out.println(tata.getWheels());
		
}
}