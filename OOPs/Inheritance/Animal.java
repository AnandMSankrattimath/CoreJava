

public class Animal {
			public String name;
			public String typeOfAnimal;
			
			Animal(){
				System.out.println("Invoking Animal class Constructor");
			}
			public void setName(String nm){
				name = nm;
				
			}
			public String getName() {
				return name;
			}
			
			public void setType(String type) {
				typeOfAnimal = type;
			}
			
			public String getType() {
				return typeOfAnimal;	
			}
public static void main(String args[]) {
	 Dog dog1= new Dog();
	 dog1.setName("DOG");
	 System.out.println(dog1.getName());
	 
	 dog1.setType("Loveable");
	System.out.println( dog1.getType());
	dog1.bark();

	Cat c1 = new Cat(); // creating cat class object.
	c1.setName("cat");  // calling animal class properties from cat class(child class) object.
	System.out.println(c1.getName());
	c1.setType("Cute");
	System.out.println(c1.getType());
	c1.meow();          // calling child class (cat class) behaviour. 
		
	}
}

class Dog extends Animal {
		void bark() {
			
			System.out.println( "Dog bark");
		}
}

class Cat extends Animal{
	void meow() {
		System.out.println("It gives the sounds like meow");
	}


	
}


/*
USES::-->
avoids the code rewritten.
use the property already there.

*/