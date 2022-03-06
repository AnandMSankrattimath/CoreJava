 class Car{
	String type;
	String brand;
	String sereies;
	String color;
	int seaters;
	double price;
	String milage;
	boolean doorType;
	boolean sunRoof;
	
	Car(String ty,String br,String ser,String col,int seat,double pr,String mil,boolean dt,boolean sr){
		type = ty;
		brand = br;
		sereies = ser;
		color = col;
		seaters = seat;
		price = pr;
		milage = mil;
		doorType = dt;
		sunRoof = sr;		

         }

	void basicDetails(){
	System.out.println("Brand : "+brand);
	System.out.println("Type : "+type);
	System.out.println("Sereies : "+sereies);
	System.out.println("Color : "+color);
	System.out.println("Price : "+price);
	}

	void otherFeatures(){
	System.out.println("Milage : "+milage);
	
	}

	void aboutDoor(){
	if(doorType == true){
		System.out.println("Automatic Door System");
	}
	else{
		System.out.println("Manual Door System");
	}
	}

	void aboutSunRoof(){
	if(sunRoof == true){
		System.out.println("SunRoof System is Present");
	}
	else{
		System.out.println("SunRoof System is Absent \n");
	}
	}
	
public static void main(String []args){
	Car mahindra = new Car("Driver","Mahindra","XUV","black",5,500000.50,"10.5km",true,false);
	mahindra.basicDetails();
	mahindra.otherFeatures();
	mahindra.aboutDoor();
	mahindra.aboutSunRoof();
	
	Car tata = new Car("Automatic","TATA","Harrier","Brown",7,1000000.50,"12.3km",true,true);
	tata.basicDetails();
	tata.otherFeatures();
	tata.aboutDoor();
	tata.aboutSunRoof();

}
	

}