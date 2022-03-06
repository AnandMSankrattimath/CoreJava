class Airport{
	private String name;
	private String type;
	private String location;
	private double area;
	private double revenue;
	private double funds;
	private int runways;
	private String facility;
	private String security;
	private String services;

	Airport(){System.out.println("Details about "+name+" "+type+" airport");}
	void setProperty(String nm,String ty,String loc,double ar,double rev,double fund,int run,String fac,String sec,String ser)
	{
	name = nm;
	type = ty;
	location = loc;
	area = ar;
	revenue = rev;
	funds = fund;
	runways = run;
	facility = fac;
	security = sec;
	services = ser; 
	}

	String[] getProperty()
	{
		String prop[]={name,type,location,Double.toString(area),Double.toString(revenue),Double.toString(funds),Integer.toString(runways), facility, security, services};
			return prop; 
	}

	
	public static void main(String [] args) {
		Airport kemp= new Airport();
		kemp.setProperty("Kempegoud","International","Bangalore",33.3,44.3,22.3,12,"Many Facility","Top Security","Many Services");
		String property [] = kemp.getProperty();
		for(int i=0;i<property.length;i++)
		{
			System.out.println(property[i]);
		}
	}

	
}
