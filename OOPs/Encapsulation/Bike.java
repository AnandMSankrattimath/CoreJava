/*encapsulation :-- Binding multiple types of data into one object.

rule :
1) class must be public -- access this class to entire application.

2) Atleast one default constructor.

3) class can't be final.

4) all the properties must be private.. --> Not allow to call the properties outside the class directly...

5) togetdata and the tosetdata --> we use getters()---> get the data...(always return the value so cannot be void)...
					 and seters()--> initialize the value for the object --> return type will be void... */


public class Bike{
	private String brand;
	private String colour;
	private float price;
	
	 Bike(){ // default constructor...

		}

	void setBrand(String br){
		brand= br;
	}
	
	String getBrand(){
		return brand;
	}


	void setColour(String col){
		colour = col;
	}

	String getColour(){
		return colour;
	}

	void setPrice(float pri){
		price = pri;
	}
	
	float getPrice(){
		return price;
	}


	public static void main(String [] args){
	
		Bike hero = new Bike();
		hero.setBrand("Hero");
		
		String brandName = hero.getBrand();
		System.out.println(brandName);
	
		hero.setColour("Black");
		String colourName = hero.getColour();
		System.out.println(colourName);

		hero.setPrice(35000.25f);
		float priceValue = hero.getPrice();
		System.out.println(priceValue);
}

}