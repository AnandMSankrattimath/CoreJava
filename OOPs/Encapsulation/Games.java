class Games{
	private String name;
	private String type;
	private int noOfPlayer;
	private String tools;
	private String rules;
	private String stratergy;
	
	Games(){
		
	}

	void setProperty(String nm,String ty,int nop,String tool,String rule,String strat){
		name = nm;
		type = ty;
		noOfPlayer = nop;
		tools = tool;	
		rules = rule;
		stratergy = strat;
		System.out.println("Details about the "+name);
	}

	String [] getProperty()
	{
		String prop[] = {name,type,Integer.toString(noOfPlayer),tools,rules,stratergy};
		return prop;
	}

	public static void main(String args[]){
		Games cricket = new Games();
		cricket.setProperty("Cricket","Outdoor",11,"Bat Ball Stump","Many rules are there","Bat first");
		String property[] = cricket.getProperty();
		
		for(int i=0;i<property.length;i++)
		{
			System.out.println(property[i]);
		}
	}

}