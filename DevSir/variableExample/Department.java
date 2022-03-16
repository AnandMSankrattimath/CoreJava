class Outer{
	 void show(){
	System.out.println("In outer class");
	}

	static class Inner1{
		 void show(){
		System.out.println("In inner class");
		}
		static class Inner2{
			 void show(){
			System.out.println("In Inner2 class");
			}
		}
	}	
}
/*class Outer{
	 void show(){
	System.out.println("In outer class");
	}

	static class Inner1{
		 void show(){
		System.out.println("In inner class");
	}	}
}*/
class Department{
 	public static void main(String []args){
		Outer out=new Outer();
		Outer.Inner1 in1 = new Outer.Inner1();
		Outer.Inner1.Inner2 in2 = new Outer.Inner1.Inner2();
		out.show();	
		in1.show();
		in2.show();

}

}


