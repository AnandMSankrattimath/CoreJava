/*1) ticketdetails
2) car
3) flowers
4) Airport
5) games*/

class Ticket{
	private String dept;
	private String originPoint;
	private String destinationPoint;
	private String date;
	private String time;
	private float totalPrice;
	private int noOfMembers;
	private float ratePerHead;
	private String nameofPassenger;
	private int age;
	private long contactNumber;


	Ticket(){}
	
	void setDept(String deptName){
		dept = deptName;
	}

	String getDept(){
		return dept;
	}
	

	void setOriginPoint(String op){
		originPoint = op;
	}
	
	String getOriginPoint(){
		return originPoint;
	}


	void setDestinationPoint(String dp){
		destinationPoint = dp;
	}

	String getDestinationPoint(){
		return destinationPoint;
	}	

	void setDate(String dt){
		date = dt;
	}
	
	String getDate(){
		return date;
	}

	void setTime(String tm){
		time = tm;
	}

	String getTime(){
		return time;
	}

	void setNoOfMembers(int nom){
		noOfMembers = nom;
	}

	int getNoOfMembers(){
		return noOfMembers;
	}

	void setRatePerHead(float rph){
		ratePerHead = rph;
	}

	float getRatePerHead(){
		return ratePerHead;
	}

	

	float getTotalPrice(){
		float result = noOfMembers * ratePerHead;
		totalPrice = result;
		return totalPrice;
		
	}

	void setNameOfPassenger(String nop){
		nameofPassenger = nop;
	}

	String getNameofPassenger(){
		return nameofPassenger;
	}

	void setAge(int ag){
		age = ag;
	}
	
	int getAge(){
		return age;
	}
	
	void setContactNumber(long cn){
		contactNumber = cn;
	}

	long getContactNumber (){
		return contactNumber;
	}


	public static void main(String []arg){
		Ticket railway = new Ticket();
		System.out.println("Details about the Ticket");
		railway.setDept("RAILWAY");
		System.out.println(railway.getDept());
		railway.setOriginPoint("Bangalore");
		System.out.println(railway.getOriginPoint());
		railway.setDestinationPoint("Bagalkot");
		System.out.println(railway.getDestinationPoint());
		railway.setDate("12/12/12");
		System.out.println(railway.getDate());
		railway.setTime("12:12:12");
		System.out.println(railway.getTime());
		railway.setNoOfMembers(3);
		System.out.println(railway.getNoOfMembers());
		railway.setRatePerHead(250.50f);
		System.out.println(railway.getRatePerHead());
		System.out.println(railway.getTotalPrice());
		railway.setNameOfPassenger("Anand");
		System.out.println(railway.getNameofPassenger());
		railway.setAge(19);
		System.out.println(railway.getAge());
		railway.setContactNumber(9740935575l);
		System.out.println(railway.getContactNumber());
		
		
		
	}
}