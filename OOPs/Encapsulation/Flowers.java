class Flowers{
	private String name;
	private int price;
	private int petals;
	private String originContry;
	private String uses;
	
	Flowers(){
		System.out.println("Some Details about the Flowers");
	}
	
	void setProperty(String nm,int pri,int pet,String oc,String use){
		name = nm;
		price = pri;
		petals = pet;
		originContry = oc;
		uses = use;
	}
	
	String[] getProperty(){ // can return array[] as a return type..
		 String prop[] = {name,Integer.toString(price),Integer.toString(petals),originContry,uses};
		         return prop;     // multiple return can't be performed in single block.
		
		
	}

	public static void main(String arg[]){
	Flowers	rose = new Flowers();
		rose.setProperty("Rose",10,8,"India","Uses many functions");
		String property[] = rose.getProperty();
		for (int i=0;i<property.length;i++){
		System.out.println(property[i]);
		}
		
}		
}